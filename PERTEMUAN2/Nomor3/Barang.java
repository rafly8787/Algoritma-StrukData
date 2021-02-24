package PERTEMUAN2.Nomor3;
public class Barang {
    String nama;
    int hargaSatuan, jumlah, diskon;
    int hitungHargaTotal(){
        int total = hargaSatuan * jumlah;
        return total;
    }
    int diskon(){
        if (hitungHargaTotal() >10000){
            diskon = hitungHargaTotal() * 10/100;
        }else{
            diskon= 0;
        }
        return diskon;
    }
    int hitungHargaBayar(){
        return hitungHargaTotal()-diskon();
    }
    public static void main(String[] args){
        Barang y1= new Barang();
        y1.nama = "baju";
        y1.hargaSatuan = 85000;
        y1.jumlah = 15;
        int totalsemua = y1.hitungHargaTotal();
        int diskon1 = y1.diskon();
        int bayar1 = y1.hitungHargaBayar();

        System.out.println("nama barang : " + y1.nama);
        System.out.println("total : " + totalsemua);
        System.out.println("Diskon : " + diskon1);
        System.out.println("bayar : " + bayar1);
    }
}
