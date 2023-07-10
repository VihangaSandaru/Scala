object Q4 {
      def main(args: Array[String]): Unit = {
        println(add(5));
      }

  def add(n: Int): Int = {
    if(n <= 0){
      return 0;
    }
    else if (n%2 == 0){
      return n+add(n-2);
    }
    else{
      return add(n-1);
    }
  }

}
