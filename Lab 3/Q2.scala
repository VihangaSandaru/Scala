object Q2 {
  def main(args: Array[String]): Unit = {

    def filter(list: List[String]): List[String] = {
      list.filter(_.length > 5);
    }
    println("Enter the elements of the list separated by space : ");
    val input = scala.io.StdIn.readLine();

    val list = input.split(" ").toList;
    val finalList = filter(list);
    println(finalList);
  }
}
