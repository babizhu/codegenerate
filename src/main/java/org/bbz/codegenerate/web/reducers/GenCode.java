package org.bbz.codegenerate.web.reducers;

import com.bbz.tool.common.FileUtil;

/**
 * Created by liulaoye on 16-11-9.
 * 生成代码并拷贝到相应位置
 */
public class GenCode{
    /**
     * 输出文件的路径，末尾用"/"结束
     */
    private final String outputPath;
    private final String className;

    /**
     *
     * @param outputPath    输出文件的路径，末尾用"/"结束
     * @param className     类名称
     */
    public GenCode( String outputPath, String className ){

        this.outputPath = outputPath;
        this.className = className;
    }

    public void gen(){
        final GenReducerCode genReducerCode = new GenReducerCode( className );
        String outputFilePath = outputPath + genReducerCode.getResultFileName();
        FileUtil.writeTextFile( outputFilePath, genReducerCode.gen() );
        System.out.println( outputFilePath + "输出完毕！" );

    }
}
