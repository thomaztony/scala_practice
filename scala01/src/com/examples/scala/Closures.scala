package com.examples.scala

object Closures {
  def main(args: Array[String]) : Unit = {
    println ("Start")
    println("multiplier(1) value is : " +multiplier(1))
    println("multiplier(2) value is : " +multiplier(2))
        
  }
  
  val factor = 3
  val multiplier = (i: Int) => i * factor 
}