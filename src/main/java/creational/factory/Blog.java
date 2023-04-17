package creational.factory;

public class Blog extends Website{

    @Override
    public void createWebsite() {
        pageList.add(new BlogPage());
    }
}
