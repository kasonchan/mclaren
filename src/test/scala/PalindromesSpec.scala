import org.scalatest.{FlatSpec, Matchers}
import Palindromes.{isPalindrome, subStrings, allSubStrings, findPalindromes, printPalindromes}

/**
  * Created by kasonchan on 1/10/16.
  */
class PalindromesSpec extends FlatSpec with Matchers {

  "isPalindrome" should "pass" in {
    isPalindrome("") shouldBe false
    isPalindrome("a") shouldBe false
    isPalindrome("ab") shouldBe false
    isPalindrome("aba") shouldBe true
    isPalindrome("abab") shouldBe false
    isPalindrome("ababa") shouldBe true
    isPalindrome("aaaaa") shouldBe true
  }

  "substring" should "pass" in {
    subStrings("", 0) shouldBe None
    subStrings("", 1) shouldBe None
    subStrings("abcde", 1) shouldBe Some(Vector(("a", 0), ("b", 1), ("c", 2), ("d", 3), ("e", 4)))
    subStrings("abcde", 2) shouldBe Some(Vector(("ab", 0), ("bc", 1), ("cd", 2), ("de", 3)))
    subStrings("abcde", 3) shouldBe Some(Vector(("abc", 0), ("bcd", 1), ("cde", 2)))
    subStrings("abcde", 4) shouldBe Some(Vector(("abcd", 0), ("bcde", 1)))
    subStrings("abcde", 5) shouldBe Some(Vector(("abcde", 0)))
    subStrings("abcde", 6) shouldBe None
  }

  val sample = Vector(("hijkllkjih", 23), ("defggfed", 13), ("abccba", 5))

  "findPalindromes" should "pass" in {
    findPalindromes("sqrrqabccbatudefggfedvwhijkllkjihxymnnmzpop", 3) shouldBe sample
  }

  "printPalindromes" should "pass" in {
    printPalindromes(sample) shouldBe ()
  }

}
