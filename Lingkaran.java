
package Pertemuan4;

public class Lingkaran extends Bangundatar{
    float r;
    
    public Lingkaran(float r){
        this.r = r;
    }
    
    @Override
    public float luas(){
        return (float) (3.14 * r * r);
    }
    
    @Override
    public float keliling(){
        return (float) (2 * 3.14 * r);
    }
    
    public void lingkaran(){
        System.out.println("Objek lingakarn berhasil di buat");
    }
}
