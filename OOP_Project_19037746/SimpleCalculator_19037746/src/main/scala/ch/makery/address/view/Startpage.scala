package ch.makery.address.view
import scalafxml.core.macros.sfxml
import ch.makery.address.MainApp
@sfxml
class Startpage(){
    def handleStart() {
        MainApp.showMain()
    }
}