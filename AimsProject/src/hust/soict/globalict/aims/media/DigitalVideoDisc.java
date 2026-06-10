package AimsProject.src.hust.soict.globalict.aims.media;

import javax.naming.LimitExceededException;

public class DigitalVideoDisc extends Disc implements Playable{
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
    public DigitalVideoDisc(String title) throws LimitExceededException{
        super(title);
    }
    public DigitalVideoDisc(String title, String category, float cost) throws LimitExceededException{
        super(title, category, cost);
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) throws LimitExceededException{
        super(title, category, director, cost);
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) throws LimitExceededException{
        super(title, category, director, length, cost);
    }
    public boolean equals(DigitalVideoDisc disc){
        return this.getTitle() == disc.getTitle()  && this.getCategory() == disc.getCategory() && this.getDirector() == disc.getDirector() && this.getLength() == disc.getLength() && this.getCost() == disc.getCost() ;
    }
    public String toString(){
        return "DVD - " + this.getTitle()  + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " - " + this.getCost()  + " $";
    }

    public void play(){
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}