object Q3 {
    def main(args: Array[String]): Unit = {

      def salary(i:Int , j:Int): Double = {
        var x = (i * 250) + (j * 85);
        var y = x * (88.0 / 100);
        return y;
      }
      println(salary(40,30));

    }
}
