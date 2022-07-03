package com.gl.assignment1;

public class Main {

	public static void main(String[] args) {
		
		//Creating object of AdminDepartment class and calling its classes
		AdminDepartment ad = new AdminDepartment();
		System.out.println("Welcome to " + ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		System.out.println();
		
		//Creating object of HrDepartment class and calling its classes
		HrDepartment hd = new HrDepartment();
		System.out.println("Welcome to " +hd.departmentName());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(hd.isTodayAHoliday());
		System.out.println();
		
		//Creating object of TechDepartment class and calling its classes
		TechDepartment td = new TechDepartment();
		System.out.println("Welcome to " +td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());
	}
}
