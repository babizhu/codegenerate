package org.bbz.codegenerate.web.container;

import com.bbz.tool.common.FileUtil;
import com.bbz.tool.common.StrUtil;
import org.bbz.codegenerate.web.GenBaseWebCode;

/**
 * Created by liulaoye on 16-11-9.
 * 生成action目录的djs代码
 */
class GenContainerCode extends GenBaseWebCode{


    private static final String TEMPLET_PATH = "resource/template/container/container.template";

    public GenContainerCode( String className ){
        super( className );
        result = FileUtil.readTextFile( TEMPLET_PATH );
    }

    @Override
    protected String getResultFileName(){
        final String toUpper = StrUtil.firstCharacterToUpper( className );
        return toUpper + "Container.js";
    }

}
