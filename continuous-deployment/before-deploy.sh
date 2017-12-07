#!/usr/bin/env bash
#if [ "$TRAVIS_BRANCH" = 'master' ] && [ "$TRAVIS_PULL_REQUEST" == 'false' ]; then
    openssl aes-256-cbc -K $encrypted_de443ae3116b_key -iv $encrypted_de443ae3116b_iv -in continuous-deployment/travis@cucumber.io.asc.enc -out continuous-deployment/travis@cucumber.io.asc -d
    gpg2 --fast-import continuous-deployment/travis@cucumber.io.asc
#fi