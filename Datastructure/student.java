import java.util.LinkedList;
public class student {
public static void main(String[] args) {
LinkedList<String> admissionQueue = new LinkedList<>();
admissionQueue.addLast("Varsha");
admissionQueue.addLast("Kunal");
admissionQueue.addFirst("VIP Karan");
String admittedStudent = admissionQueue.removeFirst();
System.out.println("Admitted: " + admittedStudent);
System.out.println("Remaining Queue: " + admissionQueue);
}
}