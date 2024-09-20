import java.util.*;

public class PalindromeCheck {
    public static boolean isPalindrome(LinkedList<Integer> list) {

        StringBuilder original = new StringBuilder();
        StringBuilder reversed = new StringBuilder();


        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            original.append(iterator.next());
        }


        ListIterator<Integer> reverseIterator = list.listIterator(list.size());
        while (reverseIterator.hasPrevious()) {
            reversed.append(reverseIterator.previous());
        }

        return original.toString().equals(reversed.toString());
    }

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);

        // Check if the LinkedList is palindrome
        if (isPalindrome(list)) {
            System.out.println("The LinkedList is a palindrome.");
        } else {
            System.out.println("The LinkedList is not a palindrome.");
        }
    }

}