package controllers

import daos.NumberDao
import play.api.mvc.{Action, Controller}
import scaldi.{Injectable, Injector}


class Application(implicit inj: Injector) extends Controller with Injectable {

  def index = Action {
    val dao = inject[NumberDao]
    val outString = "Numbers are " + dao.generateNumbers().mkString(" ")
    Ok(outString)
  }

}
