import scala.io.Source

object day1 extends App {
  val lines = Source.fromFile("/Users/sven/Documents/AdventOfCode2023/inputs/day1.txt").getLines
  var sum = 0;

  for (line <- lines) {
    val onlyDigits = line.filter(_.isDigit)

    val first = onlyDigits.head.asDigit
    val last = onlyDigits.last.asDigit

    sum += (first * 10) + last
  }
  println(sum)
}

object day1p2 extends App {
  val lines = Source.fromFile("/Users/sven/Documents/AdventOfCode2023/inputs/day1.txt").getLines
  var sum = 0

  for (line <- lines) {
    var onlyDigits : String = ""
    for(i <- 0 until line.length) {
      if (line(i).isDigit) onlyDigits = onlyDigits :+ line(i)
      else if (i + 2 < line.length && line(i) == 'o' && line(i + 1) == 'n' && line(i + 2) == 'e') onlyDigits = onlyDigits :+ '1'
      else if (i + 2 < line.length && line(i) == 't' && line(i + 1) == 'w' && line(i + 2) == 'o') onlyDigits = onlyDigits :+ '2'
      else if (i + 4 < line.length && line(i) == 't' && line(i + 1) == 'h' && line(i + 2) == 'r' && line(i + 3) == 'e' && line(i + 4) == 'e') onlyDigits = onlyDigits :+ '3'
      else if (i + 3 < line.length && line(i) == 'f' && line(i + 1) == 'o' && line(i + 2) == 'u' && line(i + 3) == 'r') onlyDigits = onlyDigits :+ '4'
      else if (i + 3 < line.length && line(i) == 'f' && line(i + 1) == 'i' && line(i + 2) == 'v' && line(i + 3) == 'e') onlyDigits = onlyDigits :+ '5'
      else if (i + 2 < line.length && line(i) == 's' && line(i + 1) == 'i' && line(i + 2) == 'x') onlyDigits = onlyDigits :+ '6'
      else if (i + 4 < line.length && line(i) == 's' && line(i + 1) == 'e' && line(i + 2) == 'v' && line(i + 3) == 'e' && line(i + 4) == 'n') onlyDigits = onlyDigits :+ '7'
      else if (i + 4 < line.length && line(i) == 'e' && line(i + 1) == 'i' && line(i + 2) == 'g' && line(i + 3) == 'h' && line(i + 4) == 't') onlyDigits = onlyDigits :+ '8'
      else if (i + 3 < line.length && line(i) == 'n' && line(i + 1) == 'i' && line(i + 2) == 'n' && line(i + 3) == 'e') onlyDigits = onlyDigits :+ '9'
    }
//    println(onlyDigits)
    val first = onlyDigits.head.asDigit
    val last = onlyDigits.last.asDigit

    sum += (first * 10) + last
  }
  println(sum)
}

