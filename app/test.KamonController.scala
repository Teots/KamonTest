package test

import play.api.mvc._

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

class KamonController extends Controller {
  def getTest() = Action async { implicit request =>
    Future {
      Ok("Test")
    }
  }
}
