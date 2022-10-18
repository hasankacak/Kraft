package day_33_Encapsulation;

public class Dog {
    private String name;
    private String breed;
    private boolean isBlack=true;
    private int age=10;
    private int speed;

    public static int foot=4;

    public Dog(){}
    public Dog (String name){
        this.name=name;
    }

    public double getSpeed(){
        return this.speed*1.6;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public String getBreed(){
        return this.breed;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }


}
