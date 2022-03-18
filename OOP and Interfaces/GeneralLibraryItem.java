//this is the abstract parent class, from which 3 subclasses will extend from.
//this contains the common attributes title and library ID. 

public abstract class GeneralLibraryItem 
{  
   //data fields 
   public String title;
   private static int numObjects; //tracks the number of objects, this is what we will use for the library ID
      
   //This method is inside the printMyStuff method. Each time the printMyStuff method is invoked, an object is created. 
   public static int setNumObjects()   
   {
      return ++numObjects; //returns the number of objects and assigns it to Library ID 
   }
   
   //this getter is used to retrieve the number of objects (will be invoked in the last line of the client class). 
   public static int getNumObjects() 
   {
      return numObjects; //returns the number of objects 
   }
   
}