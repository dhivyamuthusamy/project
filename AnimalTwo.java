package project;

public abstract class AnimalTwo implements Travel ,Owner{

}

class Cat extends AnimalTwo{

	@Override
	public int getspeed() {
		
		return 0;
	}

	@Override
	public String getOwnerName() {
		return null;
	}
}
class Rat extends AnimalTwo{

	@Override
	public int getspeed() {
		return 0;
	}

	@Override
	public String getOwnerName() {
		return null;
	}
	
}
class Kangaroo extends AnimalTwo{

	@Override
	public int getspeed() {
		return 0;
	}
	

@Override
public String getOwnerName() {
	return null;
}
}