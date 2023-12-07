package lab4.authorandbook;

public class TestMain {
    public static void main(String[] args) {

        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);

        Book dummyBook = new Book("Java For Dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("Name is: " + dummyBook.getName());
        System.out.println("Price is: " + dummyBook.getPrice());
        System.out.println("Qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Author name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author email is: " + dummyBook.getAuthor().getEmail());

        Book anotherBook = new Book("More Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);
    }
}


