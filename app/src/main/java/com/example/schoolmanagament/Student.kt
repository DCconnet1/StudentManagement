package com.example.schoolmanagament

class Student {
    private var studentName : String = ""
    private var studentNumber : Long = 0L

    constructor(studentName : String,studentNumber : Long){

        this.studentName = studentName
        this.studentNumber = studentNumber
    }
    fun getStudentName():String{
        return studentName
    }

    fun getStudentNumber() : Long{
        return studentNumber
    }


}