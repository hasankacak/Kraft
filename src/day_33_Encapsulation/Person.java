package day_33_Encapsulation;

public class Person {

    public String name;
    public int id;

    // ismi sınıf ismi ile aynı
    // return type yok
    // oluşturulmaz ise boş olarak atama yapıyor
    // sınıfın özel bir metodu
    // ilk oluşturma esnasında constructor çağrılır

    public Person(String name) {
        this.name= name;
    }

    public Person(String name, int id) {
        this.name = name;
        this.id=id;

    }
}


