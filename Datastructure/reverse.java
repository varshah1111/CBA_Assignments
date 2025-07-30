import java.util.
*;
public class reverse {
public static void main(String[] args) {
Queue<String> queue = new LinkedList<>();
Stack<String> stack = new Stack<>();
queue.offer("10");
queue.offer("20");
queue.offer("30");
queue.offer("40");
queue.offer("50");
while (!queue.isEmpty()) {
stack.push(queue.poll());
}
while (!stack.isEmpty()) {
queue.offer(stack.pop());
}
System.out.println("Reversed Queue: " + queue);
}
}