package PERTEMUAN3.Nomor1;

public class kubus {
    public int sisi;
    
    public kubus(int s){
        sisi = s;
        
    }
    int hitungLuas(){
       int luas = 6 * sisi *sisi;
       return luas;
}
   int hitungVolume(){
    int volume = sisi * sisi * sisi;
    return volume;
}  
}
