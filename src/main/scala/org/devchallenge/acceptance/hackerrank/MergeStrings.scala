package org.devchallenge.acceptance.hackerrank

/**
  * Test 1
  * @author Created by Vitalij Radchenko on 01.05.18.
  */
object MergeStrings extends App {

  def mergeStrings(a: String, b: String): String = {

    import scala.language.implicitConversions
    implicit def flattenTuple[T](t:(T, T)): List[T] = t match {case (a,b)=>List(a,b)}

    val one = a.toCharArray.toList
    val second = b.toCharArray.toList
    val pairs = one.zip(second)

    val reminder = if (a.length > b.length) one.drop(second.size)
                   else second.drop(one.size)

    pairs.flatten.mkString + reminder.mkString
  }


  println(mergeStrings("ab", "zsd"))
  println(mergeStrings("abc", "def"))
  println(mergeStrings("abcd", "de"))
  println(mergeStrings("zbxnsjdns", "idowdk"))
  println(mergeStrings("", "zbxnsjdns"))
  println(mergeStrings("abb", "zsdd"))
  println(mergeStrings("", ""))


  /*
  Results:
    azbsd
    adbecf
    adbecd
    zibdxonwsdjkdns
    zbxnsjdns
    azbsbdd
  */

}