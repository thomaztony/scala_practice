package com.examples.scala

object FunctionWithVariableArgs {
  
  def main(args: Array[String]) : Unit = {
	  println("Start")
	  printStrings("Hello", "Scala", "Python")
	  printStrings("1","2","3")
  }
  def printStrings(args: String*) : Unit = {
    var i: Int = 0;
    for(arg <- args){
      println("Arg-String value["+ i + "] = " +arg)
      i=i+1
    }
    
  println("between methods")
    
  def printInts(args: Int*) : Unit = {
    var j: Int = 0;
    for(arg <- args){
      println("Arg-Int value["+ j + " ] ="  +arg)
      j=j+1
    }
  }
  }
}