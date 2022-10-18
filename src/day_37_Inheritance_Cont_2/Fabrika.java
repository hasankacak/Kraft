package day_37_Inheritance_Cont_2;

public class Fabrika {
    String personelAdi;   //  başında public yada private yazmadığı için default


    String defaultMetot(){  //  başında public yada private yazmadığı için default
        // aynı pacgage içerisinde çağtılabilir, başka pacgage lerden çağrılamaz.
        return personelAdi;
    }
}

