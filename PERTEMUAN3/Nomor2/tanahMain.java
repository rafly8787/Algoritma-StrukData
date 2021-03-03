package PERTEMUAN3.Nomor2;
import java.util.Scanner;
public class tanahMain {
    public static void main(String[] args){
        Scanner y = new Scanner(System.in);
        int a;
        System.out.print("Banyaknya tanah : ");
        a = y.nextInt();
        System.out.println();
        tanah[] t1 = new tanah[a];
        for(int i = 0; i<t1.length; i++){
            System.out.println("Tanah "  + (i+1) );
            System.out.print("Panjang : ");
            int p = y.nextInt();
            System.out.print("Lebar : ");
            int l= y.nextInt();
            System.out.println();

            t1[i] = new tanah(p, l);
        }
        for (int i = 0; i<t1.length; i++){
            System.out.println("Tanah " + (i+1) + " : " + t1[i].hitungLuasTanah());
        }
    }   
}
