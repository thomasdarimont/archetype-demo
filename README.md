# archetype-demo
Custom Maven Archtetype Example

# Generating a project

```
mvn archetype:generate \
  --batch-mode \
  -DarchetypeGroupId=com.github.thomasdarimont.archetype-demo \
  -DarchetypeArtifactId=demo-archetype \
  -DarchetypeVersion=1.0.0-SNAPSHOT \
  -DgroupId=com.demo.group \
  -DartifactId=demo \
  -Dversion=1.0.0-SNAPSHOT \
  -DarchetypeRepository=https://jitpack.io
```

Then change into the `demo` directory
```
cd demo
```

Run the maven build with
```
mvn verify
```
