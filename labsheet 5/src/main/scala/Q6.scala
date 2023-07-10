object Q6 {
  def main(args: Array[String]): Unit = {
    fibonacci(10);
  }

  def fibonacci(x: Int): Unit = {
    if (x == 1) {
      println("0");
    }
    else {
      getSeries(x, 1, 0);
    }
  }

  def getSeries(n: Int, current: Int, previous: Int): Unit = {
    if (n != 0) {
      if (n == 1) {
        println(previous);
      }
      else {
        print(previous + " ,");
      }
      getSeries(n - 1, current + previous, current);
    }
  }
}
