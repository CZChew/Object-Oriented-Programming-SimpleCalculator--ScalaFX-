package ch.makery.address.view
import scalafx.scene.text.Text
import scalafx.scene.control.TextField
import scalafxml.core.macros.sfxml
import ch.makery.address.MainApp

@sfxml
class Buttons (private val myText: Text,  
  private val myText2: Text,
  private val myText3: Text,
  private val myText4: Text,
  private val textField: TextField,
  private val textField2: TextField,
  private val textField3: TextField,
  private val textField4: TextField,
  private val textField5: TextField,
  private val textField6: TextField,
  private val textField7: TextField,
  private val textField8: TextField) {
    
    def handleClick(): Unit = {
        val num1 = textField.text().toInt
        val num2 = textField2.text().toInt
        myText.text = (num1 + num2).toString
    }
    def handleClick2(): Unit = {
        val num3 = textField3.text().toInt
        val num4 = textField4.text().toInt
        myText2.text = (num3 - num4).toString
    }
    def handleClick3(): Unit = {
        val num5 = textField5.text().toInt
        val num6 = textField6.text().toInt
        myText3.text = (num5 * num6).toString
    }
    def handleClick4(): Unit = {
        val num7 = textField7.text().toInt
        val num8 = textField8.text().toInt
        myText4.text = (num7 / num8).toString
    }
    def handlePopup() {
        MainApp.showTemplate()
    }
    def handleStart() {
        MainApp.showMain()
    }
}