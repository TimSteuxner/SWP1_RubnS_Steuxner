import Models.*;
public class MainMenu {

    public static void main(String[] args) {
        Umschlag a4 = FactoryUmschlag.factory(UmschlagEnum.A4, 23.2);
        Umschlag a6 = FactoryUmschlag.factory(UmschlagEnum.A6, 10);

        System.out.println(a4);
        System.out.println(a6);
    }

}
