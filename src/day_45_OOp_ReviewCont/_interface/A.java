package day_45_OOp_ReviewCont._interface;

public interface A {

    // int i;  // instance variable olmaz
    public static final int i=10; // interface lerde variable public static final olarak atanır

                        int j =20;

    public abstract void M1();

    default void M2(){} //java 8
    static void M3(){} //java 9

    private void M4(){} //java 9
}
