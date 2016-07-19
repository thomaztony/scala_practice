package com.example.week2

object excercise {
  def factorial(n: Int): Int = {
    def loop(acc: Int, n: Int): Int =
      if(n == 0) acc
      else loop (acc * n, n-1)
      
    loop(1,n)
  }                                               //> factorial: (n#170061: Int#1078)Int#1078
  
  factorial(5)                                    //> res0: Int#1078 = 120
  factorial(10)                                   //> res1: Int#1078 = 3628800
  
  println (pascal (1,1))                          //> 1
  
  def pascal(row: Int, col: Int): Int = {
    if ((row == col) || (col == 0)) 1
  	else pascal(row-1, col-1) + pascal(row -1, col)
  }                                               //> pascal: (row#170313: Int#1078, col#170314: Int#1078)Int#1078
  
  def main(args: Array[String]){
   val x = 10
   println (x)
  }                                               //> main: (args#170325: Array#880[String#17334])Unit#2605
  
  
  
  
  
  
  
}