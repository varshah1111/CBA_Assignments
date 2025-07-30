import java.util.Scanner;
class Node {
String carNumber;
Node next;
Node(String carNumber) {
this.carNumber = carNumber;
this.next = null;
}
}
class Main {
private Node front, rear;
Main() {
front = rear = null;
}
public void addNormalCar(String carNumber) {
Node newNode = new Node(carNumber);
if (rear == null) {
front = rear = newNode;
} else {
rear.next = newNode;
rear = newNode;
}
System.out.println("Normal car " + carNumber + " added at the end.");
}
public void addVIPCar(String carNumber) {
}
Node newNode = new Node(carNumber);
if(front == null) {
front = rear = newNode;
} 
else 
{
newNode.next = front;
front = newNode;
}
System.out.println(" VIP car " + carNumber + " added at the front.");
public void removeCar() {
if (front == null) {
System.out.println("No cars in queue to remove.");
return;
}
System.out.println(" Car " + front.carNumber + " washed and removed.");
front = front.next;
if (front == null) rear = null;
}
public void displayQueue() {
if (front == null) {
System.out.println("Queue is empty.");
return;
}
System.out.print("Current Queue: ");
Node temp = front;
while (temp != null) {
System.out.print(temp.carNumber + " ");
temp = temp.next;
}
System.out.println();
}
public static void main(String[] args) {
library queue = new library();
Scanner sc = new Scanner(System.in);
int choice;
String carNumber;
do {
System.out.println("\nCar Wash Service Queue Menu:");
System.out.println("1. Add Normal Car");
System.out.println("2. Add VIP Car");
System.out.println("3. Remove Car After Washing");
System.out.println("4. Display Queue");
System.out.println("5. Exit");
System.out.print("Enter choice: ");
choice = sc.nextInt();
sc.nextLine();
switch (choice) {
case 1:
System.out.print("Enter car number: ");
carNumber = sc.nextLine();
queue.addNormalCar(carNumber);
break;
case 2:
System.out.print("Enter VIP car number: ");
carNumber = sc.nextLine();
queue.addVIPCar(carNumber);
break;
case 3:
queue.removeCar();
break;
case 4:
queue.displayQueue();
break;
case 5:
System.out.println("Exiting Car Wash System.");
break;
default:
System.out.println("Invalid choice. Try again.");
}
} while (choice != 5);
sc.close();
}
}