package Models;

public class A6 extends Umschlag{

    public A6(){
        this(0.0);
    }

    public A6(double weight){
        super(weight);
    }

    @Override
    public String toString(){
        return "A6: " + super.toString();
    }

}