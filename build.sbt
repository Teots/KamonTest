import com.typesafe.sbt.SbtAspectj.{AspectjKeys, _}
import play.PlayScala
import sbt.Keys._
import sbt._

lazy val rest = project.in(file("."))
  .enablePlugins(PlayScala)
  .settings(aspectjSettings: _*)
  .settings(
    name := "kamon-test",
    scalaVersion := "2.11.7",
    libraryDependencies ++= Libraries.kamonDependencies,
    javaOptions in run <++= AspectjKeys.weaverOptions in Aspectj,
    fork in run := true
  )
