name := "devchallengeit-12-tasks"

version := "1.0"

scalaVersion := "2.12.6"

resolvers ++= Seq(
  "Artima Maven Repository" at "http://repo.artima.com/releases"
)

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.12" % "test",
  "org.hamcrest" % "hamcrest-all" % "1.3" % "test",
  "org.mockito" % "mockito-all" % "1.9.5" % "test",

  "com.novocode" % "junit-interface" % "0.9" % "test->default",

  "org.scalatest" %% "scalatest" % "3.0.5" % "test" withJavadoc(),
  "org.specs2" %% "specs2-core" % "4.1.0" % "test" withJavadoc(),
  "org.specs2" %% "specs2-mock" % "4.1.0" % "test" withJavadoc()
)

scalacOptions in Test ++= Seq("-Yrangepos")