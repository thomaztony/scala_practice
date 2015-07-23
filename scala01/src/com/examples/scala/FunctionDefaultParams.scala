package com.examples.scala

object FunctionDefaultParams {
	def main(args: Array[String]) : Unit = {
	  println("Sum is : " +addInt())
	}
	
	def addInt(a: Int=5, b: Int=5) : Int = {
	  var sum: Int = 0
	  sum = a + b
	  
	  return sum
	}
}