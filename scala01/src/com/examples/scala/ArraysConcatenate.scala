package com.examples.scala
import Array._

object ArraysConcatenate {
	def main(args: Array[String]) : Unit = {
		var myList1: Array[Double] = Array(1.9,2.9,3.9)
		var myList2: Array[Double] = Array(4.9,5.9,6.9)

		var myList3 = concat (myList1, myList2)
		var myList4 = Array.concat(myList1,myList2)
		
		//printing elements in myList3
		for (x <- myList3)
		  println(x)
		  
		  println(" separator ")
		  
		for (y <- myList4)
		  println(y)
	}
}