package Models;

public class FactoryUmschlag {
    public static Umschlag factory(UmschlagEnum typ, double weight){
        if(typ == UmschlagEnum.A4){ return new A4(weight); }
        else if (typ == UmschlagEnum.A5) { return new A5(weight); }
        else{ return new A6(weight);}
    }

}

