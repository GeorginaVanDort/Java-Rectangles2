import java.util.List;
import java.util.ArrayList;

public class Rectangle {
  private int mLength;
  private int mWidth;
  private static List<Rectangle> fred = new ArrayList<Rectangle>();


  public Rectangle(int length, int width) {
    mLength = length;
    mWidth = width;
    fred.add(this);
  }

  public static List<Rectangle> all() {
  return fred;
}

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
