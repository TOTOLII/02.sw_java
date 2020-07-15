package java09;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {
		
		StudentManager manager = new StudentManager();
		manager.addStudent("È«±æµ¿", 22, 20123487, "¿µ±Ø¿µÈ­");
		manager.addStudent("È«±æ¼ø", 24, 20106428, "¼öÇĞ°ú");
		manager.addStudent("ÀÌÀº°æ", 21, 20135788, "±¹¹®°ú");
		manager.addStudent("±èÃ¶¼ö", 23, 20114221, "Ã¼À°°ú");
		manager.addStudent("±è¼øÈñ", 26, 20089883, "¹«¿ë°ú");
		
		System.out.println(manager.students.get(0).getName());
		System.out.println(manager.students.get(0).getAge());
		System.out.println(manager.students.get(0).getStudentNum());
		System.out.println(manager.students.get(0).getMajor());
		
	}
	
	private void addStudent(String name, int age, int studentNum, String major) {
		// TODO Auto-generated method stub
		students.add(new Student(name, age, studentNum, major));
		System.out.println(name + " + ÇĞ»ı Á¤º¸ÀÔ·Â ¼º°ø!!!");
	}

}
