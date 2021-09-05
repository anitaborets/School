package com.engeto;

import java.io.FileNotFoundException;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	Teacher teacher = new Teacher("Jan","Novak");
	Student student1 = new Student("Petr","Svoboda",2011,"ID001");
    Student student2 = new Student("Milan","Riha",2010,"ID123");
    Student student3 = new Student("Jindrich","Novy",2012,"ID345");
    int count = 1;
    String fileName = "trieda.txt";

    Classroom.ListOfStudents list = new Classroom.ListOfStudents();
        list.addStudent(student1);
        list.addStudent(student2);
        list.addStudent(student3);

    Classroom studentClass = new Classroom("4.C", 4, teacher,list);
    student1.print();
    teacher.print();

    studentClass.printList(list, count);
    studentClass.printList(list);
    studentClass.printList(list, fileName);
        try {
            studentClass.exportToFile(fileName,list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
