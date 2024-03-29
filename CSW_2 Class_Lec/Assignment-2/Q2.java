class Book implements Comparable<Book>
{
    private int bookId;
    private String bookName;
    private double price;

    public Book(int bookId, String bookName, double price)
    {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public String toString()
    {
        return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + "]";
    }

    public boolean equals(Object other)
    {
        if (this == other)
            return true;

        if (other == null || getClass() != other.getClass()) 
            return false;

        Book otherBook = (Book) other;
        return bookId == otherBook.bookId && bookName.equals(otherBook.bookName) && price == otherBook.price;
    }

    public int compareTo(Book otherBook)
    {
        return Double.compare(this.price, otherBook.price);
    }
}

public class Q2
{
    public static void main(String[] args)
    {
        Book book1 = new Book(101, "The Alchemist", 15.99);
        Book book2 = new Book(102, "The Power of Habit", 12.99);

        System.out.println(book1);
        System.out.println(book2);

        if (book1.compareTo(book2) > 0)
            System.out.println(book1.getBookName() + " is more expensive than " + book2.getBookName());
        else if (book1.compareTo(book2) < 0)
            System.out.println(book1.getBookName() + " is less expensive than " + book2.getBookName());
        else
            System.out.println("Both books have the same price.");
    }
}

