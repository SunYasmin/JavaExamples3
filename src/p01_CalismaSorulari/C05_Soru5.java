package p01_CalismaSorulari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_Soru5 {

    /*
Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
0-1-1-2-3-5-8-13-21-34....
*/
    public static void main(String[] args) {
        List<Integer> fibonacciList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();

        fibonacciList.add(0);
        fibonacciList.add(1);
        System.out.println("fibonacciList = " + fibonacciList);


        int i = 1;// while sartini olusturmak icin kullandik

        if(sayi<=1){  // burda sayi sondan aliniyor  i 1 den basladigi icin
            System.out.println("Lutfen pozitif bir tamsayi giriniz");
        }else {
            while(fibonacciList.get(i)< sayi){ // fibonacci elemanlari sayidan kucuk oldugu muddetce yaz devam et
                fibonacciList.add(fibonacciList.get(i)+fibonacciList.get(i-1));
                i++;
            }
            System.out.println(fibonacciList);
        }


        int sonIndextekiEleman = fibonacciList.size()-1;
        if (fibonacciList.get(sonIndextekiEleman)> sayi){
            fibonacciList.remove(sonIndextekiEleman); // burasi son elemani kaldirir
            System.out.println("Girdigin sayi Fibonacci dizisinde bulunmamaktadir. " + "\nSizin girdiginiz sayiya kadar ki Fibonacci dizisi su sekildedir : "+ fibonacciList);
        }else{
            System.out.println("Giridiginiz sayi Fibonacci listinde var Fibonacci List = "+ fibonacciList);
        }

    }

}
