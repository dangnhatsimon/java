import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    // Print the size of each ArrayList below:
    System.out.println(sherlocksToDos.size());
    System.out.println(poirotsToDos.size());
    // Print the name of the detective with the larger to-do list:
    if (sherlocksToDos.size()>poirotsToDos.size()) {
      System.out.println("Sherlock does a lot of cases than Poirot");
    } else {
      System.out.println("Poirot does a lot of cases than Sherlock");
    }

    System.out.println("Sherlock's third to-do:");
    // Print Sherlock's third to-do:
    System.out.println(sherlocksToDos.get(2));
    
    System.out.println("\nPoirot's second to-do:");
    // Print Poirot's second to-do:
    System.out.println(poirotsToDos.get(1));

    // Set each to-do below:
    sherlocksToDos.set(1,"listen to Dr. Watson for amusement");
    poirotsToDos.set(3,"listen to Captain Hastings for amusement");
    
    System.out.println("Sherlock's to-do list:");
    System.out.println(sherlocksToDos.toString() + "\n");
    System.out.println("Poirot's to-do list:");
    System.out.println(poirotsToDos.toString());

    // Remove each to-do below:
    sherlocksToDos.remove("visit the crime scene");
    poirotsToDos.remove("visit the crime scene");
    sherlocksToDos.remove(0);

    // Change the value printed:
    System.out.println(sherlocksToDos.indexOf("solve the case"));
  }
  
}
