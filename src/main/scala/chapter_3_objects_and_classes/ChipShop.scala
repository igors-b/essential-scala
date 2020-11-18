package chapter_3_objects_and_classes

object ChipShop {
  def willServe(cat: Cat): Boolean = if (cat.food == "Chips") true else false
}
