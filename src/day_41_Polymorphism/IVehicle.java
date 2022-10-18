package day_41_Polymorphism;

public interface IVehicle {
    int tekerSayisi=4;
    public abstract void start();
    public abstract void stop();
    public abstract int durmaMesafesi();
    default int tekerSayisi(){
        return tekerSayisi;
    }

}
