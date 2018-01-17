/**
  * Created by psc on 3/11/17.
  * from https://www.scala-js.org/tutorial/basic/
  */

package tutorial.webapp

import org.scalajs.dom
import dom.document
import scala.scalajs.js.annotation.JSExportTopLevel
import org.scalajs.jquery.jQuery

object TutorialApp {
  /*def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }*/

  def setupUI(): Unit = {
    jQuery("body").append("<p>hello, world!</p>")
    jQuery("""<button type="button">click me!</button>""")
      .click(addClickedMessage _)
      .appendTo(jQuery("body"))
    jQuery("#click-me-button").click(() => addClickedMessage())
  }

  @JSExportTopLevel("addClickedMessage")
  def addClickedMessage(): Unit = {
    //appendPar(document.body, "You clicked the button!")
    jQuery("body").append("<p>you clicked the button!</p>")
  }

  def main(args: Array[String]): Unit = {
    //compilprintln("hello, world!")
    //appendPar(document.body, "hello, world!")
    //jQuery("body").append("<p>hello, world!</p>")
    jQuery(() => setupUI())

  } // main
} // TutorialApp