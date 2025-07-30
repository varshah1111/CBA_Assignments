class Patient {
String name;
Patient next;
public Patient(String name) {
this.name = name;
this.next = null;
}
}
class Hospital {
private Patient head;
public void addPatient(String name) {
Patient newPatient = new Patient(name);
if (head == null) {
head = newPatient;
return;
}
Patient temp = head;
while (temp.next != null) {
temp = temp.next;
}
temp.next = newPatient;
}
public void addEmergencyPatient(String name) {
Patient newPatient = new Patient(name);
newPatient.next = head;
head = newPatient;
}
public void dischargePatient(String name) {
if (head == null) {
System.out.println("Queue is empty. No patient to discharge.");
return;
}
if (head.name.equals(name)) {
System.out.println("Discharged: " + head.name);
head = head.next;
return;
}
Patient current = head;
Patient prev = null;
while (current != null && !current.name.equals(name)) {
prev = current;
current = current.next;
}
if (current == null) {
System.out.println("Patient named \"" + name + "\" not found in the queue.");
return;
}
prev.next = current.next;
System.out.println("Discharged: " + current.name);
}
public void displayQueue() {
if (head == null) {
System.out.println("Queue is empty.");
return;
}
Patient temp = head;
System.out.println("Current Patient Queue:");
while (temp != null) {
System.out.print(temp.name + "-> ");
temp = temp.next;
}
System.out.println("NULL");
}
public static void main(String[] args) {
Hospital queue = new Hospital();
queue.addPatient("John");
queue.addPatient("Emma");
queue.addEmergencyPatient("Drake");
queue.addPatient("Sophia");
queue.addEmergencyPatient("Mia");
queue.displayQueue();
System.out.println("\nDischarging patient: Emma");
queue.dischargePatient("Emma");
System.out.println("\nUpdated Queue:");
queue.displayQueue();
}
}