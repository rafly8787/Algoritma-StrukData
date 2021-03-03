package PERTEMUAN3.Nomor1;

public class bola {
double jari;
double phi;
   
   public bola (double r, double ph){
       jari = r;
       phi = ph;
   }
   double hitungLuas(){
       double luas = 4 * phi * jari * jari;
       return luas;
   }
   double hitungVolume(){
       double volume = 4/3 * phi * jari * jari * jari;
       return volume;
   }
}
