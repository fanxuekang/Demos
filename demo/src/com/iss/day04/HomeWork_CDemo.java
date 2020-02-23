package com.iss.day04;

public class HomeWork_CDemo {
    public static void main(String[] args) {
        HomeWork_CPeople p1 = new HomeWork_CPeople("刘英贤",21,"0001");
        HomeWork_CPeople p2 = new HomeWork_CPeople("张健",22,"0002");
        HomeWork_CPeople p3 = new HomeWork_CPeople("邴英澳",21,"0003");
        HomeWork_CEmployee employee = new HomeWork_CEmployee(p2,4000);
        HomeWork_CEmployee employee1 = new HomeWork_CEmployee(p3,4000);
        HomeWork_CProfessor professor = new HomeWork_CProfessor(employee1,"大数据");
        HomeWork_CStudent student = new HomeWork_CStudent(p1,"01",2,professor);

        student.print();
        employee.print();
        professor.print();

    }



}
