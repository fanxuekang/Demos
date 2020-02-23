package com.iss.day04;

public class HomeWork_CProfessor extends HomeWork_CEmployee {
    String destination;

    public HomeWork_CProfessor(){}
    public HomeWork_CProfessor(HomeWork_CEmployee cEmployee,String destination){
        setName(cEmployee.name);
        setAge(cEmployee.age);
        setId(cEmployee.id);
        setDestination(destination);
    }

    public void print(){
        System.out.println("姓名："+this.name+"    年龄："+this.age+"    身份证号码："+this.id+"    研究课题方向："+this.destination);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
