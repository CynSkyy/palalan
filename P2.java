
package Pertemuan2;

public class P2 {
    String judul;
    int tahun;
    String pengarang;
    
    public P2(){
        
    }
    public P2(String judul){
        this.judul = judul;
    }
    public P2(int tahun){
        this.tahun = tahun;
    }
    public P2(String pengarang,int tahun){
        this.tahun = tahun;
        this.pengarang = pengarang;
    }
    public P2(String judul,String pengarang,int tahun){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahun = tahun;
    }
    void tampilbuku(){
        System.out.println("judul buku : " + judul);
        System.out.println("nama pengarang : " +pengarang);
        System.out.println("tahun terbit : " +tahun);
    }
    
    
    
    
}

