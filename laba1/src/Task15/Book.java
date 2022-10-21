package Task15;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public String getTitle()
    {
        return this.title;
    }

    public String getAuthor()
    {
        return this.author;
    }

    public int getPrice()
    {
        return this.price;
    }

    @Override
    public int hashCode()
    {
        return 11 * title.hashCode() + 31 * author.hashCode() + Integer.valueOf(price).hashCode() * 113 + 20456;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Book)) {
            return false;
        }
        if (obj.hashCode() != hashCode()) {
            return false;
        }

        Book book = (Book) obj;
        return this.title.equals(book.title) && this.author.equals(book.author) && this.price == book.price;
    }

    @Override
    public String toString()
    {
        return "Title:" + title + "|Author:" + author + "|Price:" + price + "|Edition:" + edition;
    }

    @Override
    public Book clone() {
		Book book = new Book();
		book.title = this.title;
		book.author = this.author;
		book.price = this.price;
	
		return book;	
	}

    @Override
    public int compareTo(Book book) {
		return Integer.compare(isbn, book.isbn);
	}	
}

