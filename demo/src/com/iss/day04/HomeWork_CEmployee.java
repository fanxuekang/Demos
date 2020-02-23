package com.iss.day04;

public class HomeWork_CEmployee extends HomeWork_CPeople {
    int salary;

    public HomeWork_CEmployee(){}
    public HomeWork_CEmployee(HomeWork_CPeople cPeople,int salary){
        setName(cPeople.name);
        setAge(cPeople.age);
        setId(cPeople.id);
        setSalary(salary);
    }

    public void print(){
        System.out.println("姓名："+this.name+"    年龄："+this.age+"    身份证号码："+this.id+"    薪水："+this.salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
