package com.example.week2

object excercise {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(193); 
  def factorial(n: Int): Int = {
    def loop(acc: Int, n: Int): Int =
      if(n == 0) acc
      else loop (acc * n, n-1)
      
    loop(1,n)
  };System.out.println("""factorial: (n#170061: Int#1078)Int#1078""");$skip(18); val res$0 = 
  
  factorial(5);System.out.println("""res0: Int#1078 = """ + $show(res$0));$skip(16); val res$1 = 
  factorial(10);System.out.println("""res1: Int#1078 = """ + $show(res$1));$skip(28); 
  
  println (pascal (1,1));$skip(138); 
  
  def pascal(row: Int, col: Int): Int = {
    if ((row == col) || (col == 0)) 1
  	else pascal(row-1, col-1) + pascal(row -1, col)
  };System.out.println("""pascal: (row#170313: Int#1078, col#170314: Int#1078)Int#1078""");$skip(69); 
  
  def main(args: Array[String]){
   val x = 10
   println (x)
  };System.out.println("""main: (args#170325: Array#880[String#17334])Unit#2605""")}
  
  
  
  
  
  
  
}
