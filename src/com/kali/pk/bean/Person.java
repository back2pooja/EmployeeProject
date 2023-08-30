package com.kali.pk.bean;

import java.io.Serializable;

public class Person implements Serializable {
		private static final long serialVersionUID = 1L;
		
		private int eyes;
		private int ears;
		private int hands;
		private int legs;
		
		private String name;
		private double height;
		private double weight;
		private String gender;
		private String bloodGroup;
		private String dob;
		private String identificationMarks;
		private long mobile;
		private String email;
		
		
		private String fatherName;
		private String motherName;
		private String surName;
		private String maritalStatus;
		private String nationality;
		private String religious;
		private String motherTounge;
		private boolean vacinated1stDose;
		private boolean vacinated2ndDose;
		private boolean vacinatedBoosterDose;
		
		
		private int age;
		private int aadhaar;
		private String voterID;
		private String pan;
		private String passport;
		private String address;
		
		{
			eyes  = 2;
			ears  = 2;
			hands = 2;
			legs  = 2;
		}
		public Person() {
			
		}
		
		public Person(String name, double height , double weight , String gender ,String bloodGroup,String dob) {
			this.name = name;
			this.height = height;
			this.weight = weight;
			this.gender = gender;
			this.bloodGroup = bloodGroup;
			this.dob =dob;
		}
		public int getEyes() {
			return eyes;
		}
		public void setEyes(int eyes) {
			this.eyes= eyes;
		}
		
		
		public int getEars() {
			return ears;
		} 
		public void setEars(int ears) {
			this.ears = ears;
		}
		
		public int setHands() {
			return hands;
		}
		public void getHands(int hands) {
			this.hands = hands;
		}
		
		public int getLegs() {
			return legs;
		}

		public void setLegs(int legs) {
			this.legs = legs;
			}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight= weight;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender= gender;
		}
		public String getBloodGroup() {
			return bloodGroup;
		}
		public void setBloodGroup(String bloodGroup) {
			this.bloodGroup = bloodGroup;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}

		public long getMobile() {
			return mobile;
		}

		public void setMobile(long mobile) {
			this.mobile = mobile;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getAadhaar() {
			return aadhaar;
		}

		public void setAadhaar(int aadhaar) {
			this.aadhaar = aadhaar;
		}

		public String getVoterID() {
			return voterID;
		}

		public void setVoterID(String voterID) {
			this.voterID = voterID;
		}

		public String getPan() {
			return pan;
		}

		public void setPan(String pan) {
			this.pan = pan;
		}

		public String getPassport() {
			return passport;
		}

		public void setPassport(String passport) {
			this.passport = passport;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		public void eat() {
			System.out.println(name+"  is eating ");
		}
		public void sleep() {
			System.out.println(name +" is sleeping");
		}
		public void walk() {
			System.out.println(name +" is walking");
		}
		public void learn() {
			System.out.println(name + " is learning");
		}
		@Override
		public int hashCode() {
			return aadhaar;
		}
		public boolean equals(Object obj) {
			if(obj instanceof Person p) {
				return this.aadhaar == p.aadhaar;
				
				
			}
			return false;
		}
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("===============Personal details============");
			sb.append(name +"      name");
			sb.append(height+"     height");
			sb.append(weight+"     weight");
			sb.append(gender+"     gender");
			sb.append(aadhaar+"    aadhaar");
			sb.append(age +"       age");
			sb.append(bloodGroup+" bloddGroup");
			sb.append(dob+"        dob");
			sb.append(voterID+"    voterID");
			sb.append(pan+ "       pan");
			sb.append(email+"      email");
			sb.append(mobile +"    moblie");
			
			
			sb.append(ears+        "ears");
			sb.append(hands+       "hands");
			sb.append(legs+        "legs");
			sb.append(eyes+        "eyes");
			
			sb.append("===============Address details============");
			sb.append(address+     "address");
			
			return sb.toString();

		}
}
