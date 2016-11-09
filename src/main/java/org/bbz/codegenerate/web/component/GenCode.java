package org.bbz.codegenerate.web.component;

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
    public GenCode( String outputPath,String className ){

        this.outputPath = outputPath;
        this.className = className;
    }

    public void gen(){
        final GenDelModalCode genWebDelModalCode = new GenDelModalCode( className );
        final GenModalCode genWebModalCode = new GenModalCode( className );
        final GenListCode genWebListCode = new GenListCode( className );

        String outputFilePath = outputPath + genWebDelModalCode.getResultFileName();
        FileUtil.writeTextFile( outputFilePath, genWebDelModalCode.gen() );
        System.out.println( outputFilePath + "输出完毕！");

        outputFilePath = outputPath + genWebModalCode.getResultFileName();
        FileUtil.writeTextFile( outputFilePath, genWebModalCode.gen() );
        System.out.println( outputFilePath + "输出完毕！");

        outputFilePath = outputPath + genWebListCode.getResultFileName();
        FileUtil.writeTextFile( outputFilePath, genWebListCode.gen() );
        System.out.println( outputFilePath + "输出完毕！");


    }
}
