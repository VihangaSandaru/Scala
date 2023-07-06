object Q2 {

  def main(args: Array[String]) {
    GetType(8);

  }

  def GetType(x: Int): Unit = x match {

    case x if x <= 0 => println("Input less than or equal to zero");

    case x if x % 2 == 0 => println("Input is even");

    case _ => println("Input is odd");

  }
}
