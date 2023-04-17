package creational.factory;

public class Shop extends Website {

    @Override
    public void createWebsite() {
        pageList.add(new BlogPage());
    }
}
