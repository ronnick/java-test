package com.tym.helloworld;

import java.io.File;
import java.io.FilenameFilter;

public class DirList {
    public String[] getFileList(String filter) {
        String[] fileList = null;
        File path = new File(".");
        try {
            if (filter.length() == 0) {
                fileList = path.list();
            } else {
                fileList = path.list(new DirFilter(filter));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return fileList;
    }
}
