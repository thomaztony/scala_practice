package com.examples.scala
import Array._

object ArraysMultiDim {
  def main(args: Array[String]){
    println("Inside main")
    //Scala does not directly support multi-dimensional arrays
    var myMatrix = ofDim[Int](3,3)
    
    //build a matrix
    for (i <- 0 to 2){
      for (j <- 0 to 2){
        myMatrix(i)(j)=j
      }
    }
    
    for (i <- 0 to 2){
      for (j <- 0 to 2){
        print(" "+ myMatrix(i)(j))
      }
      println()
    }
      
  }

}