import kamon.Kamon
import play.api.{Application, GlobalSettings}

object Global extends GlobalSettings {

  override def onStart(app: Application): Unit = {
    Kamon.start()
    super.onStart(app)
  }

  override def onStop(app: Application): Unit = {
    Kamon.shutdown()
  }
}
