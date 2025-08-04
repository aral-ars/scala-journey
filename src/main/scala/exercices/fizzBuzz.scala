package exercices

@main def runFizzBuzz(): Unit =
  println("mutable style")
  FizzBuzz.mutable()
  println("\nfunctional style")
  FizzBuzz.functional()

object FizzBuzz {
  def mutable(): Unit =
    for (i <- 1 until 100) {
      if (i % 5 == 0) println("FizzBuzz")
      else if (i % 3 == 0) println("Fizz")
      else if (i % 5 == 0) println("Buzz")
      else println(i)
    }

  def functional(): Unit =
    (1 to 100).map {
      case i if i % 3 == 0 => "FizzBuzz"
      case i if i % 5 == 0 => "Buzz"
      case i if i % 3 == 0 => "Fizz"
      case i => i.toString
    }.foreach(println)
}
