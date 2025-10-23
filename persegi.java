
package Pertemuan4;

public class persegi extends Bangundatar {
    float sisi;
    
    public persegi(float sisi){
        this.sisi = sisi;
    }
    
    @Override
    public float luas(){
        return sisi *  sisi;   
    }
    
    @Override
    public float keliling(){
        return 4 * sisi;
    }
    
    public void persegi(){
        System.out.println("======Objek persegi berhasil di buat============");
    }
   
}
