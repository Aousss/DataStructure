/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T01;

/**
 *
 * @author firda
 */

class Person {
    public Person() {
        System.out.println("(1) Performs Person's tasks");
    }
}
class Employee extends Person {
    public Employee() {
        this("(2) Invoke Employee's overload constructor");
        System.out.println("(3) Performs Employee's tasks");
    }
    public Employee(String s) {
        System.out.println(s);
    }
}
public class Faculty extends Employee {
    public Faculty() {
        System.out.println("(4) Performs Faculty's tasks");
    }
    public static void main(String[] args) {
        new Faculty();
    }
}

//ANSWER:
//(1) Performs Person's tasks
//(2) Invoke Employee's overload constructor
//(3) Performs Employee's tasks
//(4) Performs Faculty's tasks