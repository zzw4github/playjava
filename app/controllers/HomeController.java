package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public Result work(String name){
        return ok(work.render("hello " + name));
    }
    
     public Result index1(){
        return redirect(controllers.routes.HomeController.doRedirect("zzw"));
    }
    
      public Result doRedirect(String name){
          return ok(work.render("hello " + name));
    }


}
