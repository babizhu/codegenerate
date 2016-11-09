package org.bbz.codegenerate.web.component;

import org.bbz.codegenerate.web.AbstractGenWebCode;

/**
 * Created by liulaoye on 16-11-7.
 * 生成客户端的代码
 */
abstract class AbstractGenComponentCode extends AbstractGenWebCode{

//    private final String templateContent;


    public AbstractGenComponentCode( String className){
        super(className);

    }

    @Override
    public String gen(){
        replaceDate();
        replaceClassName();
        replaceVarName();
        return result;
    }

    /**
     * 替换日期
     * ##date##
     * @return
     */







}
