package Models;

public abstract class Umschlag {

    private double _weight;

    public double getWeight(){
        return this._weight;
    }

    public void setWeight(double weight){
        this._weight = weight;
    }

    public Umschlag(){this(0.0);}

    public Umschlag(double weight){
        this._weight = weight;
    }

    @Override
    public String toString(){
        return this._weight + " [g]";
    }


}
