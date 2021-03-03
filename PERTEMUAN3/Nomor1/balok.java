package PERTEMUAN3.Nomor1;

public class balok {
    int panjang, tinggi, lebar;
   
    public balok (int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    int hitungLuas(){
        int luas = 2 * (panjang*lebar + panjang*tinggi + tinggi*lebar);
        return luas;
    }
    int hitungVolume(){
        int volume = panjang *lebar * tinggi;
        return volume;
    }
}
