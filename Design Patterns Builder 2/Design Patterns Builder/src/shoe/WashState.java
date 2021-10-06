package shoe;

public class WashState implements State {

	Shoe shoe;
	public WashState(Shoe shoe) {
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
		shoe.setState(shoe.getUseState());
	}

	@Override
	public void washShoe() {
		System.out.println("Shoe broken, We can not use it");	
	}

	@Override
	public void destroyShoe() {
		System.out.println("shoe broke");
		shoe.setState(shoe.getDestroyState());
	}
	
	public String toString() {
		return "Shoe Cleaning";
	}

}
