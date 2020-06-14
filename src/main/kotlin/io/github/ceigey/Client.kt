package io.github.ceigey

import org.teavm.flavour.templates.BindTemplate
import org.teavm.flavour.widgets.ApplicationTemplate

@BindTemplate("templates/client.html")
class Client : ApplicationTemplate() {
  var userName = ""
  
  val politeUserName: String
    get() = "Mister " + userName

  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val client = Client()
      client.bind("application-content")
    }
  }


}