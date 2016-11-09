package org.bbz.codegenerate.web;

/**
 * Created by liulaoye on 16-11-9.
 * 统一处理替换
 * 日期
 * 首字母大写类名
 * 首字母小写类名
 * 全大写类名
 *
 */
public abstract class GenBaseWebCode extends AbstractGenWebCode{
    public GenBaseWebCode( String className ){
        super( className );
    }

    @Override
    public String gen(){
        replaceDate();
        replaceVarName();
        replaceClassName();
        replaceActionName();
        return result;
    }

    /**
     * 替换action名字 --- className的全部大写
     * ##actionName##
     *
     * @return
     */
    private void replaceActionName(){

        result = result.replaceAll( "##actionName##", className.toUpperCase() );
    }
}
