import org.scalatest._

class SingleSumSpec extends WordSpec with MustMatchers {

  "SingleSum" must {

    "return an int" in {
      SingleSum.getCount(List(1,2,3)).isValidInt mustEqual true
    }

    "return a count of non-duplicate ints" in {
      SingleSum.getCount(List(4,5,7,5,4,8)) mustEqual 15
    }

  }

}
