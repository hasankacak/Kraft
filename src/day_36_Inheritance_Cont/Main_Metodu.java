package day_36_Inheritance_Cont;

public class Main_Metodu {
    public static void main(String[] args) {
        Class_B bObjesi=new Class_B(5,10);
        bObjesi.aMetodu();
        //  bObjesi.bMetodu(); // a ve b metodlarını çağırır c metodunu çağıramaz
        //  Class_C cObjesi=new Class_C();
        // cObjesi.aMetodu();
        //  cObjesi.cMetodu(); // a ve c metodlarını çağırır b metodunu çağıramaz
        // b ve c sınıfları a sınıfına extend dir

        //  Class_A aObjesi=new Class_A();
        // aObjesi.aMetodu(); // b ve c metodlarını çağıramaz
        // c sınıfı b sınıfına extend olursa ve b sınıfı a sınıfına extend olursa
        // c sınıfı a ve b sınıfını cağırır, b sınıfı a sınıfını çağırır, c sınıfını çağıramaz


    }
}

