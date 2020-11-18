package chapter_3_objects_and_classes

class Director(val firstName: String, val secondName: String, val yearOfBirth: Int) {
  def name(): String = firstName +  " " + secondName
}
