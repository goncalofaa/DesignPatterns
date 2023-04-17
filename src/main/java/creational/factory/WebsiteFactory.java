package creational.factory;

import static creational.factory.WebsiteType.BLOG;
import static creational.factory.WebsiteType.SHOP;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType websiteType){
        switch (websiteType){
            case BLOG: return new Blog();
            case SHOP: return new Shop();
            default: return null;
        }
    }
}
