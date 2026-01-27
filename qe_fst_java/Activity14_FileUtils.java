package qe.java;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class Activity14_FileUtils {
    File file=new File("");
    boolean status=file.createNewFile();
    String data="hello";
    FileUtils.writeStringToFile(file,data,StandardCharsets.UTF_8);
    System.out.println(FileUtils.readFileToString);
    File destDir=new File("");
    FileUtils.copyFileToDirectory(file,destDir);

}
