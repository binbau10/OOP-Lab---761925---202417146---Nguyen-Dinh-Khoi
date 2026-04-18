package AimsProject.src.hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;
public class Book extends Media {
    private List<String> authors = new ArrayList<String>();
    public Book(){
        super();
    }
    public void addAuthor(String authorName){
        if (!authors.contains(authorName)){
            authors.add(authorName);
            System.out.println("Author " + authorName + " added.");
        }
        else{
            System.out.println("Author " + authorName + " is already listed");
        }
    }
    public void removeAuthor(String authorName){
        if (authors.contains(authorName)){
            authors.remove(authorName);
            System.out.println("Author " + authorName + " removed.");
        }
        else{
            System.out.println("Author " + authorName + " is not listed");
        }
    }
}
