import java.util.NoSuchElementException;

public class Mylist < T > 
{
    public ListNode < T > firstNode;
    public ListNode < T > lastNode;

    public String name;		// string used in printing

    //constructor creates empty List with "my list" as the name
    public Mylist ()
    {
        System.out.println (" list default constructor");
    }

    //constructor creates an empty List with a name
    public Mylist (String listName)
    {
        name = listName;
        firstNode = lastNode = null;
        System.out.println (listName + " created using list 2nd constructor");
    }

    //insert item in front
    public void insertAtFront (T insertItem)
    {
        if (isEmpty ())
        {
	        firstNode = lastNode = new ListNode < T > (insertItem);
        }
        else
        { 
	        firstNode = new ListNode < T > (insertItem, firstNode);
        }
    }

    //insert item at the back
    public void insertAtBack (T insertItem)
    {
        if (isEmpty ())
        {
	        firstNode = lastNode = new ListNode < T > (insertItem);
        }
        else
        {
	        ListNode < T > current = firstNode;
	        while (current.nextNode != null)
	        {
	            current = current.nextNode;
	        }
	    current.nextNode = lastNode = new ListNode < T > (insertItem);
        }
    }

    //determine whether list is empty
    public boolean isEmpty ()
    {
        return firstNode == null;	// return true if list is empty
    }

    //output list contents
    public void print ()
    {
        if (isEmpty ())
        {
	        System.out.printf ("Empty %s\n", name);
	        return;
        }
        System.out.printf ("%s is: ", name);
        ListNode < T > current = firstNode;

        //while not at end of list, output current node's data
        while (current != null)
        {
	        System.out.printf ("%s ", current.data);
	        current = current.nextNode;
        }
        System.out.println ();
    }

    public int size ()		// returns the number of items in the list
    {
        int count = 0;
        ListNode < T > current = firstNode;
        while (current != null)
        {
	        count++;
	        current = current.nextNode;
        }
        return count;
    }

    public T removeFromFront() throws NoSuchElementException
    {
        if (isEmpty())
        {
            throw new NoSuchElementException("List is Empty.");
        }
        T removedItem = firstNode.data;
        if (firstNode == lastNode)
        {
            firstNode = lastNode = null;
        }
        else
        {
            firstNode = firstNode.nextNode;
        }
        return removedItem;
    }

    public T removeFromBack() throws NoSuchElementException
    {
        if (isEmpty())
        {
            throw new NoSuchElementException("List is Empty.");
        }
        T removedItem = lastNode.data;
        if (lastNode == firstNode)
        {
            firstNode = lastNode = null;
        }
        else
        {
            lastNode = lastNode.nextNode;
        }
        return removedItem;
    }

    class ListNode <T> 
    {
        T data;// data for this node
        ListNode<T> nextNode;// reference to the next node in the list

        //constructor creates a ListNode that refers to object
        ListNode(T object) 
        {
            this(object, null);
        }

	    //constructor creates ListNode that refers to the specified
	    //object and to the next ListNode
	    ListNode(T object, ListNode<T> node) 
        {
	        data = object;
	        nextNode = node;
	    }

	  //return reference to data in node
        T getData() 
        {
            return data;// return item in this node
        }

        //return reference to next node in list
        ListNode<T> getNext() 
        {
            return nextNode;// get next node
        }	
    }
}
