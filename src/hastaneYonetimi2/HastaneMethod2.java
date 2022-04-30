package hastaneYonetimi2;

import hastaneYonetimi.*;

import java.util.Scanner;

public class HastaneMethod2 implements HastaneMethodInter2 {


    static Scanner scan = new Scanner(System.in);

    static Hastane hastane =new Hastane();
    public static int hastaID=106;

    public static void giris (){

        System.out.println("******YILDIZ HASTANESİ ********\n******HOSGELDİNİZ********");
        System.out.println("Kayitli hasta=> 1\nYeni kayit=>2");
        int kytSecim=scan.nextInt();
        scan.nextLine();

        // System.out.println(VeriBankasi.hastaListesiMap);
        //System.out.println(VeriBankasi.doktorListesiMap);

        if (kytSecim==1){
            System.out.println("ID numaranizi giriniz :");
            hastaID= scan.nextInt();


            if (VeriBankasi2.hastaListesiMap.containsKey(hastaID)){

                System.out.println(VeriBankasi2.hastaListesiMap.get(hastaID));

            }




            //girilen id ile bizde olan id karsilastirilacak
            //daha sonra ana memuye gonderilecek(ana menu olustur)

        }else if(kytSecim==2){

            yeniHastaEkle();

        }

    }
    public static void anaMenu(){
        System.out.println("Asagidaki sikayetlerden size uygun olani seciniz ");
        System.out.println("bas agris : 1 \nalerji:2\n migren : 3\n soguk alginligi : 4 \ndiyabet : 5 \nkalp hastaliklari: 6 ");
        int scm=scan.nextInt();
        Durum aksiyonobj =new Durum();
        Hasta hastaobj =new Hasta();
        VeriBankasi hastalisteobj =new VeriBankasi();
        //hastaListesiMap.put(hastalisteobj.hastaIdleri,hastalisteobj.hastaIsimleri,hastalisteobj.hastaSoyisimleri);
        //getter setter- mapler kontrol edilecek




        switch (scm){
            case 1:
                aksiyonobj.getAktuelDurum();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;

        }





    }

    private static void yeniHastaEkle() {

        System.out.println("Isim giriniz");
        String isim= scan.nextLine();

        System.out.println("soyIsim giriniz");
        String soyIsim= scan.nextLine();

        Hasta yeniKayitobj=new Hasta(isim,soyIsim);
        Hasta yeniIdobj=new Hasta(hastaID);

        VeriBankasi2.hastaListesiMap.put(yeniIdobj,yeniKayitobj);
        hastaID++;

        System.out.println(VeriBankasi2.hastaListesiMap);

    }


    @Override
    public void doktorUnvani() {

    }

    @Override
    public void doktorBul() {

    }

    @Override
    public void hastaBul() {

    }
}