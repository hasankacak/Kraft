package day_29;

public class WrapperClass {

    public static void main(String[] args) {

        Byte B=new Byte((byte)127);
        Byte B2=new Byte("127");

        System.out.println("B = "+ B);
        System.out.println("B2 = "+ B2);

        Short S= new Short((short)1000);
        Short S2= new Short("1000");

        Integer I= new Integer(10000);
        Integer I2= new Integer("10000");

        Long L= new Long(1000000);
        Long L2= new Long("1000000");

        Float F= new Float(1.2);
        Float F2= new Float("1.2");

        Double D= new Double(3.14);
        Double D2= new Double("3.14");

        Character C= new Character('a');

        //Autoboxing and Unboxing

        int i=10;
        Integer x=i; //autoboxed

        Integer x1=new Integer(5);
        int i1=x1;  //unboxed

        Double db= new Double(10.0);
        double dbl=db; //unboxed

        double dbl1=new Double(3.14); //unboxed

        //valuOf

        Integer integer= Integer.valueOf("10");
        System.out.println("integer = "+ integer);
        Integer integer1=Integer.valueOf(10);
        System.out.println(integer+integer1);

        Boolean Bl= Boolean.valueOf("true");
        Boolean Bl1= Boolean.valueOf(true);

        //pars

        int y= Integer.parseInt("100");
        System.out.println("y= "+ y);
        int y1= Integer.parseInt("-100");
        System.out.println("y1= "+ y1);
        int y2= Integer.parseInt("+100");
        System.out.println("y2= "+ y2);

        Double dble=Double.parseDouble("100");
        System.out.println("dble= "+ dble);
        Boolean bl=Boolean.parseBoolean("true");
        System.out.println("bl= "+ bl);

    }

}

