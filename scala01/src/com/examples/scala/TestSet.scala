package com.examples.scala

object TestSet {
	def main(args: Array[String]): Unit = {
	  val words1: Set[String] = Set("abc","def","ghi")
	  val nums: Set[Int] = Set(1,2,3,4,4,5,6)
	  
	  println("Head of words - " + words1.head)
	  println("Check if empty - "+ nums.isEmpty)
	  
	  //concatenating sets
	  val words2: Set[String]= Set("jkl", "mno")
	  
	  val word: Set[String] = words1 ++ words2
	  println("Concatenated word "+word)
	  
	  //alternate way to concatenate
	  println("Alternate concatenation method - "+ words1 .++(words2))
	  
	  //max min element in Set
	  println("Maximum of nums - "+ nums.max)
	  println("Minimum of nums - " + nums.min)
	  
	  val num1: Set[Int] = Set(1,2,3,4)
	  val num2: Set[Int] = Set(4,5,6,7)
	  
	  //find common elements between the two sets
	  
	  println("num1 .&  (num2) : " + num1 .& (num2))
	  println("num1 .intersect (num2) : "+num1.intersect(num2))
	  
	}
}