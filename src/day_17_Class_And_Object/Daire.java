package day_17_Class_And_Object;

public class Daire {
    final double PI=3.14;
    int yariCap;

    public double alanHesapla() {
        double sonuc=PI*yariCap*yariCap;
        return sonuc;
    }
    public double cevreHesapla() {
        double sonuc=2*PI*yariCap;
        return sonuc;
    }

}
