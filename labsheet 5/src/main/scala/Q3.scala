object Q3 {

  var output=0;
  def main(args: Array[String]): Unit = {
    println(sum(5));
  }

  def sum(n : Int): Int = {

    if(n==1){
      return 1;
    }
    else{
      return n+sum(n-1);
    }
  }


}
