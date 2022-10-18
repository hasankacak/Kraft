package day_48_Exception_Example;

public class Throws_Example {
    public static void main(String[] args) throws KraftException {
        throw new KraftException("Exception atıldı");
//        a_metodu();

    }
    public static void a_metodu(){
        b_metodu();
    }
    public static void b_metodu() {
        try{
            c_metodu();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void c_metodu() throws InterruptedException {
        d_metodu();
    }
    public static void d_metodu() throws InterruptedException {

        Thread.sleep(3000);
    }
}
