
package Pertemuan4;

public class Persegipanjang extends Bangundatar{
    float panjang;
    float lebar;
    
    public Persegipanjang(float panjang,float lebar){
        this.lebar = lebar;
        this.panjang = panjang;
    }
    
    @Override
    public float luas(){
        return panjang * lebar;
    }
    
    @Override
    public float keliling(){
        return 2 * (panjang + lebar);
    }
}
