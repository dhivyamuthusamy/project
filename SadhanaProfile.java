package com.personal1;

public class SadhanaProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstants.FIRST_NAME+" sadhana");
		System.out.println(ProfileConstants.LAST_NAME+"sri");
		System.out.println("Age : nineteen");
	}

	@Override
	public void myHobbies() {
		System.out.println("Her Hobbies are reading and painting");
	
	
	}

}
