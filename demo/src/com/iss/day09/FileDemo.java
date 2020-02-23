package com.iss.day09;

import java.io.File;

public class FileDemo {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\fanxuekang\\Desktop","欧泉美发店会员管理系统.docx");
        System.out.println("文件名称："+file.getName());
        System.out.println("文件是否存在："+file.exists());
        System.out.println("相对路径："+file.getPath());
        System.out.println("绝对路径："+file.getAbsolutePath());
        System.out.println("是否是隐藏文件："+file.isHidden());
        System.out.println("是否可读："+file.canRead());
        System.out.println("是否可写："+file.canWrite());
        System.out.println("是否是文件类："+file.isFile());
        System.out.println("文件长度："+file.length());
        System.out.println("文件上次修改时间："+file.lastModified());
        System.out.println("是不是文件夹的类型："+file.isDirectory());
        System.out.println("是不是绝对路径："+file.isAbsolute());
        System.out.println("getparente："+file.isAbsolute());

        System.out.println(file.toString());


    }
}
