object Q1 {
      def main(args: Array[String]): Unit ={

        println("Enter the string : ");
        val str=scala.io.StdIn.readLine();

        def reverse(str : String) : String ={
          if(str.isEmpty){
              "";
          }
          else{
            reverse(str.tail) + str.head;
          }
        }

        var strReversed=reverse(str);
        println(strReversed);
      }
}














