import scala.math.floor

object Challenge01 {
  def main(args: Array[String]): Unit = {
    if(args.size == 0){
      println("???")
    }else{
      val argsToNumbers = args.map(a => a.toDouble).toList
      val onlyNaturalNumbers = argsToNumbers.filter(a => a > 0 && floor(a) == a).map(a => a.toInt)
      println(sum(onlyNaturalNumbers))
    }
  }

  def sum(list: List[Int]): Int= list match{
    case List() => 0
    case x :: xs  => x + sum(xs) // x is the head of the list that is the first element and xs is the tail i.e. remaining elements
  }


  //  def main(args: Array[String]): Unit = {
  //    if(args.size == 0){
  //      println("???")
  //    }else{
  //      val argsToInt = args.map(a => a.toInt)
  //      val sum = argsToInt.reduce((a,b) => a + b)
  //      println(sum)
  //    }
  //  }

}
