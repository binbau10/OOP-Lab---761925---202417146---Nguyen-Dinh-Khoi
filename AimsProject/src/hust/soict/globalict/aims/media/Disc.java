package AimsProject.src.hust.soict.globalict.aims.media;

import javax.naming.LimitExceededException;

public class Disc extends Media {
    private int length;
    private String director;
    public int getLength() {
        return length;
    }
    public String getDirector() {
        return director;
    }
    public Disc(String title) throws LimitExceededException{
        super(title, "", 0.0f);
    }
    public Disc(String title, String category, float cost) throws LimitExceededException{
        super(title, category, cost);
    }
    public Disc(String title, String category, String director, float cost)throws LimitExceededException{
        this(title, category, cost);
        this.director = director;
    }
    public Disc(String title, String category, String director, int length, float cost)throws LimitExceededException{
        this(title, category, director, cost);
        if (length <= 0) throw new LimitExceededException("ERROR: Length must be greater than 0");
        this.length = length;
    }
}
