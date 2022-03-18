//this is the client class, where we will use all of our other classes as well as our interface to print a library catalog

import java.util.ArrayList;

public abstract class LibraryCatalog //adding, "extends GeneralLibraryItem implements PrintItem" is not neccessary in this class 
{
   public static void main(String[] args)
   {
      ArrayList<Song> songs = new ArrayList<>(); //create an ArrayList of Song objects
      
      songs.add(new Song("Chandelier", "pop", "Sia"));              
      songs.add(new Song("Sweet Home Chicago", "blues", "Robert Johnson"));
      songs.add(new Song("Dynamite", "pop", "BTS"));
      
            
      for (int i = 0; i < songs.size(); i++) //for loop to print out the data fields of all Song objects
      {
         System.out.println(songs.get(i).printMyStuff());
         System.out.println();
      }
      
      ArrayList<Book> books = new ArrayList<>(); //create an ArrayList of Book objects
      
      books.add(new Book("Walden", "Thoreau", false, 450));
      books.add(new Book("Hamlet", "Shakespeare", true, 320));
      books.add(new Book("Origin of Species", "Darwin", false, 250));
      
      for (int i = 0; i < books.size(); i++) //for loop to print out the data fields of all Book objects
      {
         System.out.println(books.get(i).printMyStuff());
         System.out.println();
      }
         
      ArrayList<Video> videos = new ArrayList<>(); //create an ArrayList of Video objects
      
      videos.add(new Video("Avengers", "Action", "PG13", 160));
      videos.add(new Video("Hidden Figures", "Historical Drama", "PG", 175));
      videos.add(new Video("Citizen Cane", "Drama", "PG", 90));
      
      for (int i = 0; i < videos.size(); i++) //for loop to print out the data fields of all Video objects
      {
         System.out.println(videos.get(i).printMyStuff());
         System.out.println();
      }

     
      System.out.println("The total number of items in the library is " + GeneralLibraryItem.getNumObjects());
          
   }
}
