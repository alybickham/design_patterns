package observer;

/**
 * A Book object
 * @author Ashley Bickham
 */
public class Book {
   
    private String title;
    private String authorFirstName;
    private String authorLastName;

    /**
     * Constructs a Book object with the indicated title and author name
     * @param title The title of the Book
     * @param authorFirstName The Book author's first name
     * @param authorLastName The Book author's last name
     */
    public Book(String title, String authorFirstName, String authorLastName) {
              this.title = title;
              this.authorFirstName = authorFirstName;
              this.authorLastName = authorLastName;
    }

    /**
     * Retrieves the Book's title
     * @return A String of the Book's title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Retrieves the author's first name
     * @return A String of the author's first name
     */
    public String getAuthorFirstName(){
        return this.authorFirstName;
    }

    /**
     * Retrieves the author's last name
     * @return A String of the author's last name
     */
    public String getAuthorLastName(){
        return this.authorLastName;
    }

    /**
     * Consolidates the Book's title and author into one line
     * @return A String of the Book's title and author
     */
    public String toString(){
        return (" - " + title + " by: " + authorFirstName + " " + authorLastName);
    }
    
}
