package com.examples.scala

object MapExamples {
  def main(args: Array[String]): Unit = {
    val colors1: Map[String, String] = Map("red" -> "#FFGH",
                     "green" -> "#FGGJ",
                     "blue" -> "#GHIK")
    val nums: Map[Int, Int] = Map()
    
    println("Keys in colors : "+colors1.keys)
    println("Values in colors : "+ colors1.values)
    
    println("Check if nums is empty : "+ nums.isEmpty)
    
    //use the ++ operator or Map.++() to concatenate two or more Maps. It wil remove duplicates while concatenating maps
    
    val colors2: Map[String, String] = Map("violet" -> "#BNMS", "purple" -> "#VSGH", "red" -> "#TYUI")
    									   
    val colors = colors1 ++ colors2
    println("colors1 ++ colors2 : " + colors)
    
    //printing keys and values from a map
    
    colors.keys.foreach{ i =>
      print("Key = " + i)
      println (" Value = "+colors(i))
    }
    
  }

}