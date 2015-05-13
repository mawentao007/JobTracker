package controllers

/**
 * Created by marvin on 15-5-13.
 */

import play.api.mvc.{Action, Controller}

object Application extends Controller {
  def index = Action {
    Redirect(routes.Products.list())
  }

}
