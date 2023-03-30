package Models;

public class A5 extends Umschlag{

    public A5(){
        this(0.0);
    }

    public A5(double weight){
        super(weight);
    }

    @Override
    public String toString(){
        return "A5: " + super.toString();
    }

}