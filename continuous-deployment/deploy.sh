#!/usr/bin/env bash
#if [ "$TRAVIS_BRANCH" = 'master' ] && [ "$TRAVIS_PULL_REQUEST" == 'false' ]; then
    mvn deploy -Psign-source-javadoc --settings continuous-deployment/travis-settings.xml -DskipTests=true
#fi
