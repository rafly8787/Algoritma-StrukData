
package PERTEMUAN3.Nomor1;

import java.util.Scanner;
public class bangunRuangMain {
    public static void main(String[] args){
    Scanner cin = new Scanner(System.in);
    System.out.print("Berapa kali perulangan : " );
    int ulang = cin.nextInt();

    for(int i = 0;i<ulang; i++);
    System.out.println();
    System.out.println("----Bola----");
    System.out.println();
    System.out.print("Masukkan jari-jari : ");
    double r = cin.nextDouble();
    System.out.print("Masukkan phi : ");
    double ph = cin.nextDouble();

    bola b1 = new bola(r, ph); 
    System.out.println("Luas Bola adalah "+ b1.hitungLuas());
    System.out.println("Volume Bola adalah " + b1.hitungVolume());

    System.out.println("==================================================");
    System.out.println();
    System.out.println("----Kubus----");
    System.out.println();
    System.out.print("Masukkan sisi : ");
    int s = cin.nextInt();

    kubus k1 = new kubus(s);
    System.out.println("Luas Kubus adalah " + k1.hitungLuas());
    System.out.println("Volume Kubus adalah " + k1.hitungVolume());

    System.out.println("==================================================");
    System.out.println();
    System.out.println("----Balok----");
    System.out.println();
    System.out.print("Masukkan Panjang : ");
    int p = cin.nextInt();
    System.out.print("Masukkan Tinggi : ");
    int t = cin.nextInt();
    System.out.print("Masukkan Lebar : ");
    int l = cin.nextInt();

    balok z1 = new balok(p, l, t);
    System.out.println("Luas Balok adalah " + z1.hitungLuas());
    System.out.println("Volume Balok adalah " + z1.hitungVolume());
    
    }   
    
}
