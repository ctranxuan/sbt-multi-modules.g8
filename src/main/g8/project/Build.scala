import sbt._
import Keys._

object $name;format="Camel"$Build extends Build {
  import BuildSettings._
  import Dependencies._

  val resolutionRepos = Seq(
    "Twitter Maven Repo" at "http://maven.twttr.com/",
    "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
  )

  lazy val parent = Project(id = "$name;format="normalize"$",
    base = file("."))
    .aggregate ($module1;format="camel"$, $module2;format="camel"$)
    .settings(basicSettings: _*)

  lazy val $module1;format="camel"$ = Project(id = "$module1;format="normalize"$", base = file("$module1;format="normalize"$"))
    .settings($module1;format="camel"$Settings: _*)
    .settings(libraryDependencies ++=
    compile(twitterUtil) ++
      test(scalaTest))

  lazy val $module2;format="camel"$ = Project(id = "$module2;format="normalize"$", base = file("$module2;format="normalize"$"))
    .settings($module2;format="camel"$Settings: _*)
    .settings(libraryDependencies ++=
      test(scalaTest))
}
