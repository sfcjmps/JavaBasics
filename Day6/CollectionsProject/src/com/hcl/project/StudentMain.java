package com.hcl.project;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

public class StudentMain {
	
    static ResourceBundle rb = ResourceBundle.getBundle("project");
	public static void deleteStudent() {
		int sno;
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter StudentNo  ");
		System.out.println(rb.getString("stdno"));
		sno=sc.nextInt();
		StudentBAL obj=new StudentBAL();
		String res=obj.deleteStudentBal(sno);
		System.out.println(res);
	}
	public static void updateStudent() {
		Student objStudent=new Student();
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter StudentNo  ");
		System.out.println(rb.getString("stdno"));
		objStudent.setSno(Integer.parseInt(sc.nextLine()));
//		System.out.println("Enter Student Name  ");
		System.out.println(rb.getString("stdnm"));
		objStudent.setName(sc.nextLine());
//		System.out.println("Enter Student City  ");
		System.out.println(rb.getString("stdct"));
		objStudent.setCity(sc.nextLine());
//		System.out.println("Enter Cgp  ");
		System.out.println(rb.getString("stdcgp"));
		objStudent.setCgp(Double.parseDouble(sc.nextLine()));
		StudentBAL obj=new StudentBAL();
		String res=obj.updateStudentBal(objStudent);
		System.out.println(res);
	}
	public static void showStudent() {
		StudentBAL obj=new StudentBAL();
		List<Student> lstStudent=obj.showStudentBal();
		for (Student student : lstStudent) {
			System.out.println(student);
		}
	}
	public static void searchStudent() {
		int sno;
//		System.out.println("Enter Student No  ");
		System.out.println(rb.getString("stdno"));
		Scanner sc=new Scanner(System.in);
		sno=sc.nextInt();
		StudentBAL obj=new StudentBAL(); 
		Student objStudent=obj.searchStudentBal(sno);
		if(objStudent!=null) {
			System.out.println(objStudent);
		} else {
//			System.out.println("Record not found...");
			System.out.println(rb.getString("notfound"));
		}
		
	}
	public static void addStudent() {
		Student objStudent=new Student();
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter StudentNo  ");
		System.out.println(rb.getString("stdno"));
		objStudent.setSno(Integer.parseInt(sc.nextLine()));
//		System.out.println("Enter Student Name  ");
		System.out.println(rb.getString("stdnm"));
		objStudent.setName(sc.nextLine());
//		System.out.println("Enter Student City  ");
		System.out.println(rb.getString("stdct"));
		objStudent.setCity(sc.nextLine());
//		System.out.println("Enter Cgp  ");
		System.out.println(rb.getString("stdcgp"));
		objStudent.setCgp(Double.parseDouble(sc.nextLine()));
		StudentBAL obj=new StudentBAL();
		try {
			boolean res=obj.addStudentBal(objStudent);
			if(res==true) {
//				System.out.println("Student Record Added");
				System.out.println(rb.getString("added"));
			}
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Options");
			System.out.println("---------");
			System.out.println("1. Add Student");
			System.out.println("2. Show Student");
			System.out.println("3. Search Student");
			System.out.println("4. Update Student");
			System.out.println("5. Delete Student");
			System.out.println("6. Exit");
//			System.out.println("Enter your Choice  ");
			System.out.println(rb.getString("choice"));
			ch=sc.nextInt();
			switch(ch) {
			case 1 : 
				addStudent();
				break;
			case 2 :
				showStudent();
				break;
			case 3 :
				searchStudent();
				break;
			case 4 : 
				updateStudent();
				break;
			case 5 : 
				deleteStudent();
				break;
			case 6 : 
				return;
			default : 
//				System.out.println("Invalid Choice");
				System.out.println(rb.getString("invalid"));
			}
		} while(ch!=6);
	}
}