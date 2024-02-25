package aracSigortaApp;

import java.util.Scanner;

public class AracSigortaAplication {
    /*Proje
    Araç Sigorta Pirim Hesaplama
    * Araç Tipleri: Otomobil,Kamyon,Otobüs, Motosiklet
    -Otobüs: 18-30 koltuk yada 31 ve üzeri koltuk

    Tarife Dönemi

    Aralık      2023 Dönemi                   Haziran 2023 Dönemi

    Otomobil    2000                           Otomobil 2500
    Kamyon      3000                           Kamyon   3500
    Otobüs      tip1 4000  tip2 5000           Otobüs   tip1 4500  tip2 5500
    Motosiklet  1500                           Motosiklet 1750

1- Tekrar tekrar kullanılan bir seçim menüsü gösterelim
2- Tarife dönemi bilgisi ve araç tipi bilgilerini kullanıcıdan alalım
3- Hatali girişte hesaplama başarısız uyarısı verip formu yeniden gösterilsin
4- Tarife dönemi ve araç tipina göre sigorta hesaplansın.

    */

    public static void main(String[] args) {

        //1- Uygulamayı başlatan bir method

        start();

    }

    public static void start() {
        //2- Kullanıcıdan bilgi alacağız
        Scanner input=new Scanner(System.in);

        //3- Tekrar tekrar menü gösterilsin
        boolean isAgein;
        do {
            System.out.println("----Zorunlu Araç Sigorta Pirimi Hesaplama----");
            System.out.println("Tarife Dönemi Seçiniz");
            System.out.println("1.Haziran 2024");
            System.out.println("2.Aralık 2024 ");
            int donem=input.nextInt();
            String donemBilgi=donem==1?"Haziran 2024":"Aralık 2024";

            //Tarife dönemi doğru girilirse işleme devam et, hatalı ise uyarı mesajı verip forma gönder
            if (donem==1||donem==2){

                //4- Bir araç objesi oluşturalım
                Arac arac=new Arac();//default.
                System.out.println("Araç tipini seçiniz");
                System.out.println("otomobil  -- kamyon -- motosiklet -- otobüs");
                arac.type=input.next().toLowerCase();
                arac.primHesapla(donem);
                //prim=0 ise hatalı giriş yapmış demektir.yeni işlem yapsın
                //prim>0 ise hesaplama işlemi başarılı
                if (arac.prim>0){
                    System.out.println("****RESMİ BELGEDİR. SAKLAYINIZ..!****");
                    System.out.println("*".repeat(55));
                    System.out.println("Araç tipi : "+arac.type);
                    System.out.println("Tarife dönemi : "+donemBilgi);
                    System.out.println("Aracınızın ilgili dönem sigorta primi : "+arac.prim);
                    System.out.println("*".repeat(55));
                    System.out.println("Yeni işlem için 1, çıkış için 0 girin");
                    int select=input.nextInt();
                    isAgein=select==1?true:false;

                }else {//Hatalı Giriş
                    System.out.println("Hatalı Giriş");
                    System.out.println("Yeni işlem için 1, çıkış için 0");
                    int select = input.nextInt();
                    isAgein = select == 1 ? true : false;
                }
            }else {
                System.out.println("Hatalı Giriş");
                isAgein=true;
            }
        }while (isAgein);

    }


}
