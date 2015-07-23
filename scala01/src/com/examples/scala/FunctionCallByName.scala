package com.examples.scala

object FunctionCallByName {
	def main(args: Array[String]) : Unit = {
	  println ("Restarting");
	  delayed(time())
	}
	
	def time() : Long = {
	  println("Getting time in nano seconds")
	  System.nanoTime()	  
	}
	// call-by-name parameter by putting the => symbol between the variable name and the type.
	def delayed(t: => Long) : Unit= {
	  println("In delayed method")
	  println("Param : " +t)
	} 
	
	def sum(x: Int, y: Int) : Int = {
	  x
	}
}