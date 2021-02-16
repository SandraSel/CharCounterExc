import scala.io.StdIn.readLine

object CharCounterExercise extends App {
  //TOvDO ask user to enter a sentence
  val userSentence = readLine ("Hello! Please enter a sentence: ")
  //TO DO calculate and save character frequency into a Map
  val map = scala.collection.mutable.HashMap.empty[Char, Int]
  for (symbol <- userSentence) {
    if (map.contains(symbol))
      map(symbol) = map(symbol) + 1
    else
      map.+=((symbol, 1))
  }
  println(s"The sentence '$userSentence' character frequency is: $map")
  //you can use mutable and/or immutable Map
  //print out this map with character frequencies
  //so your Map most likely will be of type [Char,Int]
  //also i think getOrElseUpdate method will be helpful
}
