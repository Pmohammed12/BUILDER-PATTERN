package shoe;

public class BuyState implements State {

	Shoe shoe;
	public BuyState(Shoe shoe) {
		this.shoe = shoe;
	}

	@Override
	public void buyShoe() {
		System.out.println("Buying Shoes");	

	}

	@Override
	public void useShoe() {
		System.out.println("Shoes are used to protect and comfort the human foot");
		shoe.setState(shoe.getUseState());

	}

	@Override
	public void washShoe() {
		System.out.println("cleaning Shoe");	
		shoe.setState(shoe.getWashState());
	}

	@Override
	public void destroyShoe() {
		System.out.println("Shoe Destroyed");
		shoe.setState(shoe.getDestroyState());
	}
	public String toString() {
		return "brought";
	}
}
