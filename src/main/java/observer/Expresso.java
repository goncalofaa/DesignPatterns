package observer;

public class Expresso implements Media{
    private String news;

    public String getNews() {
        return news;
    }

    @Override
    public void update(String news) {
        this.news = news;
    }
}
