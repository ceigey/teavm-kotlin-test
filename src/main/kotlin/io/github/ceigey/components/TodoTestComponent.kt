package io.github.ceigey.components

import org.teavm.flavour.templates.BindTemplate
import org.teavm.flavour.templates.BindElement
import org.teavm.flavour.templates.Slot
import org.teavm.flavour.widgets.AbstractWidget


@BindTemplate("templates/todo-test.html")
@BindElement(name = ["todo-test"])
class TodoTestComponent : AbstractWidget {
  constructor(slot: Slot) : super(slot)
}