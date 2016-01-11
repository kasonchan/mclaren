import scala.annotation.tailrec
import scala.collection.immutable.IndexedSeq

/**
  * Created by kasonchan on 1/10/16.
  */
object Palindromes {

  def isPalindrome(s: String): Boolean = s.length > 1 && s == s.reverse

  def subStrings(s: String, desireLength: Int): Option[IndexedSeq[(String, Int)]] = {
    if (s.length == 0) None
    else if (desireLength > s.length) None
    else {
      val subs = for {
        x <- 0 to (s.length - desireLength)
      } yield (s.substring(x, x + desireLength), x)
      Some(subs)
    }
  }

  def allSubStrings(s: String): IndexedSeq[(String, Int)] = {
    val result = for {
      length <- s.length until 0 by -1
    } yield subStrings(s, length)

    result.flatten.flatten
  }

  def allPalindromes(s: String): IndexedSeq[(String, Int)] = {
    allSubStrings(s).filter(x => isPalindrome(x._1))
  }

  def findPalindromes(s: String, number: Int): IndexedSeq[(String, Int)] = {
    val palindromes: IndexedSeq[(String, Int)] = allPalindromes(s)

    @tailrec
    def inner(xs: Seq[(String, Int)], accumulator: IndexedSeq[(String, Int)], count: Int): IndexedSeq[(String, Int)] = {
      (xs, count <= number) match {
        case (Seq(h, t@_*), true) =>
          if (accumulator.exists(x => x._1.contains(h._1))) {
            inner(t, accumulator, number)
          }
          else {
            inner(t, accumulator ++ Vector(h), count + 1)
          }
        case (Seq(), false) =>
          accumulator
        case _ =>
          accumulator
      }
    }

    inner(palindromes, Vector(), 0)
  }

  def printPalindromes(palindromes: IndexedSeq[(String, Int)]): Unit = {
    palindromes.foreach {
      p => printf("Text: %s, Index: %s Length: %s\n", p._1, p._2, p._1.length)
    }
  }

  def palindromes(s: String, number: Int): Unit = {
    val palindromes = findPalindromes(s, number)
    printPalindromes(palindromes)
  }

}
