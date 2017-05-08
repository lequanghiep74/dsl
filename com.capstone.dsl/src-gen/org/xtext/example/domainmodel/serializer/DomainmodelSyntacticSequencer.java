package org.xtext.example.domainmodel.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.domainmodel.services.DomainmodelGrammarAccess;

@SuppressWarnings("all")
public class DomainmodelSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DomainmodelGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Define_CompareFormulaParserRuleCall_4_0_or_MyIDParserRuleCall_4_1;
	protected AbstractElementAlias match_Define_LeftParenthesisKeyword_3_q;
	protected AbstractElementAlias match_Define_RightParenthesisKeyword_5_q;
	protected AbstractElementAlias match_Define___ConditionOperationParserRuleCall_6_0_LeftParenthesisKeyword_6_1_q___CompareFormulaParserRuleCall_6_2_0_or_MyIDParserRuleCall_6_2_1___RightParenthesisKeyword_6_3_q__a;
	protected AbstractElementAlias match_myDSL_EnumParserRuleCall_0_or_PreconditionParserRuleCall_2_or_RunParserRuleCall_5_or_TestcaseParserRuleCall_3;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DomainmodelGrammarAccess) access;
		match_Define_CompareFormulaParserRuleCall_4_0_or_MyIDParserRuleCall_4_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDefineAccess().getCompareFormulaParserRuleCall_4_0()), new TokenAlias(false, false, grammarAccess.getDefineAccess().getMyIDParserRuleCall_4_1()));
		match_Define_LeftParenthesisKeyword_3_q = new TokenAlias(false, true, grammarAccess.getDefineAccess().getLeftParenthesisKeyword_3());
		match_Define_RightParenthesisKeyword_5_q = new TokenAlias(false, true, grammarAccess.getDefineAccess().getRightParenthesisKeyword_5());
		match_Define___ConditionOperationParserRuleCall_6_0_LeftParenthesisKeyword_6_1_q___CompareFormulaParserRuleCall_6_2_0_or_MyIDParserRuleCall_6_2_1___RightParenthesisKeyword_6_3_q__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getDefineAccess().getConditionOperationParserRuleCall_6_0()), new TokenAlias(false, true, grammarAccess.getDefineAccess().getLeftParenthesisKeyword_6_1()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDefineAccess().getCompareFormulaParserRuleCall_6_2_0()), new TokenAlias(false, false, grammarAccess.getDefineAccess().getMyIDParserRuleCall_6_2_1())), new TokenAlias(false, true, grammarAccess.getDefineAccess().getRightParenthesisKeyword_6_3()));
		match_myDSL_EnumParserRuleCall_0_or_PreconditionParserRuleCall_2_or_RunParserRuleCall_5_or_TestcaseParserRuleCall_3 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMyDSLAccess().getEnumParserRuleCall_0()), new TokenAlias(false, false, grammarAccess.getMyDSLAccess().getPreconditionParserRuleCall_2()), new TokenAlias(false, false, grammarAccess.getMyDSLAccess().getRunParserRuleCall_5()), new TokenAlias(false, false, grammarAccess.getMyDSLAccess().getTestcaseParserRuleCall_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getCompareFormulaRule())
			return getCompareFormulaToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getConditionOperationRule())
			return getConditionOperationToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDatatypeRule())
			return getDatatypeToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEnumRule())
			return getEnumToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMyIDRule())
			return getMyIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPreconditionRule())
			return getPreconditionToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRunRule())
			return getRunToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTestcaseRule())
			return getTestcaseToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * CompareFormula: MathFormula CompareOperation MathFormula | MathFormula CompareOperation STRING;
	 */
	protected String getCompareFormulaToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ">";
	}
	
	/**
	 * ConditionOperation: '||' | '&&';
	 */
	protected String getConditionOperationToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "||";
	}
	
	/**
	 * Datatype: 'Int' | 'Real' | 'Bool' | 'String';
	 */
	protected String getDatatypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "Int";
	}
	
	/**
	 * Enum: 'enum' (ID | 'Int' | 'Real' | 'Bool' | 'String') '{' EnumOptions '}';
	 */
	protected String getEnumToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "enum{}";
	}
	
	/**
	 * MyID: '-'?(ID | ('!')ID);
	 */
	protected String getMyIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * Precondition: 'precondition' '{' 
	 * 		CompareFormula (ConditionOperation CompareFormula)*
	 * 	'}'
	 * ;
	 */
	protected String getPreconditionToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "precondition{>}";
	}
	
	/**
	 * Run: 'run';
	 */
	protected String getRunToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "run";
	}
	
	/**
	 * Testcase : 'testcase' '{'
	 * 		(TestCondition)*
	 * 	'}'
	 * ;
	 */
	protected String getTestcaseToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "testcase{}";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Define_CompareFormulaParserRuleCall_4_0_or_MyIDParserRuleCall_4_1.equals(syntax))
				emit_Define_CompareFormulaParserRuleCall_4_0_or_MyIDParserRuleCall_4_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Define_LeftParenthesisKeyword_3_q.equals(syntax))
				emit_Define_LeftParenthesisKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Define_RightParenthesisKeyword_5_q.equals(syntax))
				emit_Define_RightParenthesisKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Define___ConditionOperationParserRuleCall_6_0_LeftParenthesisKeyword_6_1_q___CompareFormulaParserRuleCall_6_2_0_or_MyIDParserRuleCall_6_2_1___RightParenthesisKeyword_6_3_q__a.equals(syntax))
				emit_Define___ConditionOperationParserRuleCall_6_0_LeftParenthesisKeyword_6_1_q___CompareFormulaParserRuleCall_6_2_0_or_MyIDParserRuleCall_6_2_1___RightParenthesisKeyword_6_3_q__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_myDSL_EnumParserRuleCall_0_or_PreconditionParserRuleCall_2_or_RunParserRuleCall_5_or_TestcaseParserRuleCall_3.equals(syntax))
				emit_myDSL_EnumParserRuleCall_0_or_PreconditionParserRuleCall_2_or_RunParserRuleCall_5_or_TestcaseParserRuleCall_3(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     MyID | CompareFormula
	 */
	protected void emit_Define_CompareFormulaParserRuleCall_4_0_or_MyIDParserRuleCall_4_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('?
	 */
	protected void emit_Define_LeftParenthesisKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ')'?
	 */
	protected void emit_Define_RightParenthesisKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (ConditionOperation '('? (CompareFormula | MyID) ')'?)*
	 */
	protected void emit_Define___ConditionOperationParserRuleCall_6_0_LeftParenthesisKeyword_6_1_q___CompareFormulaParserRuleCall_6_2_0_or_MyIDParserRuleCall_6_2_1___RightParenthesisKeyword_6_3_q__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Precondition | Run | Enum | Testcase
	 */
	protected void emit_myDSL_EnumParserRuleCall_0_or_PreconditionParserRuleCall_2_or_RunParserRuleCall_5_or_TestcaseParserRuleCall_3(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
