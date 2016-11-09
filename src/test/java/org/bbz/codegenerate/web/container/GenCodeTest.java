package org.bbz.codegenerate.web.container;

import org.junit.Test;

/**
 * Created by liulaoye on 16-11-9.
 */
public class GenCodeTest{
    @Test
    public void gen() throws Exception{
        String outputPath = "/home/liulaoye/work/js/dzb-map/dzb/src/containers/";
        new GenCode(outputPath, "user" ).gen();
    }

}