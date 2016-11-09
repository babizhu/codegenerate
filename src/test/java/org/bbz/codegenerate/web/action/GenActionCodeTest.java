package org.bbz.codegenerate.web.action;

import org.junit.Test;

/**
 * Created by liulaoye on 16-11-9.
 */
public class GenActionCodeTest{
    @Test
    public void gen() throws Exception{
        String output = new GenActionCode( "User" ).gen();
        System.out.println( output);
    }

}