package com.examples.scala
object Timer {
  //In this example the timer function is called oncePerSecond and it gets a call-back
  //function as argument. The type of this function is written as () => Unit. it means that it 
  //takes no arguments or return anything.
  def oncePerSecond(callback: () => Unit){
    while(true){ callback(); Thread sleep 1000}
  }
  def timeFlies(){
    println("time flies like an arrow")
  }
  
  def main(args: Array[String]){
    oncePerSecond(timeFlies)
  }
}