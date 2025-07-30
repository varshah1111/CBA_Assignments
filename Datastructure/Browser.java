import java.util.Stack;
public class Browser {
private Stack<String> backStack;
private Stack<String> forwardStack;
private String currentPage;
public Browser() {
backStack = new Stack<>();
forwardStack = new Stack<>();
currentPage = "Home";
}
public void visit(String url) {
if (currentPage != null) {
backStack.push(currentPage);
}
currentPage = url;
forwardStack.clear();
System.out.println("Visited: " + currentPage);
}
public void back() {
if (backStack.isEmpty()) {
System.out.println("No pages to go back to.");
return;
}
forwardStack.push(currentPage);
currentPage = backStack.pop();
System.out.println("Went back to: " + currentPage);
}
public void forward() {
if (forwardStack.isEmpty()) {
System.out.println("No pages to go forward to.");
return;
}
backStack.push(currentPage);
currentPage = forwardStack.pop();
System.out.println("Went forward to: " + currentPage);
}
public void current() {
System.out.println("Current page: " + currentPage);
}
public static void main(String[] args) {
Browser b = new Browser();
b.current();
b.visit("web1.com");
b.visit("web2.com");
b.visit("web3.com");
b.back();
b.back();
b.back();
b.forward();
b.visit("web4.com");
b.back();
b.current();
}
}