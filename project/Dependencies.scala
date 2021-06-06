import sbt._

object Dependencies {
  
  lazy val scalaPb = "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion
  lazy val minitest = "io.monix" %% "minitest" % "2.5.0" % Test
//  lazy val macroCompat = "org.typelevel" % "macro-compat_2.13.0-RC2" % "1.1.1"

  def scalaCompiler(scalaVersion: String): ModuleID = "org.scala-lang" % "scala-compiler" % scalaVersion % "provided"
}
