resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)

addSbtPlugin("com.typesafe.play" %% "sbt-plugin" % "2.3.10")

addSbtPlugin("com.typesafe.sbt" % "sbt-aspectj" % "0.10.4")
