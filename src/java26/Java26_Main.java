package java26;

import java.util.ArrayList;

public class Java26_Main {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("str0");
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		System.out.println(arrayList.toString());
		
		arrayList.set(2,  "str222222");
		System.out.println(arrayList.toString());
		
		arrayList.remove(2);
		System.out.println(arrayList.toString());
		
		System.out.println(arrayList.size());
		
		arrayList.clear();
		System.out.println(arrayList.toString());
		
		arrayList=null;
		System.out.println(arrayList);
	}

}
