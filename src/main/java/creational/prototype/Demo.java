package creational.prototype;

public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Registry registry = new Registry();
        Book book = (Book) registry.createItem("Book");
        book.setAuthor("Paulo Gonzo");

        System.out.println(book);
        System.out.println(book.getAuthor());

        Book anotherBook = (Book) registry.createItem("Book");
        anotherBook.setAuthor("Júlia Pinheiro");

        System.out.println(anotherBook);
        System.out.println(anotherBook.getAuthor());

    }
}
