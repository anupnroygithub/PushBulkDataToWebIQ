package com.qts.icam.Test;

import java.util.HashSet;
import java.util.Set;

public class TestMain {

	public static void main(String[] args) {
		String str = "ABCDEF";
		String str1 = "CDE";
		String str2 = "";
		for(int i=0; i<str.length(); i++) {
			for(int j=1; j<str1.length(); j++) {
				str2 = str2.concat(str.charAt(i)+"");
			}
			if(str2.equalsIgnoreCase(str1)) {
				System.out.println(i);
			}else {
				System.out.println("-1");
			}
		}
		
		/*TestClass t1 = new TestClass();
		TestClass t2 = new TestClass();
		
		t1.setName("Anup");
		
		t2 = t1;
		System.out.println(t1.getName());
		t2.setName("Roy");
		
		
		System.out.println(t2.getName());*/
		
		/*String str1 = new String("Anup");
		String str2 = "Anup";
		final String str3;
		str3 = str1.concat("Roy");
		System.out.println(str3);*/
		
		/*Set<TestClass> set = new HashSet<TestClass>();
		
		TestClass t1 = new TestClass();
		t1.setId(1);
		t1.setName("Anup");
		TestClass t2 = new TestClass();
		t2.setId(1);
		t2.setName("Anup");
		
		set.add(t1);
		set.add(t2);
		
		System.out.println(set);*/
	}
}
