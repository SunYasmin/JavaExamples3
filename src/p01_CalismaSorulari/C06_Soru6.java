package p01_CalismaSorulari;

public class C06_Soru6 {

    /*
int arr [][]=
verilen Array icinde
--> kac tane eleman oldugunu return eden methodu yazdiriniz
//cevap : 13 donsun
*/
    public static void main(String[] args) {// ilk basta icice array icin ic ice forloop AKLIMIZA GELMELII

        int arr [][] = {{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};// outer loop 4 icte 13 inner

        elemanSayisi(arr);
        System.out.println("elemanSayisi(arr) = " + elemanSayisi(arr)); // method call yaptim



    }

    private static int elemanSayisi(int[][] arr) {// bu sorularda SAYAC OLMAK ZORUNDAAAA
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {// outer loop icin
            for (int j = 0;  j< arr[i].length ; j++) {  // inner loop icin
                sayac++;

                System.out.println(arr[i][j]);
            }

        }
        return sayac;
    }



}
