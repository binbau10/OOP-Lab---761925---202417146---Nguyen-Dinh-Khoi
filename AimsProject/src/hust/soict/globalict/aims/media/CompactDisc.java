package AimsProject.src.hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;
public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<Track> ();
    public String getArtist() {
        return artist;
    }
    public CompactDisc(String artist, String title, String category, float cost){
        super(title, category, cost);
        this.artist = artist;
    }
    public void addTrack(Track track){
        if (!tracks.contains(track)){
            tracks.add(track);
            System.out.println("Successfully added.");
            return;
        }
        System.out.println("The track is already in the CD.");
    }
    public void removeTrack(Track track){
        if (tracks.contains(track)){
            tracks.remove(track);
            System.out.println("Successfully removed.");
            return;
        }
        System.out.println("The track is not in the CD.");
    }public int getLength(){
        int l = 0;
        for (Track track : tracks){
            l += track.getLength();
        }
        return l;
    }
    public void play(){
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD length: " + this.getLength());
        for (Track track : tracks){
            track.play();
        }
    }
}
