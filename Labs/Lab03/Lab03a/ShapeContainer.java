/* @author Ege Darcin
 * Version 1.1
 * 21302460
 * Lab03a
 */    
import java.util.*;
public class ShapeContainer {
  
  // Variables
  private ArrayList <Shape> shapes;
  private int valid;
  
  // Constructor
  public ShapeContainer() {
    shapes = new ArrayList <Shape>();
  }
  
  // Add method
  public void add (Shape s) {
    shapes.add(s);
  }
  // Returns the combined surface areas of the shapes in ShapeContainer
  public double getArea() {
    double totalArea = 0;
    for (int i = 0; i < shapes.size(); i++) {
      totalArea += (shapes.get(i)).getArea();
    }
    return totalArea;
  }
  // Retunrs the first shape in the container that contains the given location
  public Shape firstShape(int x, int y) 
  {
    for(int i = 0; i < shapes.size(); i++) {
      if(((Selectable)shapes.get(i)).contains(x, y)) {
        ((Selectable)shapes.get(i)).setSelected(true);
        return shapes.get(i);
      }
    }
    return null;
  }
 
  // Remove selected shapes from the set of  shapes
  public void delete() {
    for (int i = 0; i<shapes.size(); i++){
      if (((Selectable)shapes.get(i)).getSelected() == true){
        shapes.remove(i);
      }
    }
  }
  
  // Generate a descriptive text for the ShapeContainer class.
  public String toString() {
    
    String str = "";
    int index = 0;
    
    for(int i = 0; i < shapes.size(); i++) {
      str += "Shape at " + index + " " + (shapes.get(i)).getInfo() + "\n";
      index++;
    }
    if (str.equals(""))
      str = "There are no shapes in this container!";
    return str;
    
  }
}