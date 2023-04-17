package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> itemMap = new HashMap<String, Item>();

    public Registry() {
        loadItems();
    }

    private void loadItems() {
        Book book = new Book();
        book.setAuthor("Author");
        itemMap.put("Book", book);

        Game game = new Game();
        game.setStudio("Studio");
        itemMap.put("Game", game);
    }

    public Item createItem(String type) throws CloneNotSupportedException {
        return (Item) (itemMap.get(type)).clone();
    }

}
