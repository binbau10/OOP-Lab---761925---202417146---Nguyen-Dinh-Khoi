package AimsProject.src.hust.soict.globalict.aims.media;

import javax.naming.LimitExceededException;

import AimsProject.src.hust.soict.globalict.aims.exception.PlayerException;

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
    public void play() throws PlayerException{
        if(this.getLength() <= 0){
            throw new PlayerException("Error: DVD length is non-positive!");
        }
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
    public boolean equals(Object object) throws NullPointerException, ClassCastException{
        return this.title == ((Track)object).title && this.length == ((Track)object).length;
    }
}
