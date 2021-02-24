package PERTEMUAN2.Nomor1;

public class Lingkaran {
    double phi, r;

    double hitungLuas(){
        double luas = phi * r * r;
        return luas;
    }
    double hitungKeliling(){
        double keliling = 2 * phi * r;
        return keliling;
    }
    public static void main(String[] args){
        Lingkaran a1 = new Lingkaran ();
        a1.phi = 3.14;
        a1.r = 7;
        a1.hitungKeliling();
        a1.hitungLuas();
        System.out.println("Luas Lingkaran = " + a1.hitungLuas());
        System.out.println("Keliling Lingkaran = " + a1.hitungKeliling());
    }
}
