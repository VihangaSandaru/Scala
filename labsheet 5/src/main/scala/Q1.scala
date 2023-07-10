object Q1 {
      def main(args: Array[String])= {
      prime(78);
      }

    def prime(x : Int)={

      if(x == 0 || x == 1){
        println("0 and 1 is not prime numbers");
      }
      else if(x == 2){
        println(x==2);
      }
      else{
        check(x,x-1);
      }
    }

    def check(x : Int,y : Int): Unit = {
      if(y==1){
        println(y==1);
      }
      else{
        if(x%y == 0){
          println(x%y==0);
        }
        else{
          check(x,y-1);
        }
      }
    }
}
