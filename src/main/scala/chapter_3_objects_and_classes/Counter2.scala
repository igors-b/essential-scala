package chapter_3_objects_and_classes

class Counter2(val count: Int) {
  def inc: Counter2 = inc()
  def dec: Counter2 = dec()
  def inc(in: Int = 1): Counter2 = new Counter2(count + in)
  def dec(in: Int = 1): Counter2 = new Counter2(count - in)
}
