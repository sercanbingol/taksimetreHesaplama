
import java.util.Scanner;

 class TaksimetreHesaplama {
    public static void main(String[] args) {
        int acilis = 10;
        double km = 2.20 , gidilenMesafe , tutar=20 ;

        System.out.print("Gidilen mesafe (km) : ");
        Scanner input = new Scanner(System.in);
        gidilenMesafe = input.nextDouble();

        tutar = (gidilenMesafe*km+acilis>tutar)? gidilenMesafe*km+acilis : tutar;
        System.out.println("Gidilen mesafeye göre taksimetre tutari: " + tutar);

    }
}