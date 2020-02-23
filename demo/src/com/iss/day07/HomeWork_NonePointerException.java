package com.iss.day07;


public class HomeWork_NonePointerException  {


    public static void main(String[] args) throws Exception {
            String s = null;
            try{
                isEqual(s,"a");
            }catch (NonePionterException e){
                e.printStackTrace();
            }finally {
                System.out.println("输出了异常！");
            }

    }

    public static boolean isEqual(String s,String test) throws Exception {
        if(s == null){
            throw new NonePionterException("空指针异常");
        }
        return s.equals(test);
    }
}
class NonePionterException extends Exception{
    public NonePionterException(String message){
        super(message);
    }
}

