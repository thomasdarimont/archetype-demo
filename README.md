Maven Archtetypes from Github Project
---

This example shows how to serve a custom Maven Archtetype from a Github Project with [jitpack](https://jitpack.io/).

Note that this allows maven to pull archetypes from arbitrary github projects, use at your own risk!

# Setup

To enable maven to fetch archetypes from github, you need to add the [jitpack](https://jitpack.io/) repository to your settings.xml

In your `$HOME/.m2/settings.xml` add the following repository:
```
<repository>
  <id>archetype</id><!-- id expected by maven-archetype-plugin to avoid fetching from everywhere -->
  <url>https://jitpack.io</url>
  <releases>
    <enabled>true</enabled>
    <checksumPolicy>fail</checksumPolicy>
  </releases>
  <snapshots>
    <enabled>true</enabled>
    <checksumPolicy>warn</checksumPolicy>
  </snapshots>
</repository>
```

# Generating a project

To use the archetype to generate a project, you can run the following command.
This command fetches the maven archetype from `github.com/thomasdarimont/archetype-demo` with the tag `1.0.0`.

```
mvn archetype:generate \
  --batch-mode \
  -DarchetypeGroupId=com.github.thomasdarimont \
  -DarchetypeArtifactId=archetype-demo \
  -DarchetypeVersion=1.0.1 \
  -DgroupId=com.demo.group \
  -DartifactId=demo \
  -Dversion=1.0.0-SNAPSHOT
```

Then change into the `demo` directory
```
cd demo
```

Run the maven build with
```
mvn verify
```
