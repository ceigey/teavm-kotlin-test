package io.github.ceigey

class TodoItem(val parent: ArrayList<TodoItem>) {
  var done = false
  // fun getDone(): Boolean = done
  // fun setDone(value: Boolean) {
  //   done = value
  // }

  var name = ""
  // fun getName(): String = name
  // fun setName(value: String) {
  //   name = value
  // }

  public fun complete() {
    done = !done
  }

  public fun delete() {
    parent.remove(this)
  }
}
