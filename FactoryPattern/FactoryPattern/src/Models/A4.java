package Models;

public class A4 extends Umschlag{

    public A4(){
        this(0.0);
    }

    public A4(double weight){
        super(weight);
    }

    @Override
    public String toString(){
        return "A4: " + super.toString();
    }

}
