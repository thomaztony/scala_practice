package com.examples.scala

object ConcatinateList {
	def main(args: Array[String]): Unit = {
	  println("Inside main")
	  val a: List[String] = "apple" :: ("banana" :: ("mango" :: Nil))
	  val b: List[String] = "pears" :: ("grape" :: Nil)
	  
	  //using two or more list with ::: operator
	  val c: List[String] = a ::: b
	  println("a:::b - "+c)
	  
	  //using two list with Set.:::() method
	  val d: List[String] = a.:::(b)
	  println("a.:::(b) - "+d)
	  
	  //pass two or more list as arguments
	  val e: List[String] = List.concat(a,b)
	  println("List.concat - " +e)
	}

}	