package chapter_3_objects_and_classes

class Counter(val count: Int) {
  def inc(): Counter = new Counter(count + 1)
  def dec(): Counter = new Counter(count - 1)
}
