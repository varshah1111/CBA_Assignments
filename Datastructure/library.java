import java.util.Stack;
public class library {
Stack<String> books = new Stack<>();
public void addBook(String book) {
books.push(book);
}
public void removeBook() {
if (!books.isEmpty()) {
System.out.println("Removed book: " + books.pop());
} else {
System.out.println("No books to remove.");
}
}
public void peekBook() {
if (!books.isEmpty()) {
System.out.println("Top book: " + books.peek());
} else {
System.out.println("No books in stack.");
}
}
public static void main(String[] args) {
library stack = new library();
stack.addBook("Operating System");
stack.addBook("Computer Architecture");
stack.peekBook();
stack.removeBook();
stack.peekBook();
}
}