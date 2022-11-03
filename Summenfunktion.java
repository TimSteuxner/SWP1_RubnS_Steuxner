public class Summenfunktion {

    public static void main(String[] args) {
        int ergebnis = summenfunktion(6);
        System.out.printf("Summenfunktion von 6 ist %d", ergebnis);
    }

    public static int summenfunktion(int zahl){
        if(zahl>=1) {
            return zahl + summenfunktion(zahl - 1);
        }
        else{
            return zahl;
        }
    }
}
