package org.bbz.codegenerate.web.component;

import com.bbz.tool.common.FileUtil;
import com.bbz.tool.common.StrUtil;

/**
 * Created by liulaoye on 16-11-9.
 * 生成xxxList.js
 */
class GenListCode extends AbstractGenComponentCode{
    private static final String     TEMPLET_PATH ="resource/template/component/list.template";

    public GenListCode( String className ){
        super( className );
        result = FileUtil.readTextFile( TEMPLET_PATH );

    }

    @Override
    public String gen(){
        return super.gen();
    }

    @Override
    protected String getResultFileName(){
        final String toUpper = StrUtil.firstCharacterToUpper( className );
        return toUpper+"List.js";
    }
}
