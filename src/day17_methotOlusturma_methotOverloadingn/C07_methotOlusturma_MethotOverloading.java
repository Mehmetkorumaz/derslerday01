package day17_methotOlusturma_methotOverloadingn;

import java.util.Scanner;
import java.util.SortedMap;

public class C07_methotOlusturma_MethotOverloading {
    public static void main(String[] args) {
        //Soru 4 : Main method'da kullanicidan sifre isteyip,
        //          olusturacagimiz bir method'da asagidaki sartlari kontrol edin
        //          ve method'dan true veya false dondurun
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         tum sartlari saglanincaya kadar tekrar deger isteyin
        //         ve sartlar saglaninca , "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali

        boolean sonuc= false;
        while (sonuc==false){
            Scanner scanner=new Scanner(System.in);
            System.out.println("lutfen bir sifre giriniz");
            String sifre= scanner.nextLine();
            sonuc=sifreKontrolEt(sifre);


        }
        System.out.println("sifre basariyla kaydedildi");



    }
    public static boolean sifreKontrolEt(String sifre){

        int sayac =0; // sayaci hatalarda artiralim

        //- ilk harf kucuk harf olmali
        char ilkharf = sifre.charAt(0);
        if (!(ilkharf>='a' && ilkharf<='z')){
            System.out.println("ilkharf kucuk harf olmali");
            sayac++;
        }
        // - son karakter rakam olmali

        char sonKrakter= sifre.charAt(sifre.length()-1);
        if (!(sonKrakter>='0'  &&  sonKrakter<='9')){
            System.out.println("son krakter rakam olmali");
            sayac++;
        }
        // - sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            sayac++;
        }
        //- uzunlugu en az 10 karakter olmali

        if (sifre.length()<10){
            System.out.println("sifre 10 karakterden az olmamali");
            sayac++;
        }
        if (sayac==0){

            return true;
        }else {
            return false;
        }


    }
}
