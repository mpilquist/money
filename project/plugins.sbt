// Comment to get more information during initialization
logLevel := Level.Warn
scalaVersion := "2.12.15"

// The Typesafe repository
resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.9.3")

addSbtPlugin("com.lightbend.sbt" % "sbt-aspectj" % "0.11.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.3.2")

addSbtPlugin("com.cavorite" % "sbt-avro-1-8" % "1.1.9")

addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.5.0")

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.3")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.10.0-RC1")

addSbtPlugin("com.geirsson" % "sbt-ci-release" % "1.5.3")
