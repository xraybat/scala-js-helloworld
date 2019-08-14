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
import org.querki.jquery._
//import org.scalajs.jquery.jQuery

object TutorialApp {
  /*def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }*/

  def setupUI(): Unit = {
    $("body").append("<p>hello, world</p>")
    
    //$("#click-me-button").click(() => addClickedMessage()) // was...
    // ...now, cleaner, and for testing purposes
    $("""<button type="button">click me!</button>""")        
      .click(() => addClickedMessage())
      .appendTo($("body"))
  }

  //@JSExportTopLevel("addClickedMessage")
  def addClickedMessage(): Unit = {
    //appendPar(document.body, "you clicked the button!")   // either...
    println("about to say 'you clicked the button!'")
    $("body").append("<p>you clicked the button!</p>") // ...or
  }

  def main(args: Array[String]): Unit = {
    //println("hello, world!")
    //appendPar(document.body, "hello, world!") // either...

    // initialise app ui
    $(() => setupUI())                     // ...or

  } // main
} // TutorialApp