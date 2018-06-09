package project;

public abstract class Vechicle1 implements Travel,Owner{

	}


class Lorry extends Vechicle1{
	@Override
	public int getspeed() {
		return 0;
	
}

	@Override
	public String getOwnerName() {
		return null;
	}
}
	class Bus extends Vechicle1{
		@Override
		public int getspeed() {
			return 0;
		
	}

		@Override
		public String getOwnerName() {
			return null;
		}
	}
class Cycle extends Vechicle1{

	@Override
	public int getspeed() {
		
		return 0;
	}

	@Override
	public String getOwnerName() {
		return null;
	}
	
}

