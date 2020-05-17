#!/bin/bash

WORKSPACE=`pwd`
PROJECT_FOLDER="$(dirname $WORKSPACE)"

cd $PROJECT_FOLDER
#./gradlew clean shadowJar

cd $WORKSPACE

rm app.jar
rm -rf plugins

cp $PROJECT_FOLDER/core/build/libs/core-all.jar app.jar
mkdir plugins

for var in "$@"
do
    cp $PROJECT_FOLDER/plugins/$var/build/libs/*.jar plugins
done

docker build -t plugins:1.0-`date +%s` .