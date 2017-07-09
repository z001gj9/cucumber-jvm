package cucumber.runtime.scala.test

import cucumber.api.scala.{EN, ScalaDsl}
import junit.framework.Assert._

class StepsAreNotReusedBetweenExamplesSteps extends ScalaDsl with EN  {

  private var cukeCount = 0
  private var amFull = false

  Given("""^I have '(\d+)' cukes in the jar$""") {
    cukesInJar: Int => cukeCount = cukesInJar
  }

  When("""^I eat '(\d+)' cukes$""") {
    cukesEaten: Int => {
      cukeCount -= cukesEaten
      if (cukesEaten >= 2) amFull = true
    }
  }

  Then("""^There are '(\d+)' cukes in the jar$""") {
    cukesLeft: Int => assertEquals(cukesLeft, cukeCount)
  }

  Then("""^I am full$""") {
    () => assertEquals(true, amFull)
  }

  Then("""^I am not full$""") {
    () => assertEquals(false, amFull)
  }
}
