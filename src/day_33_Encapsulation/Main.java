package day_33_Encapsulation;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person("Harun");
//        System.out.println(person.id);
//
//        Person enes=personCreate("enes yilmaz",1211);
//
//        Person mehmet=personCreate("mehmet can", 1212);
//        System.out.println(enes.name);
//        System.out.println(mehmet.name);
//
//        System.out.println(personChange(enes, "mehmet can", 1213));
        Dog dog= new Dog("karabaş");
//        karabas.setName("Karabaş");
//        System.out.println(karabas.getName());
//        karabas.setName("boncuk");
//        System.out.println(karabas.getName().substring(0, 3).toUpperCase());

//        dog.setSpeed(100);
//        System.out.println(dog.getSpeed());

        Circle circle=new Circle(5);
        Circle circle1= new Circle(8);

        System.out.println(circle.getRadius());
        System.out.println();


    }

    public static Person personCreate(String name, int id) {
        Person person = new Person(name, id);
        return person;
    }
    public static Person personChange(Person person,String name, int id) {
        person.name=name;
        person.id=id;
        return person;
    }





}

