object Q1 {

      def main(args : Array[String]): Unit = {

            println("Enter the amount : ");
            var amount = scala.io.StdIn.readInt()

            val output = calculateInterest(amount);
            println("Interest = "+output);
      }

      def calculateInterest(deposit: Int): Double = {

            if (deposit < 20000) {
                  return deposit * 0.02;
            }
            else if (deposit < 200000) {
                  return deposit * 0.04;
            }
            else if (deposit < 2000000) {
                  return deposit * 0.035;
            }
            else {
                  return deposit * 0.065;
            }
      }
}
