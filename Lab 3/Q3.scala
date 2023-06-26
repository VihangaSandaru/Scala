object Q3 {

      def main(args: Array[String]): Unit = {

        val num1 = 93;
        val num2 = 75;

        def calculateAverage(num1: Int, num2: Int): Double = {
          val sum = num1 + num2
          val average = sum.toDouble / 2
          BigDecimal(average).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
        }

        val average = calculateAverage(num1, num2)
        println(average)
      }

}
