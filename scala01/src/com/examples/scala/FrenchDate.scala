package com.examples.scala

import java.util.{Date, Locale}
import java.text.DateFormat._

object FrenchDate {
  def main(args: Array[String]){
    val now = new Date
    val df = getDateInstance(LONG, Locale.ITALY)
    //println(df format now)
    
    //val sum = 1+2*3/2
    val sum = (1).+((2).*(3))./(2)
    println(sum)
  }
}