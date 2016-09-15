import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

//Make sure you have VelocityTemplateEngine file!//
public class App {

  public static void main(String[] args) {//static effects the class as a WHOLE. Not an instance of it//

    staticFileLocation("/public"); //declare a static file location//

    String layout = "templates/layout.vtl";//Decalre a String called "layout" that euqals the layout file//
//Creat appropriate resources and templates DIR//

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();//Creates a new HashMap//
      model.put("template", "templates/index.vtl");//Saves the index as the VALUE of "template" KEY//
      return new ModelAndView(model, layout);//populates the layout using the model//
    }, new VelocityTemplateEngine()); 
    //Creates a Root route that loads template.vtl//


    get("/rectangle", (request, response) -> {

      Map<String, Object> model = new HashMap<String, Object>();

      int length = Integer.parseInt(request.queryParams("length"));
      int width = Integer.parseInt(request.queryParams("width"));
      //save the information provided by the user into int length and int width variables//


      Rectangle myRectangle = new Rectangle(length, width);//instantiate a Rectangle object with the length and width variables//

      model.put("myRectangle", myRectangle);//pass it to our model as a value under the key "myRectangle"//


      if (myRectangle.isSquare()) {

       Cube myCube = new Cube(myRectangle);

       model.put("myCube", myCube); // add our new Cube to model//
     }


      model.put("template", "templates/rectangle.vtl");

      return new ModelAndView(model, layout);

    }, new VelocityTemplateEngine());

  }
}
