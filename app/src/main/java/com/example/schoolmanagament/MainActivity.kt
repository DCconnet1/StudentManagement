package com.example.schoolmanagament

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val studentName : EditText
        val studentNumber : EditText
        val saveStudentButton : Button
        var enteredStudentName : String = ""
        var enteredStudentNumber : Long = 0L
        var studentList : ArrayList<Student> = arrayListOf<Student>()


        studentName = findViewById(R.id.studentName)
        studentNumber = findViewById(R.id.studentNumber)
        saveStudentButton = findViewById(R.id.saveStudentButton)

        saveStudentButton.setOnClickListener(View.OnClickListener {
            enteredStudentName = studentName.text.toString()
            enteredStudentNumber = studentNumber.text.toString().toLong()
            studentList.add(Student(enteredStudentName,enteredStudentNumber))

        })






    }
}