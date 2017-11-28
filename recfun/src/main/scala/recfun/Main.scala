package recfun

import scala.collection.mutable.ListBuffer

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = r match {
      case n : Int => {
        var all = ListBuffer[ListBuffer[Int]]()
        var last = ListBuffer[Int]()
        last += 1
        all += last
        for (i <- 1 to r) {
          var current = ListBuffer[Int]()
          current += last(0)
          for (j <- 1 until i){
//            if(r == i && c == j){
//              ( last(j - 1) + last(j) )
//            }
            current += ( last(j - 1) + last(j) )
          }
          current += last(0)
//          print(current)
          all += current
          last = current
        }
        all(r)(c)
      }
    }

  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = ???
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
