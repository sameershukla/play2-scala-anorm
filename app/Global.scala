

import play.api.mvc.{Results, SimpleResult, RequestHeader}
import play.api.{Application, GlobalSettings}
import anorm._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object Global extends GlobalSettings{
  
  override def onHandlerNotFound(request: RequestHeader) = {
    Future(Results.NotFound(views.html.notFound()))
  }
  
}