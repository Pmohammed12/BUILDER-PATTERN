package shoe;

public class Shoe 
{
	UseState useState;
	WashState washState;
	BuyState buyState;
	DestroyState destroyState;
	State state;
	ShoeBuilder sb;
	
	Shoe()
	{
		useState = new UseState(this);
		washState= new WashState(this);
		destroyState = new DestroyState(this);
		sb=new ShoeBuilder(this);

		state = sb.buyState();
		buyState= (BuyState) sb.state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}

	public UseState getUseState() {
		return useState;
	}

	public WashState getWashState() {
		return washState;
	}

	public BuyState getBuyState() {
		return buyState;
	}

	public DestroyState getDestroyState() {
		return destroyState;
	}
	
	public void buyShoe()	{
		state.buyShoe();
	}
	
	public void useShoe()	{
		state.useShoe();
	}
	
	public void washShoe() {
		state.washShoe();
	}
	public void destroyShoe() {
		state.destroyShoe();
	}
	
	public String toString() {
		StringBuffer sbuffer=new StringBuffer();
		
		sbuffer.append("\nShoe State  \nShoe "+state);
		
		return sbuffer.toString();
	}
}
