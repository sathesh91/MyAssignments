package week3.day1.student;

import week3.day1.department.Department;

public class Student extends Department {

	public static void main(String[] args) {
		
	Student stud = new Student();

    stud.studentName();
    stud.studentDep();
    stud.studentID();
	stud.collegeName();
	stud.collegeCode();
	stud.collegeRank();
    stud.beCSE();
    stud.beIT();
    stud.beCSSW();
    stud.beMech();
    stud.beMechtronics();
    stud.beBTech();
    stud.beEC();
    stud.beEEE();
    stud.beCivi();
	}
	
    public void studentName()
    {
      System.out.println("Student Name: Sathesh Kumar M ");	
    }
    
    private void studentDep()
    {
      System.out.println("BE-CSE");	
    }
    
    protected void studentID()
    {
      System.out.println("Student ID: 20013156");	
    }

}
