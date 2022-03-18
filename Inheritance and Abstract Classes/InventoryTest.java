//driver/tester class

public class InventoryTest {

    public static void main(String[] args) 
    {
        
        Mylist<FrozenFood> list1 = new Mylist<FrozenFood>("frozen food list"); 
        FrozenFood ff1 = new FrozenFood("Pizza", 1, 10);
        FrozenFood ff2 = new FrozenFood("Cake", 3, 9);
        FrozenFood ff3 = new FrozenFood("Chicken Nuggets", 45, 20);

        Mylist<Deli> list2 = new Mylist<Deli>("deli list");
        Deli d1 = new Deli("Turkey", 4, 20);
        Deli d2 = new Deli("Steak", 5, 30);
        Deli d3 = new Deli("Chicken", 3, 15);

        list1.insertAtFront(ff1);
        list2.insertAtFront(d1);
        System.out.println("Beginning of lists: ");
        list1.print();
        System.out.println("Size is: " + list1.size());
        list2.print();
        System.out.println("Size is: " + list2.size());

        System.out.println("Insert at front: ");
        list1.insertAtFront(ff2);
        list2.insertAtFront(d2);
        list1.print();
        System.out.println("Size is: " + list1.size());
        list2.print();
        System.out.println("Size is: " + list2.size());


        System.out.println("Insert at back: ");
        list1.insertAtBack(ff3);
        list2.insertAtBack(d3);
        list1.print();
        System.out.println("Size is: " + list1.size());
        list2.print();
        System.out.println("Size is: " + list2.size());


        System.out.println("Remove from front: ");
        list1.removeFromFront();
        list2.removeFromFront();
        list1.print();
        System.out.println("Size is: " + list1.size());
        list2.print();
        System.out.println("Size is: " + list2.size());

        System.out.println("Demonstrate exception:");
        Mylist<FrozenFood> list3 = new Mylist<FrozenFood>("empty list"); 
        list3.removeFromFront();
    }
}
  