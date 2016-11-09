package org.bbz.codegenerate.web.component;

import com.bbz.tool.common.FileUtil;
import com.bbz.tool.common.StrUtil;

/**
 * Created by liulaoye on 16-11-9.
 * 生成xxxModal.js
 */
class GenModalCode extends AbstractGenComponentCode{
    private static final String TEMPLET_PATH = "resource/template/component/modal.template";
    public GenModalCode( String className ){
        super(  className );
        result = FileUtil.readTextFile( TEMPLET_PATH );

    }

    @Override
    public String gen(){
        return super.gen();
    }

    @Override
    protected String getResultFileName(){
        final String toUpper = StrUtil.firstCharacterToUpper( className );
        return toUpper+"Modal.js";

    }
}
