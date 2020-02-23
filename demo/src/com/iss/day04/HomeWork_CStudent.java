package com.iss.day04;

public class HomeWork_CStudent extends HomeWork_CPeople {
     String sid;
     int grade;
     HomeWork_CProfessor teacher;

    public HomeWork_CStudent(){}
    public HomeWork_CStudent(HomeWork_CPeople cPeople,String sid,int grade,HomeWork_CProfessor teacher){
        setName(cPeople.name);
        setAge(cPeople.age);
        setId(cPeople.id);
        setSid(id);
        setGrade(grade);
        setTeacher(teacher);
    }

    public void print(){
        System.out.println("姓名："+this.name+"    年龄："+this.age+"    身份证号码："+this.id+"    学号："+this.sid
        +"    年级："+this.grade+"    所属的导师："+this.teacher.name);
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public HomeWork_CProfessor getTeacher() {
        return teacher;
    }

    public void setTeacher(HomeWork_CProfessor teacher) {
        this.teacher = teacher;
    }
}
