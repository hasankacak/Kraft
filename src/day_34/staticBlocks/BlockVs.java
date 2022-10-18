package day_34.staticBlocks;

public class BlockVs {
    int i;

    public BlockVs(int i) {
        this.i = i;
        System.out.println("constructor çalıştı");
    }
    static {
        System.out.println("statik blok çalıştı ");
    }
    {
        System.out.println("intance block çalıştı");
    }

}

