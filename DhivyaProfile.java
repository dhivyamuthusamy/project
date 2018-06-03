package com.personal1;

public class DhivyaProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstants.FIRST_NAME+" dhivi");
		System.out.println(ProfileConstants.LAST_NAME+" kala");
		System.out.println("Age : twenty");
	}

	@Override
	public void myHobbies() {
		System.out.println("my hobbies are drawing");
		
	}

	
}
