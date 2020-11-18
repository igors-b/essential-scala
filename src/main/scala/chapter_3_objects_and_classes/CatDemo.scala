package chapter_3_objects_and_classes

object CatDemo {
  def main(args: Array[String]): Unit = {
    val oswald = new Cat("Oswald", "Black", "Milk")
    val henderson = new Cat("Henderson", "Ginger", "Chips")
    val quentin = new Cat("Quentin", "Tabby and white", "Curry")
    println(oswald.colour)
    println(henderson.food)
    println(quentin.name)
  }
}
