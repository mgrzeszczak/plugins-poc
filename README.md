# plugins-poc

Proof of concept project showing how to implement plugin based system using spring.

## How to build and run

Have to use gradle shadow plugin because spring packages jars in a weird way,
making classes unavailable for classpath. 

```
./gradlew clean shadowJar
java -cp core/build/libs/core-all.jar:plugins/test-api-plugin/build/libs/test-api-plugin-all.jar com.github.mgrzeszczak.plugins.CoreApplicationKt
```

## How to build docker image with selected plugins (test-api-plugin)

```
cd docker
./build-docker.sh test-api-plugin
```

Add other plugins as arguments to include them too.