
import java.util.Scanner;

 public class Triangle {

  public static void main(String[] args) {

    int a,b;
    double c;

         Scanner inputPrice = new Scanner(System.in);
      System.out.print("Ilk veriyi giriniz'A': ");
      a= inputPrice.nextInt();


      Scanner outputPrice = new Scanner(System.in);
      System.out.print("Ikıncı veriyi giriniz'B': ");
        b=outputPrice.nextInt();

        c = Math.sqrt( (a*a) + (b*b) );
      System.out.println("Hipotenüs:" + c);

     }
 }