package PERTEMUAN3.Nomor2;

public class tanah {
    int panjang, lebar;

    public tanah(int p, int l){
        panjang = p;
        lebar = l;
    }

    int hitungLuasTanah(){
        int luas = panjang * lebar;
        return luas;
    }
}
