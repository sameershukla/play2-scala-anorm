package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

 

  def token(id: Long) = Action {
    Ok(s"This is a token based route: $id")
  }

  def regex(id: Long) = Action {
     Ok(s"This is a regex based route: $id")
  }
  
  def clob(path: String) = Action {
     Ok(s"This is a clobbed route: $path")
  }
}