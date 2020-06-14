package io.github.ceigey.components

import io.github.ceigey.TodoItem
import java.util.function.Supplier
import org.teavm.flavour.templates.BindTemplate
import org.teavm.flavour.templates.BindElement
import org.teavm.flavour.templates.BindAttribute
import org.teavm.flavour.templates.Slot
import org.teavm.flavour.widgets.AbstractWidget


@BindTemplate("templates/todo-item.html")
@BindElement(name = ["todo-item"])
class TodoItemComponent : AbstractWidget {
  constructor(slot: Slot) : super(slot)

  private var todoItemSupplier: Supplier<TodoItem>? = null

  fun getTodoItemSupplier(): Supplier<TodoItem>? {
    return todoItemSupplier
  }

  // DO NOT USE KOTLIN SUGAR HERE!
  @BindAttribute(name = "item")
  fun setTodoItemSupplier(value: Supplier<TodoItem>) {
    todoItemSupplier = value
  }

  // var indexSupplier: Supplier<Int>? = null
  //   @BindAttribute(name = "index")
  //   set(value) {
  //     indexSupplier = value
  //   }
  
  // fun getIndex(): Int = indexSupplier?.get() ?: 0

  // fun getOrderNumber(): String = "$#${index + 1}"

  fun getTodoItem(): TodoItem = todoItemSupplier?.get()
    ?: TodoItem(ArrayList())
}
