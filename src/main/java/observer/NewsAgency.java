package observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    String news;

    List<Media> mediaList = new ArrayList<>();

    public void addObserver(Media media){
        this.mediaList.add(media);
    }

    public void removeObserver(Media media){
        this.mediaList.remove(media);
    }

    public void update(String news){
        this.news = news;
        for (Media media: mediaList){
            media.update(news);
        }
    }


}
