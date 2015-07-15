package com.examples.scala
import Array._

object ArraysWithRange {
	def main(args: Array[String]){
	  
	  //The final argument of the range method is the step. Default step is 1
	  var myList1 = range(10,20,2)
	  var myList2 = range(10,20)
	  
	  for (x <- myList1)
	    print (" " +x)
	    
	    println
	  for (y <- myList2)
	    print(" " +y)
	}
}