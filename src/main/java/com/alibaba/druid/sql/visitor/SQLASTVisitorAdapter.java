/*
 * Copyright 1999-2011 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.druid.sql.visitor;

import com.alibaba.druid.sql.ast.SQLDataType;
import com.alibaba.druid.sql.ast.SQLObject;
import com.alibaba.druid.sql.ast.SQLOrderBy;
import com.alibaba.druid.sql.ast.expr.SQLAggregateExpr;
import com.alibaba.druid.sql.ast.expr.SQLAllColumnExpr;
import com.alibaba.druid.sql.ast.expr.SQLAllExpr;
import com.alibaba.druid.sql.ast.expr.SQLAnyExpr;
import com.alibaba.druid.sql.ast.expr.SQLBetweenExpr;
import com.alibaba.druid.sql.ast.expr.SQLBinaryOpExpr;
import com.alibaba.druid.sql.ast.expr.SQLBitStringLiteralExpr;
import com.alibaba.druid.sql.ast.expr.SQLCaseExpr;
import com.alibaba.druid.sql.ast.expr.SQLCastExpr;
import com.alibaba.druid.sql.ast.expr.SQLCharExpr;
import com.alibaba.druid.sql.ast.expr.SQLCurrentOfCursorExpr;
import com.alibaba.druid.sql.ast.expr.SQLDateLiteralExpr;
import com.alibaba.druid.sql.ast.expr.SQLDefaultExpr;
import com.alibaba.druid.sql.ast.expr.SQLExistsExpr;
import com.alibaba.druid.sql.ast.expr.SQLHexExpr;
import com.alibaba.druid.sql.ast.expr.SQLHexStringLiteralExpr;
import com.alibaba.druid.sql.ast.expr.SQLIdentifierExpr;
import com.alibaba.druid.sql.ast.expr.SQLInListExpr;
import com.alibaba.druid.sql.ast.expr.SQLInSubQueryExpr;
import com.alibaba.druid.sql.ast.expr.SQLIntegerExpr;
import com.alibaba.druid.sql.ast.expr.SQLIntervalLiteralExpr;
import com.alibaba.druid.sql.ast.expr.SQLListExpr;
import com.alibaba.druid.sql.ast.expr.SQLMethodInvokeExpr;
import com.alibaba.druid.sql.ast.expr.SQLNCharExpr;
import com.alibaba.druid.sql.ast.expr.SQLNotExpr;
import com.alibaba.druid.sql.ast.expr.SQLNullExpr;
import com.alibaba.druid.sql.ast.expr.SQLNumberExpr;
import com.alibaba.druid.sql.ast.expr.SQLPropertyExpr;
import com.alibaba.druid.sql.ast.expr.SQLQueryExpr;
import com.alibaba.druid.sql.ast.expr.SQLSomeExpr;
import com.alibaba.druid.sql.ast.expr.SQLUnaryExpr;
import com.alibaba.druid.sql.ast.expr.SQLVariantRefExpr;
import com.alibaba.druid.sql.ast.statement.NotNullConstraint;
import com.alibaba.druid.sql.ast.statement.SQLAssignItem;
import com.alibaba.druid.sql.ast.statement.SQLCallStatement;
import com.alibaba.druid.sql.ast.statement.SQLColumnDefinition;
import com.alibaba.druid.sql.ast.statement.SQLCommentStatement;
import com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement;
import com.alibaba.druid.sql.ast.statement.SQLCreateViewStatement;
import com.alibaba.druid.sql.ast.statement.SQLDeleteStatement;
import com.alibaba.druid.sql.ast.statement.SQLDropTableStatement;
import com.alibaba.druid.sql.ast.statement.SQLExprTableSource;
import com.alibaba.druid.sql.ast.statement.SQLInsertStatement;
import com.alibaba.druid.sql.ast.statement.SQLInsertStatement.ValuesClause;
import com.alibaba.druid.sql.ast.statement.SQLJoinTableSource;
import com.alibaba.druid.sql.ast.statement.SQLSelect;
import com.alibaba.druid.sql.ast.statement.SQLSelectGroupByClause;
import com.alibaba.druid.sql.ast.statement.SQLSelectItem;
import com.alibaba.druid.sql.ast.statement.SQLSelectOrderByItem;
import com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock;
import com.alibaba.druid.sql.ast.statement.SQLSelectStatement;
import com.alibaba.druid.sql.ast.statement.SQLSetStatement;
import com.alibaba.druid.sql.ast.statement.SQLSubqueryTableSource;
import com.alibaba.druid.sql.ast.statement.SQLTableElement;
import com.alibaba.druid.sql.ast.statement.SQLTruncateStatement;
import com.alibaba.druid.sql.ast.statement.SQLUnionQuery;
import com.alibaba.druid.sql.ast.statement.SQLUniqueConstraint;
import com.alibaba.druid.sql.ast.statement.SQLUpdateSetItem;
import com.alibaba.druid.sql.ast.statement.SQLUpdateStatement;
import com.alibaba.druid.sql.ast.statement.SQLUseStatement;

public class SQLASTVisitorAdapter implements SQLASTVisitor {

    public void endVisit(SQLAllColumnExpr x) {
    }

    public void endVisit(SQLBetweenExpr x) {
    }

    public void endVisit(SQLBinaryOpExpr x) {
    }

    public void endVisit(SQLCaseExpr x) {
    }

    public void endVisit(SQLCaseExpr.Item x) {
    }

    public void endVisit(SQLCharExpr x) {
    }

    public void endVisit(SQLIdentifierExpr x) {
    }

    public void endVisit(SQLInListExpr x) {
    }

    public void endVisit(SQLIntegerExpr x) {
    }

    public void endVisit(SQLExistsExpr x) {
    }

    public void endVisit(SQLNCharExpr x) {
    }

    public void endVisit(SQLNotExpr x) {
    }

    public void endVisit(SQLNullExpr x) {
    }

    public void endVisit(SQLNumberExpr x) {
    }

    public void endVisit(SQLPropertyExpr x) {
    }

    public void endVisit(SQLSelectGroupByClause x) {
    }

    public void endVisit(SQLSelectItem x) {
    }

    public void endVisit(SQLSelectStatement selectStatement) {
    }

    public void postVisit(SQLObject astNode) {
    }

    public void preVisit(SQLObject astNode) {
    }

    public boolean visit(SQLAllColumnExpr x) {
        return true;
    }

    public boolean visit(SQLBetweenExpr x) {
        return true;
    }

    public boolean visit(SQLBinaryOpExpr x) {
        return true;
    }

    public boolean visit(SQLCaseExpr x) {
        return true;
    }

    public boolean visit(SQLCaseExpr.Item x) {
        return true;
    }

    public boolean visit(SQLCastExpr x) {
        return true;
    }

    public boolean visit(SQLCharExpr x) {
        return true;
    }

    public boolean visit(SQLExistsExpr x) {
        return true;
    }

    public boolean visit(SQLIdentifierExpr x) {
        return true;
    }

    public boolean visit(SQLInListExpr x) {
        return true;
    }

    public boolean visit(SQLIntegerExpr x) {
        return true;
    }

    public boolean visit(SQLNCharExpr x) {
        return true;
    }

    public boolean visit(SQLNotExpr x) {
        return true;
    }

    public boolean visit(SQLNullExpr x) {
        return true;
    }

    public boolean visit(SQLNumberExpr x) {
        return true;
    }

    public boolean visit(SQLPropertyExpr x) {
        return true;
    }

    public boolean visit(SQLSelectGroupByClause x) {
        return true;
    }

    public boolean visit(SQLSelectItem x) {
        return true;
    }

    public void endVisit(SQLCastExpr x) {
    }

    public boolean visit(SQLSelectStatement astNode) {
        return true;
    }

    public void endVisit(SQLAggregateExpr x) {
    }

    public boolean visit(SQLAggregateExpr x) {
        return true;
    }

    public boolean visit(SQLVariantRefExpr x) {
        return true;
    }

    public void endVisit(SQLVariantRefExpr x) {
    }

    public boolean visit(SQLQueryExpr x) {
        return true;
    }

    public void endVisit(SQLQueryExpr x) {
    }

    public boolean visit(SQLBitStringLiteralExpr x) {
        return true;
    }

    public void endVisit(SQLBitStringLiteralExpr x) {
    }

    public boolean visit(SQLHexStringLiteralExpr x) {
        return true;
    }

    public void endVisit(SQLHexStringLiteralExpr x) {
    }

    public boolean visit(SQLDateLiteralExpr x) {
        return true;
    }

    public void endVisit(SQLDateLiteralExpr x) {
    }

    public boolean visit(SQLSelect x) {
        return true;
    }

    public void endVisit(SQLSelect select) {
    }

    public boolean visit(SQLSelectQueryBlock x) {
        return true;
    }

    public void endVisit(SQLSelectQueryBlock x) {
    }

    public boolean visit(SQLExprTableSource x) {
        return true;
    }

    public void endVisit(SQLExprTableSource x) {
    }

    public boolean visit(SQLIntervalLiteralExpr x) {
        return true;
    }

    public void endVisit(SQLIntervalLiteralExpr x) {
    }

    public boolean visit(SQLOrderBy x) {
        return true;
    }

    public void endVisit(SQLOrderBy x) {
    }

    public boolean visit(SQLSelectOrderByItem x) {
        return true;
    }

    public void endVisit(SQLSelectOrderByItem x) {
    }

    public boolean visit(SQLDropTableStatement x) {
        return true;
    }

    public void endVisit(SQLDropTableStatement x) {
    }

    public boolean visit(SQLCreateTableStatement x) {
        return true;
    }

    public void endVisit(SQLCreateTableStatement x) {
    }

    public boolean visit(SQLTableElement x) {
        return true;
    }

    public void endVisit(SQLTableElement x) {
    }

    public boolean visit(SQLColumnDefinition x) {
        return true;
    }

    public void endVisit(SQLColumnDefinition x) {
    }

    public boolean visit(SQLDataType x) {
        return true;
    }

    public void endVisit(SQLDataType x) {
    }

    public boolean visit(SQLDeleteStatement x) {
        return true;
    }

    public void endVisit(SQLDeleteStatement x) {
    }

    public boolean visit(SQLCurrentOfCursorExpr x) {
        return true;
    }

    public void endVisit(SQLCurrentOfCursorExpr x) {
    }

    public boolean visit(SQLInsertStatement x) {
        return true;
    }

    public void endVisit(SQLInsertStatement x) {
    }

    public boolean visit(SQLUpdateSetItem x) {
        return true;
    }

    public void endVisit(SQLUpdateSetItem x) {
    }

    public boolean visit(SQLUpdateStatement x) {
        return true;
    }

    public void endVisit(SQLUpdateStatement x) {
    }

    public boolean visit(SQLCreateViewStatement x) {
        return true;
    }

    public void endVisit(SQLCreateViewStatement x) {
    }

    public boolean visit(SQLUniqueConstraint x) {
        return true;
    }

    public void endVisit(SQLUniqueConstraint x) {
    }

    public boolean visit(NotNullConstraint x) {
        return true;
    }

    public void endVisit(NotNullConstraint x) {
    }

    @Override
    public void endVisit(SQLMethodInvokeExpr x) {

    }

    @Override
    public boolean visit(SQLMethodInvokeExpr x) {
        return true;
    }

    @Override
    public void endVisit(SQLUnionQuery x) {

    }

    @Override
    public boolean visit(SQLUnionQuery x) {
        return true;
    }

    @Override
    public boolean visit(SQLUnaryExpr x) {
        return true;
    }

    @Override
    public void endVisit(SQLUnaryExpr x) {

    }

    @Override
    public boolean visit(SQLHexExpr x) {
        return false;
    }

    @Override
    public void endVisit(SQLHexExpr x) {

    }

    @Override
    public void endVisit(SQLSetStatement x) {

    }

    @Override
    public boolean visit(SQLSetStatement x) {
        return true;
    }

    @Override
    public void endVisit(SQLAssignItem x) {

    }

    @Override
    public boolean visit(SQLAssignItem x) {
        return true;
    }

    @Override
    public void endVisit(SQLCallStatement x) {

    }

    @Override
    public boolean visit(SQLCallStatement x) {
        return true;
    }

    @Override
    public void endVisit(SQLJoinTableSource x) {

    }

    @Override
    public boolean visit(SQLJoinTableSource x) {
        return true;
    }

    @Override
    public boolean visit(ValuesClause x) {
        return true;
    }

    @Override
    public void endVisit(ValuesClause x) {

    }

    @Override
    public void endVisit(SQLSomeExpr x) {

    }

    @Override
    public boolean visit(SQLSomeExpr x) {
        return true;
    }

    @Override
    public void endVisit(SQLAnyExpr x) {

    }

    @Override
    public boolean visit(SQLAnyExpr x) {
        return true;
    }

    @Override
    public void endVisit(SQLAllExpr x) {

    }

    @Override
    public boolean visit(SQLAllExpr x) {
        return true;
    }

    @Override
    public void endVisit(SQLInSubQueryExpr x) {

    }

    @Override
    public boolean visit(SQLInSubQueryExpr x) {
        return true;
    }

    @Override
    public void endVisit(SQLListExpr x) {

    }

    @Override
    public boolean visit(SQLListExpr x) {
        return true;
    }

    @Override
    public void endVisit(SQLSubqueryTableSource x) {

    }

    @Override
    public boolean visit(SQLSubqueryTableSource x) {
        return true;
    }

    @Override
    public void endVisit(SQLTruncateStatement x) {

    }

    @Override
    public boolean visit(SQLTruncateStatement x) {
        return true;
    }

    @Override
    public void endVisit(SQLDefaultExpr x) {

    }

    @Override
    public boolean visit(SQLDefaultExpr x) {
        return true;
    }

    @Override
    public void endVisit(SQLCommentStatement x) {

    }

    @Override
    public boolean visit(SQLCommentStatement x) {
        return true;
    }

    @Override
    public void endVisit(SQLUseStatement x) {

    }

    @Override
    public boolean visit(SQLUseStatement x) {
        return true;
    }

}
