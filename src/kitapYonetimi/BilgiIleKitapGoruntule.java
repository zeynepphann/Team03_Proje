package kitapYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BilgiIleKitapGoruntule {

    public static void bilgiIleKitapGoruntule() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen Kitap adi ile arama yapmak icin 1" +
                "\nYazar adi ile arama yapmak icin 2" +
                "\nKitap fiyati ile arama yapmak icin 3 e tiklayin");

        int secim = scan.nextInt();
        switch (secim) {
            case 1:

                System.out.println("Kitap adini giriniz");
                String secilenKitap = scan.nextLine();
                for (int i = 0; i < KitapEkle.kitaplar.size(); i++) {
                    if (KitapEkle.kitaplar.get(i).kitapAdi.equalsIgnoreCase(secilenKitap)) {
                        System.out.println("Kitap numarasi: " + KitapEkle.kitaplar.get(i).kitapNo + "\nYazar adi: " + KitapEkle.kitaplar.get(i).yazarAdi +
                                "Kitap fiyati: " + KitapEkle.kitaplar.get(i).kitapFiyati);

                    }
                }
                boolean flag = true;

                do {
                    boolean adiVarMi = false;
                    System.out.println("Kitap adini giriniz");
                    scan.nextLine();
                    String secilenKitap1 = scan.nextLine();


                    for (EklenenKitaplar ktpAdi : KitapEkle.kitaplar) {
                        if (ktpAdi.kitapAdi.equalsIgnoreCase(secilenKitap1)) {
                            System.out.println("Kitap numarasi: " + ktpAdi.kitapNo + " \nYazar adi: " + ktpAdi.yazarAdi +
                                    " \nKitap fiyati: " + ktpAdi.kitapFiyati);
                            adiVarMi = true;

                            break;

                        } else adiVarMi = false;

                    }
                    if (adiVarMi == false) {
                        System.out.println("Girdiginiz kitap adi mevcut degil");


                    }
                    Kitapci_Main.Menu();
                } while (flag == true);

                break;


            case 2:
                boolean flag1 = true;
                do {
                    boolean yazarVarMi = false;
                    System.out.println("Yazar adini giriniz : ");
                    scan.nextLine();
                    String secilenYazar = scan.nextLine();
                    for (EklenenKitaplar yzrAdi : KitapEkle.kitaplar) {
                        if (yzrAdi.kitapAdi.equalsIgnoreCase(secilenYazar)) {
                            System.out.println("Kitap numarasi: " + yzrAdi.kitapNo + " \nkitap adi: " + yzrAdi.kitapAdi +
                                    " \nKitap fiyati: " + yzrAdi.kitapFiyati);
                            yazarVarMi = true;
                            break;
                        } else yazarVarMi = false;

                    }

                    for (int i = 0; i < KitapEkle.kitaplar.size(); i++) {
                        if (KitapEkle.kitaplar.get(i).yazarAdi.equalsIgnoreCase(secilenYazar)) {
                            System.out.println("Kitap numarasi: " + KitapEkle.kitaplar.get(i).kitapNo + "\nKitap adi: " + KitapEkle.kitaplar.get(i).kitapAdi +
                                    "Kitap fiyati: " + KitapEkle.kitaplar.get(i).kitapFiyati);

                        } else {

                        }
                    }
                    if (yazarVarMi == false) {

                        System.out.println("Girdiginiz yazarin kitabi mevcut degil");
                    }
                    Kitapci_Main.Menu();

                }while (flag1 == true) ;

                break;

            case 3:
                boolean flag2 = true;
                do {
                    boolean fiyarVarMi = false;
                    System.out.println("Kitap fiyatini giriniz");
                    int secilenFiyat = scan.nextInt();
                    for (int i = 0; i < KitapEkle.kitaplar.size(); i++) {
                        if (KitapEkle.kitaplar.get(i).kitapFiyati == secilenFiyat) {
                            System.out.println("Kitap numarasi: " + KitapEkle.kitaplar.get(i).kitapNo + "\nKitap adi: " + KitapEkle.kitaplar.get(i).kitapAdi +
                                    "Yazar adi: " + KitapEkle.kitaplar.get(i).yazarAdi);

                        } else {
                            System.out.println("Girdiginiz fiyatta kitabi mevcut degil");
                        }
                    }

                    for (int i = 0; i < KitapEkle.kitaplar.size(); i++) {
                        if (KitapEkle.kitaplar.get(i).kitapFiyati == secilenFiyat) {
                            System.out.println("Kitap numarasi: " + KitapEkle.kitaplar.get(i).kitapNo + "\nKitap adi: " + KitapEkle.kitaplar.get(i).kitapAdi +
                                    " \nYazar adi: " + KitapEkle.kitaplar.get(i).yazarAdi);
                            fiyarVarMi = true;
                            break;
                        } else fiyarVarMi = false;

                    }
                    if (fiyarVarMi == false) {
                        System.out.println("Girdiginiz fiyatta kitabi mevcut degil");
                    }
                    Kitapci_Main.Menu();
                } while (flag2 == true);
                break;
        }
    }
}