package org.bbz.codegenerate.web.component;

import com.bbz.tool.common.FileUtil;
import com.bbz.tool.common.StrUtil;

/**
 * Created by liulaoye on 16-11-9.
 * 生成DelxxxModal.js
 */
class GenDelModalCode extends AbstractGenComponentCode{
    private static final String TEMPLET_PATH = "resource/template/component/delModal.template";
    public GenDelModalCode( String className ){
        super(  className );
        result = FileUtil.readTextFile( TEMPLET_PATH );
    }

    @Override
    public String gen(){
        super.gen();
        return result;
    }

    @Override
    protected String getResultFileName(){
        final String toUpper = StrUtil.firstCharacterToUpper( className );
        return "Del" + toUpper+"Modal.js";

    }
}
