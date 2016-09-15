public class Cube {
  private Rectangle mFace;
//Initialize the Cube with a Rectangle object that represents one face of the three-dimensional Cube.


  public Cube(Rectangle rectangle) {
    mFace = rectangle;
  }  //Set the object equal to the Cube's mFace property.


  public Rectangle getFace() {
    return mFace;
  }//Define a getter method called getFace() that returns the Rectangle object associated with our Cube.//

  public int volume() {//A Cube can call Rectangle public methods//
    int length = mFace.getLength();//call the Rectangle class' getLength() method on mFace//
    return length * length * length;
  }
 
  public int surfaceArea() { //we create an area method for Rectangle within the Rectangle class itself//
    return mFace.area() * 6;
  }

}
