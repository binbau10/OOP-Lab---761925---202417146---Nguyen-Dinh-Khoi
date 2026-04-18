package AimsProject.src.hust.soict.globalict.aims.media;
import java.util.Comparator;
public class MediaComparatorByTitleCost implements Comparator<Media>{
    public int compare(Media m1, Media m2){
        int res = -Float.compare(m1.getCost(), m2.getCost());
        if (res != 0) return res;
        return (m1.getTitle()).compareTo(m2.getTitle());
    }
}
