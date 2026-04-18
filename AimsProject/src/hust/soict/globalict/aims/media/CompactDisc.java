package AimsProject.src.hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;
public class CompactDisc extends Disc{
    private String artist;
    private List<Track> tracks = new ArrayList<Track> ();
    public String getArtist() {
        return artist;
    }
    public CompactDisc(String artist){
        super("");
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
}
