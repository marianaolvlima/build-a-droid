public class Droid {

  // instances
  int batteryLevel;
  String name;

  // toString method
  public String toString() {
    return "Hello, I'm the droid: " + name + "!";
  }

  // constructor method
  public Droid(String droidName) {
    name = droidName; 
    batteryLevel = 100;
  }

  // doing Droid things method
  public void performTask(String task) {
    // Printing a statement indicating the droid is performing a task
    System.out.println(name + " is performing task: " + task);
    // decreasing batteryLevel by 10 after performing a task
    batteryLevel -= 10;
    System.out.println("Battery Level: " + batteryLevel);
  }

  // energy report method
  public void energyReport() {
    System.out.println("Energy report: " + batteryLevel);
  }

  // main method
  public static void main(String[] args) {
    // creating a new instance of Droid named "Codey"
    Droid codey = new Droid("Codey");
    System.out.println(codey);

    // performing a task with the droid
    codey.performTask("levitating!");

    // performing a energy report
    codey.energyReport();
  }
}