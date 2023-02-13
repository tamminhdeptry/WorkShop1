package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import model.Student;
import java.util.ArrayList;

public class StudentList {
    random random = new random();
    ArrayList<Student> st = new ArrayList<>();
    
    public void setStudentList(ArrayList<Student> st) {
        this.st = st;
    }

    public ArrayList<Student> getStudents() {
        return st;
    }
     
    public Student createStudent(){
        String id = random.randomString();
        String name = random.randomString();
        String gender = random.randomGender();
        String date = random.randomday();
        Student student = new Student(id, name, gender, date);
        return student;
    }
    public void addStudent(int n){
        for(int i = 0 ; i < n ; i++){
           st.add(createStudent());
         
        }
    }
    public int size(){
        return st.size();
    }
    public Student get(int i){
        return st.get(i);
    }
    
    public String printout(){
        String result ="";
        for (Student student : st) {
            result += student.getId() + " " + student.getName() + " " + student.getGender() + " " + student.getDate();     
        }
        return result;
    }
    
    public static void main(String[] args) {
        StudentList st = new StudentList();
        st.addStudent(4);
        st.printout();
    }
}
