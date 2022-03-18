import java.util.Scanner;

public class TreeTest {
   public static void main(String[] args) {
      // get input string
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a string");
      String input = scanner.nextLine();
      Tree<String> tree = new Tree<>();

      // insert input string into tree
      for (String word : input.split("\\s+")) {
         tree.insertNode(word);
      }

      System.out.println("\nPreorder traversal");
      tree.preorderTraversal();

      System.out.println("\n\nInorder traversal");
      tree.inorderTraversal();

      System.out.println("\n\nPostorder traversal");
      tree.postorderTraversal();

      System.out.println(); // print trailing newline
   }
}

