package ru.red.otus2
package domain

import scala.util.Random

class Urn {
  private val random = new Random();
  val contents = List(0, 0, 0, 1, 1, 1)

  def experimentNaive(): Boolean = random.shuffle(contents).take(2) == List(0, 1)

  def experiment(): Boolean = {
    var shuffled = random.shuffle(contents)
    val first = shuffled.head
    shuffled = random.shuffle(shuffled.drop(1))
    val second = shuffled.head
    (first, second) == (0, 1)
  }
}
