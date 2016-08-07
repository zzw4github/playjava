name := """my-java-project"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava) .enablePlugins(PlayJava, PlayEbean)
resolvers += Resolver.url("Edulify Repository", url("https://edulify.github.io/modules/releases/"))(Resolver.ivyStylePatterns)
scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "mysql" % "mysql-connector-java" % "5.1.36",
  "com.edulify" %% "play-hikaricp" % "2.1.0",
  "com.zaxxer" % "HikariCP" % "2.4.7",
  "org.avaje" % "ebean" % "2.8.1"
)


fork in run := true