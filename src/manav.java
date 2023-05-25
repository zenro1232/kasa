import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,d,e;
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5;
        System.out.print("Lütfen kaç kg Armut alıcagınız yazınız :");
       a = input.nextDouble();
        System.out.print("Lütfen kaç kg Elma alıcagınız yazınız :");
        b = input.nextDouble();
        System.out.print("Lütfen kaç kg Domates alıcagınız yazınız :");
        c = input.nextDouble();
        System.out.print("Lütfen kaç kg Muz alıcagınız yazınız :");
        d = input.nextDouble();
        System.out.print("Lütfen kaç kg Patlıcan alıcagınız yazınız :");
       e = input.nextDouble();


        double  arm = a * armut,
        elm = b * elma,
        dom = c * domates,
        mu = d * muz,
        patlı = e * patlıcan;

        double total = arm + elm + dom + mu + patlı;



        System.out.println("Toplam tutar :" +total +"Tl");
  }
}
