package ch.makery.address
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.Includes._
import scalafxml.core.{NoDependencyResolver, FXMLView, FXMLLoader}
import javafx.{scene => jfxs}
import scalafx.scene.image.Image

object MainApp extends JFXApp {
  val rootResource = getClass.getResource("view/RootLayout.fxml")
  val loader = new FXMLLoader(rootResource, NoDependencyResolver)
  loader.load();
  val roots = loader.getRoot[jfxs.layout.BorderPane]
  stage = new PrimaryStage {
    icons += new Image(getClass.getResourceAsStream("/icon/calculator.png"))
    title = "Simple Calculator"
    scene = new Scene {
      root = roots
    }
  }
  def showMain() = {
    val resource = getClass.getResource("view/Main.fxml")
    val loader = new FXMLLoader(resource, NoDependencyResolver)
    loader.load();
    val roots = loader.getRoot[jfxs.layout.AnchorPane]
    this.roots.setCenter(roots)
  } 
  def showFrontpage() = {
    val resource = getClass.getResource("view/Frontpage.fxml")
    val loader = new FXMLLoader(resource, NoDependencyResolver)
    loader.load();
    val roots = loader.getRoot[jfxs.layout.AnchorPane]
    loader.getController[ch.makery.address.view.Startpage#Controller]
    this.roots.setCenter(roots)
  }
  def showTemplate() = {
    val resource = getClass.getResource("view/Template.fxml")
    val loader = new FXMLLoader(resource, NoDependencyResolver)
    loader.load();
    val roots = loader.getRoot[jfxs.layout.AnchorPane]
    loader.getController[ch.makery.address.view.Buttons#Controller]
    this.roots.setCenter(roots)
  }
  showFrontpage()
}
