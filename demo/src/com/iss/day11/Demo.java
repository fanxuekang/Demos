package com.iss.day11;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * c创建int数组，把int数组写入到文件中，然后按照倒叙读取
 */
public class Demo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int[] bytes = {1,2,3,4,5};
        RandomAccessFile raf = new RandomAccessFile("E:\\card.txt","rw");
        for(int i =0 ;i<bytes.length;i++){
            raf.writeInt(bytes[i]);
        }
        for(int i =bytes.length-1;i>=0;i--){
            raf.seek(i*4);
            System.out.println(raf.readLine());
        }
        raf.close();
    }
}
