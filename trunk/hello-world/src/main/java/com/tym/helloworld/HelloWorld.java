package com.tym.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Object object = new Object();
        System.out.println(object.getClass());

        DirList dl = new DirList();
        String[] fileList = null;
        if (args.length == 0) {
            fileList = dl.getFileList("");
        } else {
            fileList = dl.getFileList(args[0]);
        }

        for (String name : fileList){
            System.out.println(name);
        }
    }
}
