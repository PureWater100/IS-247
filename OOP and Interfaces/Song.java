public class Song extends GeneralLibraryItem implements PrintItem 
{
   private String type;
   private String artist;
   
   public Song() //no-arg constructor, it uses the following constructor  
   {
      this("Fur Elise", "Classical", "Mozart"); //creates a classical song object
   }
   
   public Song(String title, String type, String artist) //overloaded constructor, we will use this to create song objects 
   {
      this.type = type;
      this.artist = artist;
      this.title = title; 
   }
   
   public String getType() //gets type
   {
      return type;
   }
   
   public void setType(String type) //just in case we wanted to change the type
   {
      this.type = type;
   }
   
   public String getArtist() //gets artist 
   {
      return artist;
   }
   
   public void setArtist(String artist) //just in case we wanted to change the artist
   {
      this.artist = artist;
   }
   
   @Override
   public String printMyStuff() //This method is from the abstract interface PrintItem, in which we implement it here in this concrete subclass 
   {
      return "Library item number " + super.setNumObjects() + "\nThe song title is " + title +
         "\nThe song type is " + type + "\nThe artist for this song is " + artist;
   } 
}