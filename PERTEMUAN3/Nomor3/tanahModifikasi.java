package PERTEMUAN3.Nomor3;
import java.util.Scanner;
public class tanahModifikasi {
    public static void main(String[] args){
        Scanner y = new Scanner(System.in);
        int a, index = 0;
        double b =0;
        System.out.print("Banyaknya tanah : ");
        a = y.nextInt();
        System.out.println();
        tanah1[] t1 = new tanah1[a];
        for(int i = 0; i<t1.length; i++){
            System.out.println("Tanah "  + (i+1) );
            System.out.print("Panjang : ");
            int p = y.nextInt();

            System.out.print("Lebar : ");
            int l= y.nextInt();
            System.out.println();

            t1[i] = new tanah1(p, l);
        }
        for (int i = 0; i<t1.length; i++){
            System.out.println("Tanah " + (i+1) + " : " + t1[i].hitungLuas() + " m ");
            if (b < t1[i].hitungLuas()){
                b = t1[i].hitungLuas();
                index = i;
            }
        }
        System.out.println();
        System.out.println("Tanah terluas adalah tanah ke- " + (index + 1));
    }   
}
