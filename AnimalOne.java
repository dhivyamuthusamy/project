package project;

public abstract class AnimalOne implements Travel {

}

class Cat extends AnimalOne{

	@Override
	public int getspeed() {
		
		return 0;
	}
class Rat extends AnimalOne{

	@Override
	public int getspeed() {
		return 0;
	}
	
}
class Kangaroo extends AnimalOne{

	@Override
	public int getspeed() {
		return 0;
	}
	
}
}