/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.mycompany.hellof46.Student;

/**
 *
 * @author DELL
 */
public class ParttimeStudent extends Student {

    public ParttimeStudent(int numofCourse, String sID, String sName) {
        super(sID, sName);
        this.numofCourse = numofCourse;
    }
    private int numofCourse;

    public int getNumofCourse() {
        return numofCourse;
    }

    public void setNumofCourse(int numofCourse) {
        this.numofCourse = numofCourse;
    }
    
}
