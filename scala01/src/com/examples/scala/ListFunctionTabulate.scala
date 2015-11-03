package com.examples.scala

object ListFunctionTabulate {
	def main(args: Array[String]): Unit = {
	  val squares = List.tabulate(6)(n => n*n)
	  
	  println("Squares : " + squares)
	  println("------")
	  println("Reverse Squares : " + squares.reverse)
	  
	  val mul = List.tabulate(2,5)(_*_)
	  println("Mul : " + mul)
	}
}