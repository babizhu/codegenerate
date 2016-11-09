package org.bbz.codegenerate.web;

import com.bbz.tool.common.StrUtil;
import org.bbz.codegenerate.AbstractGenCode;

/**
 * Created by liulaoye on 16-11-9.
 */
public abstract class AbstractGenWebCode extends AbstractGenCode{
    protected final String className;

    public AbstractGenWebCode( String className ){
        this.className = className;
    }

    /**
     * 替换类名 --- className的首字母大写
     * ##className##
     * @return
     */
    protected void replaceClassName(){
        final String toUpper = StrUtil.firstCharacterToUpper( className );
        result =  result.replaceAll( "##className##", toUpper );
    }
    /**
     * 替换此类的变量名 --- className的首字母小写
     * ##varName##
     * @return
     */
    protected void replaceVarName(){
        final String toLower = StrUtil.firstCharacterToLower( className );
        result =  result.replaceAll( "##varName##", toLower );
    }

}
