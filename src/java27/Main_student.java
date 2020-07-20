package java27;

import java.util.HashSet;

public class Main_student {
	
	public static void main(String[] args) {
		
		HashSet<Student> hashSet = new HashSet<Student>();
		hashSet.add(new Student("홍길동", 3));
		hashSet.add(new Student("이순신", 6));
		hashSet.add(new Student("장보고", 1));
		
		System.out.println(hashSet.toString());  //tostring은 제일 상단에 있으며, 위치값을 반환한다.
		
		Student student = new Student("이순신", 6);
		hashSet.remove(student);
		System.out.println(hashSet.toString());
	}

}
