import scala.collection.mutable
import scala.io.Source

object day2 extends App{
  val file = Source.fromFile("/Users/sven/Documents/AdventOfCode2023/inputs/day2.txt")
  val lines = file.getLines

  var sum = 0

  for (line <- lines) {
    val split = line.split(":")
    val gameid = split(0).filter(_.isDigit).toInt
    val shown = split(1).split(";")
    println(gameid)

    var map = mutable.Map[String, Int]()
    map.addOne("red", 0)
    map.addOne("green", 0)
    map.addOne("blue", 0)

    println(line)

    for (s <- shown) {
      val dice = s.split(",")
      for (d <- dice) {
        val parts = d.strip().split(" ")
        if ((map(parts(1)) < parts(0).toInt)) {
          map(parts(1)) = parts(0).toInt
        }
      }
    }

    println(map)
    if (map("red") <= 12 && map("green") <= 13 && map("blue") <= 14) {
      sum += gameid
    }
    println("-------------")
  }
  println(sum)
  file.close()
}

object day2p2 extends App {
  val file = Source.fromFile("/Users/sven/Documents/AdventOfCode2023/inputs/day2.txt")
  val lines = file.getLines

  var sum = 0

  for (line <- lines) {
    val split = line.split(":")
    val gameid = split(0).filter(_.isDigit).toInt
    val shown = split(1).split(";")
    println(gameid)

    var map = mutable.Map[String, Int]()
    map.addOne("red", 0)
    map.addOne("green", 0)
    map.addOne("blue", 0)

    println(line)

    for (s <- shown) {
      val dice = s.split(",")
      for (d <- dice) {
        val parts = d.strip().split(" ")
        if ((map(parts(1)) < parts(0).toInt)) {
          map(parts(1)) = parts(0).toInt
        }
      }
    }

    println(map)
    val mult = map("red") * map("green") * map("blue")
    println(mult)
    sum += mult
    println("-------------")
  }
  println(sum)

  file.close()
}