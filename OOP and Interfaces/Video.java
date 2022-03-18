public class Video extends GeneralLibraryItem implements PrintItem 
{
   private String genre;
   private String rating;
   private int runningTime;

   public Video() //no-arg constructor, it uses the following constructor  
   {
      this("Akira", "Anime", "R", 90); //creates an anime video object
   }
   
   public Video(String title, String genre, String rating, int runningTime) //overloaded constructor, we will use this to create video objects 
   {
      this.genre = genre;
      this.rating = rating;
      this.runningTime = runningTime;
      this.title = title;
   }
   
   public String getGenre() //gets genre 
   {
      return genre;
   }
   
   public void setGenre(String genre) //just in case we wanted to change the genre
   {
      this.genre = genre;
   }
   
   public String getRating() //gets rating
   {
      return rating;
   }
   
   public void setRating(String rating) //just in case we wanted to change the rating
   {
      this.rating = rating;
   }
   
   public int getRunningTime() //gets the running time in minutes 
   {
      return runningTime;
   }
   
   public void setRunningTime(int runningTime) //just in case we wanted to change the running time in minutes 
   {
      this.runningTime = runningTime;
   }
   
   @Override
   public String printMyStuff() //This method is from the abstract interface PrintItem, in which we implement it here in this concrete subclass 
   {
      return "Library item number " + super.setNumObjects() + "\nThe video title is " + title +
         "\nThe video genre is " + genre + "\nThe video is rated " + rating + " and runs for " + runningTime + " minutes.";
   } 
}
