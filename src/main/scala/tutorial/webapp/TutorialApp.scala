/**
  * Created by psc on 3/11/17.
  * from https://www.scala-js.org/tutorial/basic/
  * scala.js hello world test from http://www.scala-js.org/tutorial/basic/
  * @TODO see final step _Step 7: Optimizing for Production_
  */

package tutorial.webapp

import org.scalajs.dom
import dom.document
//import scala.scalajs.js.annotation.JSExportTopLevel
import org.scalajs.jquery.jQuery

object TutorialApp {
  /*def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }*/

  def setupUI(): Unit = {
    //jQuery("#click-me-button").click(() => addClickedMessage()) // was...
    // ...now, cleaner, and for testing purposes
    jQuery("""<button type="button">click me!</button>""")        
      .click(addClickedMessage _)
      .appendTo(jQuery("body"))

    jQuery("body").append("<p>hello, world</p>")
  }

  //@JSExportTopLevel("addClickedMessage")
  def addClickedMessage(): Unit = {
    //appendPar(document.body, "you clicked the button!")   // either...
    jQuery("body").append("<p>you clicked the button!</p>") // ...or
  }

  def main(args: Array[String]): Unit = {
    //println("hello, world!")
    //appendPar(document.body, "hello, world!") // either...

    // initialise app ui
    jQuery(() => setupUI())                     // ...or

  } // main
} // TutorialApp