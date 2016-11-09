package org.bbz.codegenerate.web.reducers;

import com.bbz.tool.common.FileUtil;
import com.bbz.tool.common.StrUtil;
import org.bbz.codegenerate.web.GenBaseWebCode;

/**
 * Created by liulaoye on 16-11-9.
 * 生成action目录的djs代码
 */
class GenReducerCode extends GenBaseWebCode{


    private static final String TEMPLET_PATH = "resource/template/reducer/reducer.template";

    public GenReducerCode( String className ){
        super( className );
        result = FileUtil.readTextFile( TEMPLET_PATH );
    }


    @Override
    protected String getResultFileName(){
        final String toUpper = StrUtil.firstCharacterToUpper( className );
        return toUpper + ".js";
    }
}
