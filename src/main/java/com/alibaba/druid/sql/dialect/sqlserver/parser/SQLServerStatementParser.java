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
package com.alibaba.druid.sql.dialect.sqlserver.parser;

import com.alibaba.druid.sql.parser.Lexer;
import com.alibaba.druid.sql.parser.SQLSelectParser;
import com.alibaba.druid.sql.parser.SQLStatementParser;

public class SQLServerStatementParser extends SQLStatementParser {

    public SQLServerStatementParser(String sql){
        super(new SQLServerLexer(sql));
        this.lexer.nextToken();
        this.exprParser = new SQLServerExprParser(lexer);
    }
    
    public SQLSelectParser createSQLSelectParser() {
        return new SQLServerSelectParser(this.lexer);
    }

    public SQLServerStatementParser(Lexer lexer){
        super(lexer);
    }

}
