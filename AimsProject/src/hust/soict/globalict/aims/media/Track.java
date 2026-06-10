package AimsProject.src.hust.soict.globalict.aims.media;

import javax.naming.LimitExceededException;

public class Track implements Playable{
    private String title;
    private int length;
    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }
    public Track(String title, int length) throws LimitExceededException{
        if (length <= 0){
            throw new LimitExceededException("ERROR: Length must be greater than 0");
        }
        this.title = title;
        this.length = length;
    }
    public void play(){
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
    public boolean equals(Object object){
        return this.title == ((Track)object).title && this.length == ((Track)object).length;
    }
}
