package test.scala

import main.scala.Obj
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class ExampleSpec extends FunSuite{
  test("avarage of 8 and 12 must be 10") {
    val s = Obj.func(8, 12)
    assert(s.equals(10))
  }
}