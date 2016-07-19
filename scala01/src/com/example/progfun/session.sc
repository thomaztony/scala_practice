package com.example.progfun

object session {

  1 + 2                                           //> res0: Int#1078(3) = 3
  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x#112098: Double#1594)Double#1594

  def sqrt(x: Double) = {

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }                                               //> sqrt: (x#112100: Double#1594)Double#1594
  sqrt(2)                                         //> res1: Double#1594 = 1.4142156862745097
  sqrt(3)                                         //> res2: Double#1594 = 1.7321428571428572
  sqrt(1e-6)                                      //> res3: Double#1594 = 0.0010000001533016628

  def loop: Int = loop                            //> loop: => Int#1078

  def argTest(): Int = {
    val y: Int = 1
    return y
  }                                               //> argTest: ()Int#1078
  

	def loop1: Boolean = loop1                //> loop1: => Boolean#2500
	def z = loop1                             //> z: => Boolean#2500
	
	def and(x: Boolean, y: =>Boolean): Boolean = if(x) y else false
                                                  //> and: (x#112115: Boolean#2500, y#112116: => Boolean#2500)Boolean#2500
	
}