package org.xtext.example.domainmodel.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.domainmodel.domainmodel.Define;
import org.xtext.example.domainmodel.domainmodel.DomainmodelPackage;
import org.xtext.example.domainmodel.domainmodel.Function;
import org.xtext.example.domainmodel.domainmodel.Model;
import org.xtext.example.domainmodel.services.DomainmodelGrammarAccess;

@SuppressWarnings("all")
public class DomainmodelSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DomainmodelGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DomainmodelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DomainmodelPackage.DEFINE:
				if(context == grammarAccess.getDefineRule() ||
				   context == grammarAccess.getMyDSLRule()) {
					sequence_Define(context, (Define) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.FUNCTION:
				if(context == grammarAccess.getFunctionRule() ||
				   context == grammarAccess.getMyDSLRule()) {
					sequence_Function(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case DomainmodelPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Define(EObject context, Define semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.MY_DSL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.MY_DSL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefineAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (name=ID name=ID*)*)
	 */
	protected void sequence_Function(EObject context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     myDSL+=myDSL*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
