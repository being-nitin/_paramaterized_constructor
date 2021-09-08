package com.nitincodes;
// java program to use paramaterized constructor:
class test{
    int courseid;
    String courseName;

    test(int id, String cName){
        this.courseName = cName;
        this.courseid = id;
    }
void m1(){
    System.out.println("course name is "+courseName+" and course id is "  +courseid);
}
}
public class Main {
    public static void main(String[] args) {
	test obj1 = new test(23,"Maths");
	test obj2 = new test(25,"English");
	obj1.m1();
	obj2.m1();
    }
}
