[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/spockframework/spock/blob/master/LICENSE)
[![Build Status](https://img.shields.io/travis/spockframework/spock-example/master.svg?label=Build)](https://travis-ci.org/spockframework/spock-example)
[![Gitter](https://badges.gitter.im/spockframework/spock.svg)](https://gitter.im/spockframework/spock?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)

Descendants And Palindromes Project
===================================

This project is my response to a coding test that I did for MediaTek.  I started by
 forking the spockframework/spock-example project as a template for this project, deleted
  the example code .  The code is written in Groovy.  The testing framework is Spock.

This project's code is located in the src/main/groovy directory.

This project's tests are located in the src/test/groovy directory.

Ralph A. Navarro Jr.
Email: ralph@navarrocomputing.com 


Parent Project: Spock Framework Example Project
===============================================

The purpose of this project is to help you get started with Spock. The project includes several example specifications and build scripts for Ant, Gradle, and Maven. It also makes it easy to create an Eclipse or IDEA project, allowing you to run the example specs from within your IDE.

All three builds (Ant, Gradle, Maven) will automatically download all required dependencies, compile the project, and finally run the example specs. The Gradle build goes one step further by bootstrapping itself, alleviating the need to have a build tool preinstalled.

Prerequisites
-------------
- JDK 7 or higher
- Maven use `mvnw` wrapper
- Gradle use `gradlew` wrapper
- Ant 1.7 or higher (for Ant build)

Building with Ant
-----------------
Type:

    ant clean test

Downloaded files will be stored in the local Maven repository (typically *user_home*`/.m2/repository`).

Building with Gradle
--------------------
Type:

    ./gradlew clean test

Downloaded files (including the Gradle distribution itself) will be stored in the Gradle user home directory (typically *user_home*`/.gradle`).

Building with Maven
-------------------
Type:

    ./mvnw clean test

Downloaded files will be stored in the local Maven repository (typically *user_home*`/.m2/repository`).

Creating an Eclipse project
---------------------------
Type:

    ./gradlew cleanEclipse eclipse

Make sure you have a recent version of the Groovy Eclipse plugin installed. After importing the generated project into a workspace, go to Preferences->Java->Build Path->Classpath Variables and add a variable named `GRADLE_CACHE` with value *user_home*`/.gradle/cache`. (If you have an environment variable `GRADLE_USER_HOME` set, the correct value is *GRADLE_USER_HOME*`/cache`.) You should now be able to build the project, and to run the specs like you would run a JUnit test. See http://wiki.spockframework.org/GettingStarted#Eclipse for more information on how to get started with Spock and Eclipse.

Creating an IDEA project
---------------------------
Just open the project directory with Intelli IDEA and it should auto-detect the project settings. 

Alternativly Type:

    ./gradlew cleanIdea idea

Open the generated project in IDEA. You should now be able to build the project, and to run the specs like you would run a JUnit test.

NOTE: you might also want to install https://github.com/mycila/gmavenplus-intellij-plugin so that `src/test/groovy` is correctly recognized as a test classes root.

Getting hold of the Jars used in this project
---------------------------------------------
Type:

    ./gradlew collectJars

The Jars will be copied to `build/output/lib`. The comments in `build.gradle` explain what they are needed for.

Further Resources
-----------------

* [Spock homepage](http://spockframework.org)
* [Spock web console](https://meetspock.appspot.com)
* [Main documentation](http://docs.spockframework.org/)
* [User discussion group](http://forum.spockframework.org)
* [Dev discussion group](http://dev.forum.spockframework.org)
* [Issue tracker](http://issues.spockframework.org)
* [Build server](http://builds.spockframework.org)
* [Spock blog](http://blog.spockframework.org)
* [Spock on Twitter](https://twitter.com/spockframework)
* [Ant homepage](http://ant.apache.org)
* [Gradle homepage](http://www.gradle.org)
* [Groovy homepage](http://groovy-lang.org/)
* [Maven homepage](http://maven.apache.org)

If you have any comments or questions, please direct them to the Spock discussion group. All feedback is appreciated!

Happy spec'ing!
Peter Niederwieser
Creator, Spock Framework

