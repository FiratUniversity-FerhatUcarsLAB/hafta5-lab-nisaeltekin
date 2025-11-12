/*
 * Ad Soyad: [NİSANUR ELTEKİN]
 * Ogrenci No: [2505411000]
 * Tarih: [12.11.2025]
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

package V1;

import java.util.Scanner;

public class SepetHesap {

    final static double kargo = 29.99;
    final static double kdv = 0.18;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n === E-TİCARET SEPET HESAPLAYICI === ");
        System.out.println("\nLutfen 3 urunun bilgilerini girin: ");

        //URUN 1 Bilgileri
        System.out.println("\nURUN 1: ");
        System.out.printf("Birim Fiyat (TL): ");
        double urun1 = input.nextDouble();
        System.out.printf("Adet: ");
        double adet1 = input.nextDouble();
        System.out.println("");

        //URUN 2 Bilgileri
        System.out.println("URUN 2: ");
        System.out.printf("Birim Fiyat (TL): ");
        double urun2 = input.nextDouble();
        System.out.printf("Adet: ");
        double adet2 = input.nextDouble();
        System.out.println("");

        //URUN 3 Bilgileri
        System.out.println("URUN 3: ");
        System.out.printf("Birim Fiyat (TL): ");
        double urun3 = input.nextDouble();
        System.out.printf("Adet: ");
        double adet3 = input.nextDouble();
        System.out.println("");

        //İndirim Bilgisi
        System.out.printf("Indirim Kuponu Yüzdesi(): ");
        double indirimKuponuYuzdesi = input.nextDouble();
        System.out.println("");

        //Hesaplamalar
        double urun1Toplam = calculateLineTotal(urun1, adet1);
        double urun2Toplam = calculateLineTotal(urun2, adet2);
        double urun3Toplam = calculateLineTotal(urun3, adet3);
        double araToplam = calculateSubtotal(urun1Toplam, urun2Toplam, urun3Toplam);
        double indirimTutari = calculateDiscountAmount(araToplam, indirimKuponuYuzdesi);
        double indirimliToplam = applyDiscount(araToplam, indirimTutari);
        double kdvTutari = calculateVAT(indirimliToplam, kdv);
        double genelToplam = calculateGrandTotal(indirimliToplam, kdvTutari, kargo);

        //Sonuçlar ekrana bastırılıyor
        System.out.println("===========================================");
        System.out.println("             SİPARİS OZETİ");
        System.out.println("===========================================");
        System.out.println("Urun 1 Toplam ("+urun1+ " TL * " +adet1+")   : "+urun1Toplam+ " TL");
        System.out.println("Urun 2 Toplam ("+urun2+ " TL * " +adet2+")    : "+urun2Toplam+ " TL");
        System.out.println("Urun 3 Toplam ("+urun3+ " TL * " +adet3+")   : "+urun3Toplam+ " TL");
        System.out.println("-------------------------------------------");
        System.out.println("Ara Toplam                       : "+araToplam+ " TL");
        System.out.println("");
        System.out.println("Indirim Tutari ("+indirimKuponuYuzdesi+")            : "+"-"+indirimTutari+ " TL");
        System.out.println("Indirimli Toplam                 : "+indirimliToplam+ " TL");
        System.out.println("");
        System.out.printf("KDV Tutari (%%18)                 : +%.2f " , kdvTutari);
        System.out.println("\nKargo Ucreti                     : "+"+"+kargo+ " TL");
        System.out.println("--------------------------------------------");
        System.out.printf("Genel Toplam                     : "+genelToplam+ " TL");

        input.close();

    }
    // METOT 1: Bir urunun toplam fiyatini hesaplar (urun * adet)
    public static double calculateLineTotal(double urun, double adet) {
        return urun * adet;
    }
    // METOT 2: Sepetteki 3 urunun ara toplamini hesaplar
    public static double calculateSubtotal(double urun1Toplam, double urun2Toplam, double urun3Toplam) {
        return urun1Toplam + urun2Toplam + urun3Toplam;
    }
    // METOT 3: Indirim tutarini hesaplar
    public static double calculateDiscountAmount(double araToplam, double indirimKuponuYuzdesi) {
        return araToplam * (indirimKuponuYuzdesi / 100);
    }
    // METOT 4: Indirimli fiyati hesaplar (araToplam - indirimTutari)
    public static double applyDiscount(double araToplam, double indirimTutari) {
        return araToplam - indirimTutari;
    }
    // METOT 5: KDV tutarini hesaplar (indirimliTutar * kdv)
    public static double calculateVAT(double indirimliToplam, double kdv) {
        return indirimliToplam * kdv;
    }
    // METOT 6: Genel toplami hesaplar (indirimliTutar + kdvTutari + kargo)
    public static double calculateGrandTotal(double indirimliToplam, double kdvTutari, double kargo) {
        return indirimliToplam + kdvTutari + kargo;
    }

}
