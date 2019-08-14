/**
  * Created by psc on 3/11/17.
  * from https://www.scala-js.org/tutorial/basic/
  */

package tutorial.webapp

import utest._

import org.querki.jquery._

object TutorialTest extends TestSuite {

  // initialise app ui
  TutorialApp.setupUI()

  def tests = Tests {
    'HelloWorld - {
      assert($("p:contains('hello, world')").length == 1)
    }

    'ButtonClick - {
      def messageCount = $("p:contains('you clicked the button!')").length

      val button = $("button:contains('click me!')")
      assert(button.length == 1)
      assert(messageCount == 0)

      for (c <- 1 to 5) {
        button.click()
        assert(messageCount == c)
      }
    } // ButtonClick
  } // tests
} // TutorialTest