object Q5 {
      def main(args: Array[String]): Unit = {
        checkEven(9);
      }

      def checkEven(x: Int): Unit = {
        if(x==0){
          println("Even");
        }
        else if(x==1){
          println("Odd");
        }
        else{
          checkEven(x-2);
        }
      }



}
