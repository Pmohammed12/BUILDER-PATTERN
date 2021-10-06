package shoe;

public class UseState implements State{

	Shoe shoe;
	public UseState(Shoe shoe) {
		this.shoe = shoe;
	}

	@Override
	public void buyShoe() {
		System.out.println("Shoe already brought");	
		shoe.setState(shoe.getBuyState());	
		
	}

	@Override
	public void useShoe() {
		System.out.println("Shoes are used to protect and comfort the human foot");	
	}

	@Override
	public void washShoe() {
		System.out.println("Work finished with shoe, cleaning shoe");
		shoe.setState(shoe.getWashState());
	}

	@Override
	public void destroyShoe() {
		System.out.println("Shoe Destroyed");
		shoe.setState(shoe.getDestroyState());		
	}
	
	public String toString() {
		return "Protect Foot";
	}


}
