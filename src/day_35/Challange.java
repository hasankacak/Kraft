package day_35;

public class Challange extends GameActivity {

    private int shootOption;
    private int pointOfShoot;
    private int shootSucces;

    public Challange(int shootOption, int shootSucces) {
        int point;
        this.shootOption = shootOption;
        this.shootSucces = shootSucces;

        pointOfShoot=1000/shootOption;

        point=pointOfShoot*shootSucces;
        // score=point; // score değişkeni parent class da private
        // olarak tnımlandığı için doğrudan erişilemez
        setScore(point); // setter methodu o yüzden kullanıldı
    }
}

