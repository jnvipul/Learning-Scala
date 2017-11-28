object sample{
  def sqrtIter(guess : Double, x : Double) : Double =
    if (isGood(guess, x))
      guess
    else
      sqrtIter(improve(guess, x), x)

  def isGood(guess: Double, x: Double) =
    if (Math.abs(guess * guess - x) < 0.001)
      true
    else
      false

  def improve(guess: Double, x: Double): Double =
    (x / guess + guess)/2

  def sqrt(x : Double): Double = sqrtIter(1.0, x)

  sqrt(4)
  sqrt(81)
}