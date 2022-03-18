public class Book extends GeneralLibraryItem implements PrintItem 
{
   private String author;
   private int pages;
   private boolean fiction;
   
   public Book() //no-arg constructor, it uses the following constructor  
   {
      this("Sherlock Holmes", "Arthur Conan Doyle", false, 1000); //creates a mystery novel object
   }
   
   public Book(String title, String author, boolean fiction, int pages) //overloaded constructor, we will use this to create book objects 
   {
      this.author = author;
      this.fiction = fiction;
      this.pages = pages;
      this.title = title;
   }
   
   public boolean fiction() //gets fiction boolean value 
   {
      return fiction;
   }
   
   public void setFiction(boolean fiction) //just in case we wanted to change fiction to non-fiction or vice-versa
   {
      this.fiction = fiction;
   }
   
   public String getAuthor() //gets author
   {
      return author;
   }
   
   public void setAuthor(String author) //just in case we wanted to change the author
   {
      this.author = author;
   }
   
   public int getPages() //gets number of pages 
   {
      return pages;
   }
   
   public void setPages(int pages) //just in case we wanted to change the number of pages
   {
      this.pages = pages;
   }
   
   @Override
   public String printMyStuff() //This method is from the abstract interface PrintItem, in which we implement it here in this concrete subclass 
   {
      return "Library item number " + super.setNumObjects() + "\nThe book title is " + title +
         "\nThe book author is " + author + "\nThe book is " + ((fiction == true) ? "fiction" : "non-fiction") + " and " + pages + " pages long.";
   } 
}

