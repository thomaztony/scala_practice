package com.examples.scala

object CollectionList {
  def main (args: Array[String]){
    println("Inside main")
    
    /*Collections - can be lazy or strict. Lazy will not consume memory until accessed eg) Ranges
     *List is immutable and List represents a linked list
     * 
     */
    
    //List of Strings
    val fruit: List[String] = List("apples", "oranges", "grapes")
    println("Fruits : " +fruit)
    
    //List of integers
    val nums: List[Int] = List(1,2,3,4)
    println("Nums : " +nums)
    
    //Empty List
    val empty: List[Nothing] = List()
    println("Empty : "+empty)
    
    //Two dimensional List
    val dim: List[List[Int]] = 
      List(
    		  List(1,2,3),
    		  List(4,5,6)
    		  )
    println("Dim : "+dim)
    
      //Alternate declaration
    val fruits_a: List[String] = "apples" :: ("oranges" :: ("grapes" :: Nil))
    println("Fruits_a : " +fruits_a)
    
    val nums_a: List[Int] = 1 :: (2 :: (3 :: (4 :: Nil)))
    println("Nums_a : " +nums_a)
    
    val empty_a = Nil
    println("Empty_a : "+empty_a)
    
    val dim_a: List[List[Int]] = (1 :: (2 :: (3 :: Nil))) ::
    						   (4 :: (5 :: (6 :: Nil))) :: Nil
    println("Dim_a : " +dim_a)
    
    //Basic operations on List
    println("Head of fruit : " + fruit.head)
    println("Tail of fruit : "+ fruit.tail)
    
    println("Check if fruit is empty : "+ fruit.isEmpty )
    println("Check if nums is empty : "+ nums.isEmpty )
  }
  

}