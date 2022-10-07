package p01_CalismaSorulari;

public class C03_Soru3 {
    /*
// Stringi ters cevirmek icin bir Java Programi yazin
//1.Yol: StringBuilder () kullanarak  // Interviews de bunu kullaninca inteview direk ONAYLAAARRR BİLİYOR DEERRRR
//2.Yol: String Classini kullanarak
//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
  */

    public static void main(String[] args) {
        //1. yol StringBuilder () kullanarak
        String input = "All İs well";

        StringBuilder str = new StringBuilder(); // string i stringBuilder a cevirdik

        str.append(input);//StringBuilder () methodudur
        System.out.println("str = " + str);

        String tersInput = str.reverse().toString();// hem ters cevirdik hem string e cevirdik TEK SATIRDAAAA

        //String tersInput=""+str.reverse();
        //Array e atama yaparak da cozulur
        // for loop olur
        //System.out.println(str.reverse());  clean code tek satirda yazdirma

        System.out.println("2. yol");
        int sonHarf = input.length() - 1;

        for (int i = sonHarf; i >= 0; i--) {

            System.out.println(input.charAt(i));//her bir karakteri alip yazdirdik yanyana
        }


    }
}