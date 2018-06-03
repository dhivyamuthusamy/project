package com.personal1;

public class TestProfile {
	public static void printProfile(IProfile profile)
	{
		profile.myHobbies();
		profile.myBasicInfo();
		
}
	public static void main(String[] args) {
		IProfile myProfile = new SadhanaProfile();
		TestProfile.printProfile( myProfile);
		IProfile myprofile1 = new DhivyaProfile();
		TestProfile.printProfile(myprofile1);}
}