package io.github.ceigey.components

import org.teavm.flavour.templates.BindTemplate
import org.teavm.flavour.templates.BindElement
import org.teavm.flavour.templates.Slot
import org.teavm.flavour.widgets.AbstractWidget

import io.github.ceigey.TodoItem

@BindTemplate("templates/todo-list.html")
@BindElement(name = ["todo-list"])
class TodoListComponent : AbstractWidget {
  constructor(slot: Slot) : super(slot)
  val todoItems = ArrayList<TodoItem>()

  fun newItem() {
    todoItems.add(TodoItem(todoItems))
  }
}