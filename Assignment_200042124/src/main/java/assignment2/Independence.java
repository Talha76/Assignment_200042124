package assignment2;

import java.util.ArrayList;
import java.util.List;

public class Independence {
  class Drawer {
    List<String> items;
    public Drawer() { items = new ArrayList<>(); }
    public void add(String item) { items.add(item); }
    public void remove(String item) { items.remove(item); }
    public void showAllItems() {
      for(String item : items)
        System.out.println(item);
    }
  }

  class Fan {
    private double speed;
    public Fan() { speed = 0; }
    public double getSpeed() { return speed; }
    public void setSpeed(double speed) { this.speed = speed; }
    public void increaseSpeed(double increaseAmount) { speed += increaseAmount; }
    public void decreaseSpeed(double decreaseAmount) { speed -= decreaseAmount; }
  }
}
/* --------- Explanation -------------
Here, class Drawer and Fan are two irrelevant classes.
There's no connection between these two classes.
That's why they are called mutually independent class.
 */
