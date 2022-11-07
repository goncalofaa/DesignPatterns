package observer;

public class ObserverApplication {

    public static void main(String[] args) {

        NewsAgency newsAgency = new NewsAgency();

        Expresso expresso = new Expresso();
        SkyNews skyNews = new SkyNews();

        newsAgency.addObserver(expresso);
        newsAgency.addObserver(skyNews);

        newsAgency.update("Teresa Bonvalot on the CT");

        System.out.println(expresso.getNews());
        System.out.println(skyNews.getNews());

    }
}
