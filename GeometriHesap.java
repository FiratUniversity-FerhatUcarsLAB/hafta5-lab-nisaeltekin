/*
 * Ad Soyad: [NİSANUR ELTEKİN]
 * Ogrenci No: [250541100]
 * Tarih: [12.11.2025]
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

package V1;

import java.util.Scanner;

public class GeometriHesap {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        //Kare
        System.out.printf("Karenin kenar uzunluğunu giriniz: ");
        double kenar_uzunlugu  = scan.nextDouble();
        double kare_alan = calculateSquareArea(kenar_uzunlugu);
        double kare_cevre = calculateSquarePerimeter(kenar_uzunlugu);
        System.out.println("Karenin Alanı: " +kare_alan);
        System.out.println("Karenin Cevresi: " +kare_cevre);

        //Dikdörtgen
        System.out.println(" ");
        System.out.printf("Dikdörtgenin kısa kenarını giriniz: ");
        double kisa_kenar = scan.nextDouble();
        System.out.printf("Dikdörtgenin uzun kenarını giriniz: ");
        double uzun_kenar = scan.nextDouble();
        double dikdortgen_alan = calculateRectangleArea(kisa_kenar, uzun_kenar);
        double dikdortgen_cevre = calculateRectanglePerimeter(kisa_kenar, uzun_kenar);
        System.out.println("Dikdörtgenin Alanı: " +dikdortgen_alan);
        System.out.println("Dikdörtgenin Cevresi: " +dikdortgen_cevre);

        //Daire
        System.out.println(" ");
        System.out.printf("Dairenin yarıcapini giriniz: ");
        double yaricap = scan.nextDouble();
        double daire_alan = calculateCircleArea(yaricap);
        double daire_cevre = calculateCircleCircumference(yaricap);
        System.out.println("Dairenin Alanı: " +daire_alan);
        System.out.println("Dairenin Cevresi: " +daire_cevre);

        //Ücgen
        System.out.println(" ");
        System.out.printf("Üçgenin birinci kenar uzunluğunu giriniz: ");
        double kenar_bir = scan.nextDouble();
        System.out.printf("Üçgenin ikinci kenar uzunluğunu giriniz: ");
        double kenar_iki = scan.nextDouble();
        System.out.printf("Üçgenin üçüncü kenar uzunluğunu giriniz: ");
        double kenar_uc = scan.nextDouble();
        double ucgen_alan = calculateTriangleArea(kenar_bir, kenar_iki, kenar_uc);
        double ucgen_cevre = calculateTrianglePerimeter(kenar_bir, kenar_iki, kenar_uc);
        System.out.println("Üçgenin Alanı = " +ucgen_alan);
        System.out.println("Üçgenin Çevresi = " +ucgen_cevre);

        //Sonuçlar ekrana bastırılıyor
        System.out.println("\n========================");
        System.out.println("  HESAPLAMA SONUCLARI");
        System.out.println("========================");
        System.out.println("KARE (kenar: " +kenar_uzunlugu + " cm)");
        System.out.println("Alan:" +kare_alan + " cm²");
        System.out.println("Cevre:" +kare_cevre + " cm");
        System.out.println("");
        System.out.println("DİKDÖRTGEN (" +uzun_kenar+ " * " +kisa_kenar + " cm)");
        System.out.println("Alan:" +dikdortgen_alan +" cm²");
        System.out.println("Cevre:" +dikdortgen_cevre +" cm");
        System.out.println("");
        System.out.println("DAİRE (yaricap: " +yaricap + " cm)");
        System.out.println("Alan:" +daire_alan +" cm²");
        System.out.println("Cevre:" +daire_cevre +" cm");
        System.out.println("");
        System.out.println("UCGEN (Kenarlar: " + kenar_bir +"," +kenar_iki + "," +kenar_uc + " cm"+ ")");
        System.out.println("Alan:" +ucgen_alan+ " cm²");
        System.out.println("Cevre:" +ucgen_cevre+ " cm");

        scan.close();
    }

    //kare alan
    public static double calculateSquareArea(double kenar_uzunlugu){
        double alan = Math.pow(kenar_uzunlugu, 2);
        return alan;
    }

    //kare cevre
    public static double calculateSquarePerimeter(double x){
        return 4 * x;
    }

    //dikdörtgen alan
    public static double calculateRectangleArea(double kisa_kenar, double uzun_kenar){
        return kisa_kenar * uzun_kenar;
    }

    //dikdörtgen cevre
    public static double calculateRectanglePerimeter(double kisa_kenar, double uzun_kenar ){
        return 2 * (kisa_kenar + uzun_kenar);
    }

    //daire alan
    public static double calculateCircleArea(double yaricap){
        return Math.PI * Math.pow(yaricap, 2);
    }

    //daire cevre
    public static double calculateCircleCircumference(double yaricap){
        return 2  * Math.PI * yaricap;
    }

    //ücgen alan
    public static double calculateTriangleArea(double kenar_bir, double kenar_iki, double kenar_uc) {
        double s = (kenar_bir + kenar_iki + kenar_uc) / 2.0;
        return Math.sqrt(s * (s - kenar_bir) * (s - kenar_iki) * (s - kenar_uc));
    }

    //ücgen cevre
    public static double calculateTrianglePerimeter(double kenar_bir, double kenar_iki, double kenar_uc) {
        return kenar_bir + kenar_iki + kenar_uc;

    }

}
