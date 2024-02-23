package TicketReservation;

public class Ticket {
    //4-mesafe(KM), yolculuk tipi, koltuk no, fiyat
    private double distance;
    private int typeNo;//1-tek yön 2-çift yön
    private String seatNo;
    private Bus bus;//bu bilet hangi otobüse ait

    private double price;

    //paramli/paramsiz const

    public Ticket() {
    }

    public Ticket(double distance, int typeNo, String seatNo, Bus bus) {
        this.distance = distance;
        this.typeNo = typeNo;
        this.seatNo = seatNo;
        this.bus = bus;
    }

    //getter-setter


    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getTypeNo() {
        return typeNo;
    }

    public void setTypeNo(int typeNo) {
        this.typeNo = typeNo;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }


    //5-bilet fiyatını hesaplama ve set etme
    public void setPrice(int age){
       double total=0;
       int seat=Integer.valueOf(this.seatNo);

       switch (this.typeNo){
           case 1://tek yön
               if (seat%3==0){
                  total=this.distance*1.20;
               }else{
                   total=this.distance*1;
               }
               System.out.println("Toplam tutar: "+total);
               break;
           case 2://çift yön
               if (seat%3==0){
                   total=this.distance*2.40;
               }else{
                   total=this.distance*2;
               }
               System.out.println("Toplam tutar: "+total);
               total=total*0.8;
               System.out.println("Çift yön indirimli tutar: "+total);
               break;
       }

       if (age<12){
           total=total*0.5;
           System.out.println("12 yaş altı indirimli tutar: "+total);
       } else if (age>65) {
           total=total*0.7;
           System.out.println("65 yaş üstü indirimli tutar: "+total);
       }

       this.price=total;

    }
    //6-bilet dökümünü yazdırma
    public void printTicket(){
        //devamı gelecek...
    }

}
