package com.examples.scala

object Arrays {
  def main(args: Array[String]){
    println("Inside main")
    
    var myList: Array[Double] = Array(1.9, 2.9, 3.9, 4.9)
    
    //printing array elements
    for(x <- myList){
      println (x)
    }
    
    //finding the total
    var total: Double = 0.0
    for(i <- 0 to (myList.length - 1)){
      total += myList(i)
    }
    
    println("Total is : "+total)
    
    //finding the max number in the list
    var max = myList(0)
    for(j <- 1 to (myList.length-1)){
      if (myList(j) > max) max = myList(j)
    }
    println("Maximum is : "+ max)
    
  }

}