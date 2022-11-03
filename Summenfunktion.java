public class Summenfunktion {

    public static void main(String[] args) {
        int ergebnis = summenfunktion(6);
        System.out.printf("Summenfunktion von 6 ist %d \n", ergebnis);
        int zahl1 = 5, sum=0;
        do{
             sum += zahl1;
             zahl1 --;

        }while(zahl1 >= 1);
        System.out.printf("Summe von 5 ist %d ", sum);
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
