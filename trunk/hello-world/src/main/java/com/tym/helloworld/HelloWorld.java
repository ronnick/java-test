package com.tym.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Object object = new Object();
        System.out.println(object.getClass());

        DirList dl = new DirList();
        if (args.length == 0) {
            dl.getFileList("");
        } else {
            dl.getFileList(args[0]);
        }
    }
}
