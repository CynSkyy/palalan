
package Pertemuan4;

public class Main {
    public static void main(String[] args) {
        persegi p = new persegi(4);
        persegi p2 = new persegi(2);
        Lingkaran L = new Lingkaran(4);
        Lingkaran L2 = new Lingkaran(2);
        p.persegi();
        System.out.println("masukan sisi persegi : " + p.sisi);
        System.out.println("hasil luas persegi : " + p.luas());
        L2.lingkaran();
        System.out.println("Masukan sisi : " + L2.r);
        System.out.println("keliling lingkaran : " + L2.keliling());
        
    }
}
