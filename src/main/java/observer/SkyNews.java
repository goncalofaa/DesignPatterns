package observer;

public class SkyNews implements Media{
    private String news;

    @Override
    public void update(String news) {
        this.news = news;
    }

    public String getNews() {
        return news;
    }
}
