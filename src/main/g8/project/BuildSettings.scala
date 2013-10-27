import sbt._
import Keys._

object BuildSettings {

  lazy val basicSettings = seq(
    version               := "$version$",
    organization          := "$organization$",
    startYear             := Some($start_year$),
    licenses              := Seq("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt")),
    scalaVersion          := "$scala_version$",
    resolvers             ++= Dependencies.resolutionRepos
  )

  lazy val $module1;format="camel"$Settings = basicSettings
  lazy val $module2;format="camel"$Settings = basicSettings
}
