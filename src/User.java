import java.util.ArrayList;

public class User {

    private String userId = "";
    private String name = "";
    private String email = "";
    private LibraryItem[] borrowedItems;

    public User (String userId, String name, String email){
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public String getUserId(){
        return userId;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String addBorrowedItem (LibraryItem  item){

    }

    public String removeBorrowedItem (LibraryItem  item){

    }

    public String displayBorrowedItem (LibraryItem  item){

    }
}
