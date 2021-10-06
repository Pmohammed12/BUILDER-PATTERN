package shoe;

public class ShoeBuilder implements Builder{

    State state;
    ShoeBuilder(Shoe shoe){
        state=new BuyState(shoe);
    }
    @Override
    public State buyState() {
        return state;
    }
}
