package com.examples.scala

object FunctionHigherOrder {
	def main(args: Array[String]){
	   println( apply( layout, 10) )
	}
	//These are functions that take other functions as parameters, or whose result is a function
	//apply() function takes function f and a value v and applies function f to v
	def apply(f: Int=> String, v: Int) = 
	  {
		f(v)
	  }
	
	
	def layout[A](x: A) = "[" + x.toString() + "]"
}