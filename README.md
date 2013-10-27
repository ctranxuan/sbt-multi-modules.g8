# g8 sbt Multi-Modules Project


This a [g8](http://github.com/n8han/giter8) template that creates a sbt multi-modules project.
It actually proposes to create a project with 2 modules (module1 and module2 by default). The name of the 2 modules
must be quite simple (letters and numbers).

The structure of the project is inspired by the one of [Spray](https://github.com/spray/spray).


## Usage

Install giter8 (g8) - [readme](http://github.com/n8han/giter8#readme) for more information.

Install SBT - [Setup](http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html) for more information.

In a shell, run the following:

    g8 ctranxuan/sbt-multi-modules
    cd <name-of-app>
    sbt

## What's inside

A sbt multi-module project configured with 2 repositories (a Twitter one and a Sonatype one).
All the sbt configuration is under the **project** directory of your main project folder.

By default, the project is configured with an Apache 2 License that can be easily changed or removed by modifying the file
_BuildSettings.scala_.

The [sbt-idea](https://github.com/mpeltonen/sbt-idea) is also added by default as a sbt plugin.

## Thanks

Thanks to [Nathan Hamblen](https://github.com/n8han) for [giter8](https://github.com/n8han/giter8)!