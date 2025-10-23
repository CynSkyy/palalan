
package Pertemuan4;

public class Segitiga {
    float alas;
    float tinggi;
    float sisi;
    
    public Segitiga(float alas,float tinggi,float sisi){
        this.alas = alas;
        this.tinggi = tinggi;
        
    }
    
    public float luas(){
        return (float) (0.5 * alas * tinggi);
    }
    
    public float keliling(){
        return 3 * sisi;
    }
}
