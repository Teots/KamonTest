import sbt._

object Libraries {
  final val kamonVersion = "0.5.2"

  val kamon =  "io.kamon" %% "kamon-core" % kamonVersion
  val kamonScala =  "io.kamon" %% "kamon-scala" % kamonVersion
  val kamonAkka =  "io.kamon" %% "kamon-akka" % kamonVersion
  val kamonPlay = "io.kamon" %% "kamon-play-23" % kamonVersion
  val kamonConsole =  "io.kamon" %% "kamon-log-reporter" % kamonVersion
  val kamonStatsD =  "io.kamon" %% "kamon-statsd" % kamonVersion

  val kamonDependencies = Seq(
    kamon % "compile",
    kamonScala % "compile",
    kamonConsole % "compile"
  )
}
