import java.util.Scanner;

public class Book {
public static void main(String[] args) {
System.out.println("Enter book names");
int j = 0;
Scanner sc=new Scanner(System.in);
        String bookName=sc.nextLine();
        String[] favouriteBooks=new String[10];

        addFavouriteBook(bookName);
        favouriteBooks[j++] = bookName;

        String search  = "Great";

        if(bookName.toLowerCase().indexOf(search.toLowerCase())==1) {
                      for(int i=0;i<10;i++) {
                                    favouriteBooks[i]=bookName;
                      }
        }

}



static boolean addFavouriteBook(String bookName) {

        if(bookName.contains("Great"))
        {
        return false;
        }
        return true;

}



public static void printFavouriteBooks() {
System.out.println("Favorite Books: ..");

        String[] favouriteBooks=new String[10];

        for(int i=0;i<10;i++) {
                      System.out.println(favouriteBooks[i]);
                      }                            
}



}           
