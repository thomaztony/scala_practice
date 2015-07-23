package com.examples.scala

object FunctionRecursion {
	def main(args: Array[String]) : Unit = {
	  for (i <- 1 to 10)
	    println("Factorial of "+ i +":" +factorial(i))
	}
	
	def factorial(n: BigInt): BigInt = {
	  if (n<=1)
	    1
	  else
	    n * factorial(n-1)
	}
}
