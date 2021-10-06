package shoe;

public class DestroyState implements State {

	Shoe shoe;
	public DestroyState(Shoe shoe) {
		this.shoe = shoe;
	}

	@Override
	public void buyShoe() {
		System.out.println("Buying shoe");
		shoe.setState(shoe.getBuyState());
	}

	@Override
	public void useShoe() {
		System.out.println("Shoes are used to protect and comfort the human foot");	
	}

	@Override
	public void washShoe() {
		System.out.println("Shoe broken, can not be cleaned");	

	}

	@Override
	public void destroyShoe() {
		System.out.println("Soap broke");

	}
	
	public String toString() {
		return "Destroy";
	}

}
