import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yaricap;
        float pi= (float)3.14;
        System.out.println("Dairenin yarıçapını giriniz:");
        yaricap = input.nextInt();
        float alan = (pi*yaricap*yaricap);
        float cevre = 2*pi*yaricap;
        System.out.println("Çemberin alanı:" + alan);
        System.out.println("Çemberin çevresi:" + cevre );

    }
}