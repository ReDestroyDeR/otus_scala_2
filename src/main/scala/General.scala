package ru.red.otus2

import domain.Urn

object General {
  def main(args: Array[String]): Unit = {
    val c = 100_000
    val succeeded: Double = List.fill(c)(new Urn())
      .map(urn => urn.experiment())
      .count(success => success);
    println(s"Result: ${succeeded / c}")
    println(s"Expected: ${3.0d / 5.0d}")
  }
}
