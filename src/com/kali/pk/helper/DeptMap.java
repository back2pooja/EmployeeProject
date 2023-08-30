package com.kali.pk.helper;

import java.util.HashMap;

public class DeptMap {
	private static HashMap<String , Integer>deptMap;
	
	static {
		deptMap = new HashMap<>();
		deptMap.put("CRT", 1);
		deptMap.put("C", 2);
		deptMap.put("C++", 3);
		deptMap.put("JAVA",4);
		deptMap.put("PYTHON",5);
		deptMap.put("AWS", 6);
		deptMap.put("DevOps", 7);
		deptMap.put("SELENIUM", 8);
		deptMap.put("ORACLE", 9);
		deptMap.put("HTML", 10);
	}
		
		public static int getDeptID(String dept) {
			return deptMap.get(dept.toUpperCase());
		
		
	}

}
