package java09;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {
		
		StudentManager manager = new StudentManager();
		manager.addStudent("ȫ�浿", 22, 20123487, "���ؿ�ȭ");
		manager.addStudent("ȫ���", 24, 20106428, "���а�");
		manager.addStudent("������", 21, 20135788, "������");
		manager.addStudent("��ö��", 23, 20114221, "ü����");
		manager.addStudent("�����", 26, 20089883, "�����");
		
		System.out.println(manager.students.get(0).getName());
		System.out.println(manager.students.get(0).getAge());
		System.out.println(manager.students.get(0).getStudentNum());
		System.out.println(manager.students.get(0).getMajor());
		
	}
	
	private void addStudent(String name, int age, int studentNum, String major) {
		// TODO Auto-generated method stub
		students.add(new Student(name, age, studentNum, major));
		System.out.println(name + " + �л� �����Է� ����!!!");
	}

}
