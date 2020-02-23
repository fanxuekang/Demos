package com.iss.day04;

public class HomeWork_CPeople {
      String name;
      int  age;
      String id;
     public HomeWork_CPeople(){}
     public HomeWork_CPeople(String name,int age,String id){
         setName(name);
         setAge(age);
         setId(id);
     }

     public  void print(){
         System.out.println("姓名："+this.name+"    年龄："+this.age+"    身份证号码："+this.id);
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
