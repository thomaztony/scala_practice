package com.example.progfun

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(56); val res$0 = 

  1 + 2;System.out.println("""res0: Int#1078(3) = """ + $show(res$0));$skip(44); 
  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x#112098: Double#1594)Double#1594""");$skip(315); 

  def sqrt(x: Double) = {

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  };System.out.println("""sqrt: (x#112100: Double#1594)Double#1594""");$skip(10); val res$1 = 
  sqrt(2);System.out.println("""res1: Double#1594 = """ + $show(res$1));$skip(10); val res$2 = 
  sqrt(3);System.out.println("""res2: Double#1594 = """ + $show(res$2));$skip(13); val res$3 = 
  sqrt(1e-6);System.out.println("""res3: Double#1594 = """ + $show(res$3));$skip(25); 

  def loop: Int = loop;System.out.println("""loop: => Int#1078""");$skip(62); 

  def argTest(): Int = {
    val y: Int = 1
    return y
  };System.out.println("""argTest: ()Int#1078""");$skip(32); 
  

	def loop1: Boolean = loop1;System.out.println("""loop1: => Boolean#2500""");$skip(15); 
	def z = loop1;System.out.println("""z: => Boolean#2500""");$skip(67); 
	
	def and(x: Boolean, y: =>Boolean): Boolean = if(x) y else false;System.out.println("""and: (x#112115: Boolean#2500, y#112116: => Boolean#2500)Boolean#2500""")}
	
}
