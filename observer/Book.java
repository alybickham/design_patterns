public class Book {
    private String title;
    private String authorFirstName;
    private String authorLastName;

    public Book (String title, String authorFirstName, String authorLastName) {
              this.title = "";
              this.authorFirstName = "";
              this.authorLastName = ""; 
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthorFirstName(){
        return this.authorFirstName;
    }

    public String getAuthorLastName(){
        return this.authorLastName;
    }

    public String toString(){
        System.out.println(title + " by: " + authorFirstName + authorLastName);
    }
    
}
