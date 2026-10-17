class Book {
    int bookid;
    String Title;
    String Author;
    double Price;

    static int totalBooks = 0;

    Book(int bookid, String Title, String Author, double Price) {
        this.bookid = bookid;
        this.Title = Title;
        this.Author = Author;
        this.Price = Price;
        totalBooks++;
    }

    // Display book details
    void display() {
        System.out.println("Book ID: " + bookid);
        System.out.println("Title: " + Title);
        System.out.println("Author: " + Author);
        System.out.println("Price: " + Price);
        System.out.println("-------------------------");
    }

    // Search by Book ID
    boolean search(int id) {
        return this.bookid == id;
    }

    // Search by Title
    boolean search(String Title) {
        return this.Title.equalsIgnoreCase(Title);
    }

    // Find the costlier book
    Book costlierBook(Book other) {
        if (this.Price >= other.Price) {
            return this;
        } else {
            return other;
        }
    }

    // Get total number of books
    static int getTotalBooks() {
        return totalBooks;
    }
}

public class book {
    public static void main(String args[]) {
        Book b1 = new Book(101, "Java programming","James Gosling", 550.00);
        Book b2 = new Book(102, "Python Basics","Guido van Rossum", 450.00);
        Book b3 = new Book(103, "Data Structures","Mark Allen", 650.00);

        System.out.println("BOOK DETAILS");
        System.out.println("=========================");
        b1.display();
        b2.display();
        b3.display();

        System.out.println("Searching by Book ID 102:");

        if (b2.search(102)) {
            System.out.println("Book found: Python Basics");
        } else {
            System.out.println("Book not found.");
        }

        // Search by Title
        System.out.println("\nSearching by Title: Data Structures");

        if (b3.search("Data Structures")) {
            System.out.println("Book found: Data Structures");
        } else {
            System.out.println("Book not found.");
        }

        // Find the costlier book
        Book costlier = b1.costlierBook(b3);

        System.out.println("\nCostlier Book:");
        costlier.display();

        // Display total number of books
        System.out.println("Total Books Created: "+ Book.getTotalBooks());
    }
}