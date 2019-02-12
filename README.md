# BAZEL BUILD

## prereqs

```shell
brew tap bazelbuild/tap
brew tap-pin bazelbuild/tap
brew install bazel
```

## build project

```shell
bazel build //main:main
```

## package jar for runtime

```shell
bazel build //main:main_deploy.jar
```

## run tests

```shell
bazel test //test:test
```

## build docker image

```shell
bazel build //docker:image
```

## run app in docker image

```shell
bazel run //docker:image
docker run -it --rm bazel/docker:image
```
