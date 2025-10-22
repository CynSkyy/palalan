
package Pertemuan3;


public class LIngkaran {
    double jari;
   
    public LIngkaran(double jari){
        if(jari <= 0){
            System.out.println("nilai jari-jari tidak valid,nilai di ubah ke default");
            this.jari = 1.0;
        }else{
            this.jari = jari;
        }
       
    }
    
    double hitung(){
            double phi = 3.14;
            return phi * jari * jari;
            
        }
    
    void tampil(){
        System.out.println("jari-jari : " + jari);
        System.out.println("luas lingkaran : " + hitung());
    }
   
}
