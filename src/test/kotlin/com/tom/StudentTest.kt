package com.tom.kotlin

import com.tom.student.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest{
    @Test
    fun higestTest(){
        val student=Student("Hank",60,80)
        Assertions.assertEquals(80,student.highest())
    }
    @Test
    fun averageTest(){
        val student=Student("Hank",60,80)
        Assertions.assertEquals((60+80)/2,student.getAverage())
    }
    /*@Test
    fun gradingTest(){
        val student=Student("Hank",60,80)
        Assertions.assertEquals('C',student.grading())
    }*/
}

