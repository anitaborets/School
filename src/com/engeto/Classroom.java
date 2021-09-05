package com.engeto;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Classroom implements Print {
    static String nameClass;
    static int year;
    static Teacher teacher;
    static ListOfStudents list;

    public Classroom(String nameClass, int year, Teacher teacher, ListOfStudents list) {
        this.nameClass = nameClass;
        this.year = year;
        this.teacher = teacher;
        this.list = list;
    }

    public Classroom(String nameClass) {
        this.nameClass = nameClass;

    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        year = year;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ListOfStudents getList() {
        return list;
    }

    public void setList(ListOfStudents list) {
        this.list = list;
    }


    public static class ListOfStudents {
        ArrayList<Student> students = new ArrayList();

        public void addStudent(Student student) {
            students.add(student);
        }

        public void removeStudent(Student student) {
            students.remove(student);
        }

        public int getAmount() {
            return students.size();
        }

        @Override
        public String toString() {
            return "" + students;
        }
    }
    public void printList(ListOfStudents list, int count){
        System.out.println("***************** Vypis vo formatu 1 ****************");
        System.out.println("###########################################");
        System.out.println("Trida: " + Classroom.nameClass + " (rocnik: " + Classroom.year + ")");
        System.out.println("Tridni ucitel: " + Classroom.teacher.getSecondName() + ", " + Classroom.teacher.getName());
        System.out.println("Pocet studentu: " + list.students.size());
        System.out.println("###########################################");

        for (Student student : list.students) {
            System.out.println("# " + count + " # "+ student.getId() + " - " + student.getName() + " " + student.getSecondName() + "(" + student.getYearOfBirth() + ")");
            count++;
        }
        System.out.println("");
    }

public void printList(ListOfStudents list){

    System.out.println("***************** Vypis vo formatu 2 ****************");

    System.out.println(Classroom.nameClass + ", " + Classroom.teacher.getName() + " " + Classroom.teacher.getSecondName());

    for (Student student : list.students) {
        System.out.println(student.getId() + ", " + student.getName() + " " + student.getSecondName());
    }
}

    public void printList(ListOfStudents list, String fileName){

        System.out.println("***************** Vypis vo formatu 3 ****************");
        System.out.println("Tento popis budeme ukladat do suboru: " + fileName);
        System.out.println(Classroom.nameClass + ", " + Classroom.teacher.getName() + " " + Classroom.teacher.getSecondName());
        System.out.println(list);
    }

    public void exportToFile(String fileName, ListOfStudents list) throws Exception{
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(fileName))) {
            writer.println(Classroom.nameClass + ", " + Classroom.teacher.getName() + " " + Classroom.teacher.getSecondName());
            writer.println(list);
        }
        catch (FileNotFoundException e) {
            throw new Exception("Soubor " + fileName + " nenalezen: " + e.getLocalizedMessage());
        }
    }
}