/*
 * Ad Soyad: [NİSANUR ELTEKİN]
 * Ogrenci No: [250541100]
 * Tarih: [12.11.2025]
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

package V1;

import java.util.Scanner;

public class FizikFormul {
    final static double GRAVITY = 9.8;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n === FİZİK FORMUL ASİSTANI === ");
        System.out.println("\nTEMEL ÖLÇÜMLER:");

        //Kullanıcıdan Alınacak Temel Ölçümler
        System.out.printf("Yol(x): ");
        double yol = sc.nextDouble();
        System.out.printf("Zaman(s): ");
        double zaman = sc.nextDouble();
        System.out.printf("Hız Değişimi(∆v) m/s: ");
        double hiz_degisimi = sc.nextDouble();
        System.out.printf("Kütle(m): ");
        double kutle = sc.nextDouble();
        System.out.printf("Mesafe(d): ");
        double mesafe = sc.nextDouble();
        System.out.printf("Yükseklik(h): ");
        double yukseklik = sc.nextDouble();

        //Hesaplamalar
        double hiz = calculateVelocity(yol, zaman);
        double ivme = calculateAcceleration(hiz_degisimi, zaman);
        double kuvvet = calculateForce(kutle, ivme);
        double is = calculateWork(kuvvet, mesafe);
        double guc = calculatePower(is, zaman);
        double kinetik_enerji = calculateKineticEnergy(kutle , hiz);
        double potansiyel_enerji = calculatePotentialEnergy(kutle, GRAVITY, yukseklik);
        double momentum = calculateMomentum(kutle, hiz);
        double toplam_enerji = kinetik_enerji +  potansiyel_enerji;


        // Sonuçlar ekrana bastırılıyor
        System.out.println("\n=========================");
        System.out.println("   HESAPLAMA SONUCLARI     ");
        System.out.println("=========================");
        System.out.println("\nHIZ ve HAREKET:");
        System.out.printf("Hız (v = x/t)            : %.2f\n" ,hiz);
        System.out.printf("İvme (a = Δv/t)          : %.2f\n" ,ivme);
        System.out.println("\nKUVVET ve İŞ:");
        System.out.printf("Kuvvet (F = m*a)         : %.2f\n" ,kuvvet);
        System.out.printf("İş (W = F*d)             : %.2f\n" ,is);
        System.out.printf("Güç (P = W/t)            : %.2f\n" ,guc);
        System.out.println("\nENERJİ:");
        System.out.printf("Kinetik Enerji (KE)      : %.2f\n" ,kinetik_enerji);
        System.out.printf("Potansiyel Enerji (PE)   : %.2f\n" ,potansiyel_enerji);
        System.out.printf("Toplam Enerji            : %.2f\n" ,toplam_enerji);
        System.out.println("\nMOMENTUM:");
        System.out.printf("Momentum (p = m*v)       : %.2f\n" ,momentum);

        sc.close();
    }
    // 1. Hız (v = x / t)
    public static double calculateVelocity(double yol, double zaman){
        return yol / zaman;
    }
    // 2. İvme (a = Δv / t)
    public static double calculateAcceleration(double hiz_degisimi, double zaman){
        return hiz_degisimi / zaman;
    }
    // 3. Kuvvet (F = m * a)
    public static double calculateForce(double kutle, double ivme){
        return kutle * ivme;
    }
    // 4. İş (W = F * d)
    public static double calculateWork(double kuvvet, double mesafe){
        return kuvvet * mesafe;
    }
    // 5. Güç (P = W / t)
    public static double calculatePower(double is, double zaman){
        return is / zaman;
    }
    // 6. Kinetik enerji (KE = 0.5 * m * v²)
    public static double calculateKineticEnergy(double kutle, double hiz){
        return 0.5 * kutle * Math.pow(hiz, 2);
    }
    // 7. Potansiyel enerji (PE = m * h * g)
    public static double calculatePotentialEnergy(double kutle, double GRAVITY, double yukseklik){
        return kutle * yukseklik * GRAVITY;
    }
    // 8. Momentum (p = m * v)
    public static double calculateMomentum(double kutle, double hiz){
        return kutle * hiz;
    }
}
