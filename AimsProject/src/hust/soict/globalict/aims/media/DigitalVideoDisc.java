package AimsProject.src.hust.soict.globalict.aims.media;
public class DigitalVideoDisc extends Media{
    private static int nbDigitalVideoDiscs = 0;
    private int length;
    private String director;
    /*public static void main(String args[]){
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        swap(jungleDVD, cinderellaDVD);
        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("Cinderella dvd title: " + cinderellaDVD.getTitle());
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
    }
    public void setTitle(String title){
        this.title = title;
    }
    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }*/
    //public void setTitle(String title){
    //    this.title = title;
    //}
    public String getDirector(){
        return director;
    }
    public DigitalVideoDisc(String title){
        super(nbDigitalVideoDiscs, title, "", 0.0f);
        nbDigitalVideoDiscs ++;
    }
    public DigitalVideoDisc(String title, String category, float cost){
        super(nbDigitalVideoDiscs, title, category, cost);
        nbDigitalVideoDiscs ++;
    }
    public DigitalVideoDisc(String title, String category, String director, float cost){
        this(title, category, cost);
        this.director = director;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        this(title, category, director, cost);
        this.length = length;
    }
    public boolean equals(DigitalVideoDisc disc){
        return this.getTitle() == disc.getTitle()  && this.getCaterogy() == disc.getCaterogy() && this.director == disc.director && this.length == disc.length && this.getCost() == disc.getCost() ;
    }
    public String toString(){
        return "DVD - " + this.getTitle()  + " - " + this.getCaterogy() + " - " + this.director + " - " + this.length + " - " + this.getCost()  + " $";
    }
    public boolean isMatch(String title){
        return this.getTitle() .contains(title);
    }
}