import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "sockjs-chat"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      "com.github.fdimuccio" %% "play2-sockjs" % "0.1"
    )

    val main = play.Project(appName, appVersion, appDependencies).settings(
      resolvers += Resolver.sonatypeRepo("snapshots")
    )

}
