package org.bbz.codegenerate;

import org.joda.time.DateTime;

/**
 * Created by liulaoye on 16-11-9.
 */
public abstract class AbstractGenCode{
    protected String result;
    protected void replaceDate(){
        DateTime dateTime = new DateTime();
        result = result.replaceAll( "##date##", dateTime.toString("yyyy-MM-dd HH:mm:ss") );
    }

    protected abstract String getResultFileName();

    protected abstract String  gen();
}
