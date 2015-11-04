package com.examples.pis

import scala.io.Source

object LineWidth {  
  def main(args: Array[String]){
    
     if (args.length > 0){      
      //Reading lines from a file. args(0) is treated as the file name.
      val lines = Source.fromFile(args(0)).getLines.toList
      
      val longestLine = lines.reduceLeft(
          (a,b) => if (a.length > b.length) a else b
      )
      
      val maxWidth = widthOfLine(longestLine)
      
      for (line <- lines){
        val numSpaces = maxWidth - widthOfLine(line)
        val padding = " " * numSpaces;
        println (padding + line.length() + " | " + line)
      }
      
    }
    else
      Console.err.println("Please enter filename")
    
  }
  
  //function to find the width of a line
  def widthOfLine(s: String) = s.length.toString.length
  
}