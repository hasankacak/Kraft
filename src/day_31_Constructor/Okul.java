package day_31_Constructor;

public class Okul {

    public String renk;
    public int kapasite;
    public int sinifAdedi;

    public Okul() {
    }
    public Okul(String renk, int kapasite) {
        this.renk = renk;
        this.kapasite=kapasite;
    }
    public Okul(String renk, int kapasite,int sinifAdedi) {
        this.renk = renk;
        this.kapasite = kapasite;
        this.sinifAdedi=sinifAdedi;
    }
    public Okul(int sinifAdedi){
        this.sinifAdedi=sinifAdedi;
    }

    public void kontrolKapasite(){
        if(this.kapasite>500){
            System.out.println("Kapasite aşılmıştır.");
        }else{
            System.out.println("Kapasite aşılmasına "+ (500-this.kapasite)+ " kişilik kota kalmıştır");
        }
    }
}
