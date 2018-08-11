package com.daysun.javase.ioandfile.file;

import java.io.File;
import java.io.FilenameFilter;

public class MyFilenameFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        // System.out.println(dir + "---" + name);
        // File file = new File(dir, name);
        // boolean flag = file.isFile();
        // boolean flag2 = name.endsWith(".java");
        // return flag && flag2;

        return new File(dir, name).isFile() && name.endsWith(".java");
    }
}
