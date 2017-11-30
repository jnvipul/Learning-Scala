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
    val c : List[Char] = List('(', 'e', 's', ')')
    print(balance(c))
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {

      def factorial(n : Int): Int = {
        if(n < 0){
          0
        }else if(n == 0 || n == 1){
          1
        }else{
          n * factorial(n-1)
        }

      }

      factorial(r)/(factorial(r-c) * factorial(c))
    }

  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def balanced(chars : List[Char], open : Int) : Boolean = {
           if(chars.isEmpty) open == 0
           else if(chars.head == ')') {
             if(open <= 0) false
             else balanced(chars.tail, open-1)
           }else if(chars.head == '(') {
             balanced(chars.tail, open + 1)
           } else{
             balanced(chars.tail, open)
           }
      }

      balanced(chars, 0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
