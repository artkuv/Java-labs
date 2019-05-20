package main.scala

import scala.annotation.tailrec
import scala.collection.mutable
import scala.Console

object Obj{
  def main(args: Array[String]): Unit = {
    println("Enter 1st num: ")
    val x = scala.io.StdIn.readInt()
    println("Enter 2nd num: ")
    val y = scala.io.StdIn.readInt()
    println(func(x,y))
  }

  val func = (x: Int, y: Int) => (x + y)/2
}