package PERTEMUAN2.Nomor2;
import java.util.Scanner;
public class VideoGame {
      int id, lama_sewa;
    double harga_sewa;
    String nama_member, nama_game;
     
    void listGame(){
        System.out.println(id + "  " + nama_game + "   " + harga_sewa + "/hari");
    }

    VideoGame(int no, double harga, String nama){
        id = no;
        harga_sewa = harga;
        nama_game = nama;
    }

    double bayarSewa(){
        double total = lama_sewa * harga_sewa;
        return total;
    }

    void strukSewa(){
        System.out.println("Nama Penyewa    : " + nama_member);
        System.out.println("ID Game         : " + id);
        System.out.println("Nama Game       : " + nama_game);
        System.out.println("Lama Sewa       : " + lama_sewa + "hari");
        System.out.println("Harga Sewa      : " + harga_sewa + "/hari");
        System.out.println("Total Bayar     : " + bayarSewa());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoGame a1 = new VideoGame(1, 30000, "Dinner Dash");
        VideoGame a2 = new VideoGame(2, 15000, "Subway Surf");      
        a1.listGame();
        a2.listGame();
        System.out.print("Pilih ID Game: ");
        int opsi = sc.nextInt();
        switch(opsi){
            case 1:
                System.out.print("Masukkan Lama Sewa    : ");
                a1.lama_sewa = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan Nama Member  : ");
                a1.nama_member = sc.nextLine();
                a1.strukSewa();
                break;
            case 2:
                System.out.print("Masukkan Lama Sewa    : ");
                a2.lama_sewa = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan Nama Member  : ");
                a2.nama_member = sc.nextLine();
                a2.strukSewa();
                break;
        }
    }
}
