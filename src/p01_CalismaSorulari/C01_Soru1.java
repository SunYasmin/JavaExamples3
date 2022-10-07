package p01_CalismaSorulari;

import java.util.Scanner;

public class C01_Soru1 {

    /*
  Crteate a program checks if a String is PALINDROME or not.
  If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
  For Example : "madam" or "nursesrun" .
  Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
  polindrome :tersten okunuşu da aynı olan ifadelerdir.
  ornek : Ey edip Adanada pide ye,  Traş niçin şart
   */

    /* tane tane alabailirsin
     Stringbuilder methodlari kullan karistirr
     method recursive kullan
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sozcuk veya cumle giriniz");
        String cumle = scan.nextLine();


        palindromKontrol(cumle);



    }

    private static void palindromKontrol(String cumle) {

        StringBuilder cumle1 = new StringBuilder();
        cumle1.append(cumle);
        String tersCumle = cumle1.reverse().toString();
        if (tersCumle.equals(cumle)){
            System.out.println(cumle +" ifadesi palindromdur");
        }else System.out.println( cumle+" ifadesi palindrom degildir");


    }

}
