package PERTEMUAN3.Nomor4;

public class mahasiswa {
    public String nama, nim, jenisKelamin;
    public double ipk;
    public double tampil(){
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("IPK : " + ipk);
        
        return ipk;
    }
}
