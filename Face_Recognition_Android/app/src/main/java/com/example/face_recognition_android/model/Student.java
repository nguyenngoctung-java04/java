package com.example.face_recognition_android.model;

public class Student {
    private int studentId;
    private int imgId;
    private String studentName;
    private String studentDesc;

    public Student() {
    }

    public Student(int studentId, int imgId, String studentName, String studentDesc) {
        this.studentId = studentId;
        this.imgId = imgId;
        this.studentName = studentName;
        this.studentDesc = studentDesc;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDesc() {
        return studentDesc;
    }

    public void setStudentDesc(String studentDesc) {
        this.studentDesc = studentDesc;
    }
}


