import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SporKursu {
    private String isim;
    private String cinsiyet;
    private double kilo;
    private double boy;

    public SporKursu(String isim, String cinsiyet, double kilo, double boy) {
        this.isim = isim;
        this.cinsiyet = cinsiyet;
        this.kilo = kilo;
        this.boy = boy;
    }

    public String getIsim() {
        return isim;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public double getKilo() {
        return kilo;
    }

    public double getBoy() {
        return boy;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen öğrenci sayısını giriniz: ");
        int ogrenciSayisi = input.nextInt();

        List<SporKursu> ogrenciListesi = new ArrayList<>();

        for (int i = 1; i <= ogrenciSayisi; i++) {
            System.out.println("Öğrenci " + i + " bilgilerini giriniz:");

            System.out.print("İsim: ");
            String isim = input.next();

            System.out.print("Cinsiyet (E/K): ");
            String cinsiyet = input.next();

            System.out.print("Kilo (kg): ");
            double kilo = input.nextDouble();

            System.out.print("Boy (m): ");
            double boy = input.nextDouble();

            SporKursu ogrenci = new SporKursu(isim, cinsiyet, kilo, boy);
            ogrenciListesi.add(ogrenci);

            System.out.println();
        }

        for (SporKursu ogrenci : ogrenciListesi) {

            if (ogrenci.getCinsiyet().equalsIgnoreCase("E")) {
                if (ogrenci.getBoy() >= 1.60 && ogrenci.getKilo() >= 70 && ogrenci.getKilo() <= 90) {
                    System.out.println(ogrenci.getIsim() + " spor kursuna kabul edildi.");
                } else {
                    System.out.println(ogrenci.getIsim() + " spor kursuna kabul edilmedi.");
                }

            } else if (ogrenci.getCinsiyet().equalsIgnoreCase("K")) {
                if (ogrenci.getBoy() >= 1.50 && ogrenci.getKilo() >= 50 && ogrenci.getKilo() <= 70) {
                    System.out.println(ogrenci.getIsim() + " spor kursuna kabul edildi.");
                } else {
                    System.out.println(ogrenci.getIsim() + " spor kursuna kabul edilmedi.");
                }
            } else {
                System.out.println("Geçersiz giriş. Lütfen 'E' veya 'K' giriniz.");
            }


        }





    }
}
