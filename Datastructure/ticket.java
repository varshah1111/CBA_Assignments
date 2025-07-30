import java.util.Scanner;
class Node {
String name;
Node next;
public Node(String name) {
this.name = name;
this.next = null;
}
}
class ticket {
private Node front, rear;
public ticket() {
front = rear = null;
}
public void enqueue(String name) {
Node newNode = new Node(name);
if (rear == null) {
front = rear = newNode;
} else {
rear.next = newNode;
rear = newNode;
}
System.out.println(name + " added to the booking queue.");
}
public void dequeue() {
if (front == null) {
System.out.println("Queue is empty. No person to serve.");
return;
}
System.out.println(front.name + " has been served and removed from the queue.");
front = front.next;
if (front == null) rear = null;
}
public void cancelTicket(String name) {
if (front == null) {
System.out.println("Queue is empty.");
return;
}
if (front.name.equals(name)) {
dequeue();
return;
}
Node prev = null, curr = front;
while (curr != null && !curr.name.equals(name)) {
prev = curr;
curr = curr.next;
}
if (curr == null) {
System.out.println(name + " not found in queue.");
return;
}
prev.next = curr.next;
if (curr == rear) rear = prev;
System.out.println(name + "'s ticket has been cancelled.");
}
public void displayQueue() {
if (front == null) {
System.out.println("Queue is empty.");
return;
}
System.out.print("Current Queue: ");
Node temp = front;
while (temp != null) {
System.out.print(temp.name + " ");
temp = temp.next;
}
System.out.println();
}
public static void main(String[] args) {
ticket queue = new ticket();
Scanner sc = new Scanner(System.in);
int choice;
String name;
do {
System.out.println("\n--- Ticket Booking Menu ---");
System.out.println("1. Add Person");
System.out.println("2. Serve Person");
System.out.println("3. Cancel Ticket");
System.out.println("4. Display Queue");
System.out.println("5. Exit");
System.out.print("Enter your choice: ");
choice = sc.nextInt();
sc.nextLine();
switch (choice) {
case 1:
System.out.print("Enter name to add: ");
name = sc.nextLine();
queue.enqueue(name);
break;
case 2:
queue.dequeue();
break;
case 3:
System.out.print("Enter name to cancel: ");
name = sc.nextLine();
queue.cancelTicket(name);
break;
case 4:
queue.displayQueue();
break;
case 5:
System.out.println("Exiting system.");
break;
default:
System.out.println("Invalid choice. Try again.");
}
} while (choice != 5);
sc.close();
}
}