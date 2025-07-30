class PrintJob {
String documentName;
PrintJob next;
public PrintJob(String documentName) {
this.documentName = documentName;
this.next = null;
}
}
class Print {
private PrintJob front;
private PrintJob rear;
public void addJob(String documentName) {
PrintJob newJob = new PrintJob(documentName);
if (rear == null) {
front = rear = newJob;
} else {
rear.next = newJob;
rear = newJob;
}
System.out.println("Added job: " + documentName);
}
public void processJob() {
if (front == null) {
System.out.println("No print jobs to process.");
return;
}
System.out.println("Processing job: " + front.documentName);
front = front.next;
if (front == null) {
rear = null;
}
}
public void viewPendingJobs() {
if (front == null) {
System.out.println("No pending print jobs.");
return;
}
System.out.println("Pending print jobs:");
PrintJob temp = front;
while (temp != null) {
System.out.println("-" + temp.documentName);
temp = temp.next;
}
}
public static void main(String[] args) {
Print queue = new Print();
queue.addJob("Report1.pdf");
queue.addJob("Assignment.docx");
queue.addJob("Report1.pdf");
queue.addJob("Report1.pdf");
queue.addJob("Report1.pdf");
queue.viewPendingJobs();
queue.processJob();
queue.viewPendingJobs();
queue.processJob();
queue.processJob();
queue.processJob();
}
}