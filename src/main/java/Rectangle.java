import java.util.List;
import java.util.ArrayList;

public class Rectangle {
  private int mLength;
  private int mWidth;
  private static List<Rectangle> fred = new ArrayList<Rectangle>();
//Creates an ArrayList of Rectangle Objects called "fred" :D Static will access the whole class//

  public Rectangle(int length, int width) {//Constructor//
    mLength = length;
    mWidth = width;
    fred.add(this); //Adds each instance of a Rectangle to fred//
  }

  public static List<Rectangle> all() {
  return fred; //Returns fred, the list of all rectangles//
  }//the method is static it must be called on the class itself and not a particular instance//

  public int getLength() {
    return mLength;
  }

  public int getWidth() {
    return mWidth;
  }

  public boolean isSquare() {
    return mLength == mWidth;
  }

  public int area() {
    return mLength * mWidth;
  }

}
