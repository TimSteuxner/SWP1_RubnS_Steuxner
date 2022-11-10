

public class Endrekusiv_Fakultat {

    public static void main(String[] args) {
        int zahlEingabe = 5;

        System.out.println(zahl(zahlEingabe));
    }

    public static int zahl(int x){
        return fakultat(1, x);
    }

    public static int fakultat(int y, int x){
        if(x == 0){
            return y;
        }else
            return fakultat(y*x, x-1);
        }
    }

