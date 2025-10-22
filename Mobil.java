
package Pertemuan3;

public class Mobil {
    String model;
    String merek;
    int tahun;
    Mobil() {
        
    }
    
    public Mobil(String merek,String model){
        this.merek = merek;
        this.model = model;
    }
    public Mobil(String merek,String model,int tahun){
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
    }
    void tampilmobil1(){
        System.out.println("Mobil 1 : " + merek + model);
    }
    void tampilmobil2(){
        System.out.println("mobil 2 : " + merek + model + tahun);
    }

}

 