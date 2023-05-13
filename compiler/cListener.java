// Generated from c.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cParser}.
 */
public interface cListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(cParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(cParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(cParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(cParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(cParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(cParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(cParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(cParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(cParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(cParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(cParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(cParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(cParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(cParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(cParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(cParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(cParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(cParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(cParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(cParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#logical_term}.
	 * @param ctx the parse tree
	 */
	void enterLogical_term(cParser.Logical_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#logical_term}.
	 * @param ctx the parse tree
	 */
	void exitLogical_term(cParser.Logical_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#logical_factor}.
	 * @param ctx the parse tree
	 */
	void enterLogical_factor(cParser.Logical_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#logical_factor}.
	 * @param ctx the parse tree
	 */
	void exitLogical_factor(cParser.Logical_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(cParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(cParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(cParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(cParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(cParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(cParser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(cParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(cParser.FactorContext ctx);
}