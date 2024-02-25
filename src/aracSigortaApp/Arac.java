package aracSigortaApp;

import java.util.Scanner;

public class Arac {

   /* Aralık      2023 Dönemi                   Haziran 2023 Dönemi

    Otomobil    2000                           Otomobil 2500
    Kamyon      3000                           Kamyon   3500
    Otobüs      tip1 4000  tip2 5000           Otobüs   tip1 4500  tip2 5500
    Motosiklet  1500                           Motosiklet 1750
    */

    public String type;//otobüs otomobil...
    public int prim;//Tarife Dönemine göre prim
    //5- prim hesaplama
    public void primHesapla(int donem){
        //type ne göre hesaplama
        switch (this.type){
            case "otomobil":
                this.prim=donem==1?2000:2500;
                break;
            case "kamyon":
                this.prim=donem==1?3000:3500;
                break;
            case "otobüs":
               primHesaplaOtobus(donem);
                break;
            case "motosiklet":
                this.prim=donem==1?1500:1750;
                break;
            default:
                System.out.println("Hatalı Giriş");
                this.prim=0;
                break;
                }
        }

    public void primHesaplaOtobus(int donem) {
        Scanner input=new Scanner(System.in);
        System.out.println("Otobüs tipini giriniz");
        System.out.println("1 - 18-30 arası koltuk sayısı");
        System.out.println("2 - 31 ve üzeri  koltuk sayısı");
        int otobusTipi=input.nextInt();
        switch (otobusTipi){
            case 1:
                this.prim=donem==1?4000:4500;
                break;
            case 2:
                this.prim=donem==1?5000:5500;
                break;
            default:
                System.out.println("Hatali Giriş");
                this.prim=0;
                break;
        }
    }

}




