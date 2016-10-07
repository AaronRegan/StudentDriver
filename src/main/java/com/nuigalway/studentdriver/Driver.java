/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuigalway.studentdriver;


import com.nuigalway.studentmain.Course;
import com.nuigalway.studentmain.Module;
import com.nuigalway.studentmain.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTime;

/**
 *
 * @author Aaron
 */
public class Driver {
    public static void main(String[] args)
    {
   Student S1 = new Student("Aaron", "13446668", "CS", "21", "11/01/1995");
   Student S2 = new Student("Steve", "13459800", "CS", "20", "25/09/1995");
   Student S3 = new Student("Jane", "16734009", "BP", "22", "31/03/1995");
   Student S4 = new Student("John", "12165342", "BP", "21", "15/04/1995");
   
   List<Student> CT417L= new ArrayList();
   CT417L.add(S1);
   CT417L.add(S2);
   Module CT417 = new Module("Software Engineering","CT417",CT417L);
   
   List<Student> CT475L= new ArrayList();
   CT475L.add(S1);
   CT475L.add(S2);
   CT475L.add(S3);
   CT475L.add(S4);
   Module CT475 = new Module("Machine Learning","CT475",CT475L);
   
   List<Student> EE445L= new ArrayList();
   EE445L.add(S1);
   EE445L.add(S2);
   EE445L.add(S3);
   EE445L.add(S4);
   Module EE445 = new Module("Digital Signal Processing","EE445",EE445L);
   
   List<Student> EE451L= new ArrayList();
   EE451L.add(S3);
   EE451L.add(S4);
   Module EE451 = new Module("System on Chip","EE451",EE451L);
   
   List<Module> BPL= new ArrayList();
   BPL.add(EE451);
   BPL.add(EE445);
   BPL.add(CT475);
   DateTime SBP = new DateTime(2016, 9, 4,0,0,0);
   DateTime EBP = new DateTime(2017, 5, 25,0,0,0);
   Course BP = new Course("Electronic and computer Engineering",BPL,SBP,EBP);
   
   List<Module> CSL= new ArrayList();
   CSL.add(EE445);
   CSL.add(CT417);
   CSL.add(CT475);
   DateTime SCS = new DateTime(2016, 9, 4,0,0,0);
   DateTime ECS = new DateTime(2017, 6, 04,0,0,0);
   Course CS = new Course("Computer Science",CSL,SCS,ECS);
   
   String Sc1 = S1.getStudentCourse();
   System.out.println(Sc1);
   String Sc2 = S2.getStudentCourse();
   System.out.println(Sc2);
   String Sc3 = S3.getStudentCourse();
   System.out.println(Sc3);
   String Sc4 = S4.getStudentCourse();
   System.out.println(Sc4);
   
   String ComputerScience = CS.getCourse();
   System.out.println(ComputerScience);
   
   String ComputerEng = BP.getCourse();
   System.out.println(ComputerEng);
    }
   }
    
