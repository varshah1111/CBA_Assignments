import java.util.Stack;
public class undo {
private Stack<String> us;
private Stack<String> rd;
undo() {
us = new Stack<>();
rd = new Stack<>();
}
public void performAction(String action) {
us.push(action);
rd.clear();
System.out.println("Action: " + action);
}
public void undo() {
if (us.isEmpty()) {
System.out.println("Nothing to undo.");
return;
}
String lastAction = us.pop();
rd.push(lastAction);
System.out.println("Undo: " + lastAction);
}
public void redo() {
if (rd.isEmpty()) {
System.out.println("Nothing to redo.");
return;
}
String action = rd.pop();
us.push(action);
System.out.println("Redo: " + action);
}
public void currentState() {
if (us.isEmpty()) {
System.out.println("Document is empty.");
} else {
System.out.println("Current State: " + us.peek());
}
}
public static void main(String[] args) {
undo editor = new undo();
editor.performAction("Report Preparation");
editor.performAction("Assignment");
editor.performAction("Neopat");
editor.undo();
editor.undo();
editor.redo();
editor.currentState();
}
}