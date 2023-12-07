package lab4.authorandbookarray;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this(name,authors,price);
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" +"name=" + name +",author=" + getAuthorNames() +",price=" + price +",qty=" + qty +']';
    }

    private String getAuthorNames() {
        String str = "{";
        for (int i = 0; i < authors.length - 1; i++) {
            str += authors[i].toString() + ",";
        }
        return str + authors[authors.length - 1].toString() + "}";
    }
}
