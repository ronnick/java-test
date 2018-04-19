package com.tym.helloworld;

import java.io.File;
import java.io.FilenameFilter;

public class DirFilter implements FilenameFilter {

    private String ft = null;

    /**
     *
     * @param filter filename filter
     */
    public DirFilter(String filter) {
        ft = filter;
    }

    /**
     *
     * @param dir
     * @param name
     * @return
     */
    public boolean accept(File dir, String name) {
        boolean flag = false;

        if (name.toLowerCase().contains(ft)){
            flag = true;
        }

        return flag;
    }
}
