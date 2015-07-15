package com.examples.scala

object UniformList {
  def main(args: Array[String]) : Unit = {
    val fruit: List[String] = List.fill(3)("apples")
    println(fruit)
    
    val num: List[Int] = List.fill(23)(2)
    println(num)
  }

}