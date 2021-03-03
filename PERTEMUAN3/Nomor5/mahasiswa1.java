package PERTEMUAN3.Nomor5;

public class mahasiswa1 {
    public String nama, nim, jenisKelamin;
    public double ipk;
    public mahasiswa1(String nm, String ni, String jk, double ip){
    nama = nm;
    nim = ni;
    jenisKelamin = jk;
    ipk = ip;
}
    public double tampil(){
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("IPK : " + ipk);
        return ipk;
    }
}
