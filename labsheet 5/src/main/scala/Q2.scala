object Q2 {
  var i : Int=2;
  def main(args: Array[String]) = {
    loop(10);
  }

  def prime(x: Int) = {

    if (x == 0 || x == 1) {
      println("0 and 1 is not prime numbers");
    }
    else if (x == 2) {
      print("2  ");
    }
    else {
      check(x, x - 1);
    }
  }

  def check(x: Int, y: Int): Unit = {
    if (y == 1) {
      print(x+"  ");

    }
    else {
      if (x % y == 0) {
        print("");
      }
      else {
        check(x, y - 1);
      }
    }
  }

  def loop(k: Int): Unit = {
    while(i <= k){
      prime(i);
      i +=1;
    }
  }
}