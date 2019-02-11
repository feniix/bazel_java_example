# BAZEL BUILD

## prereqs

```shell
brew tap bazelbuild/tap
brew tap-pin bazelbuild/tap
brew install bazel
```

## build project

```shell
bazel build //:runner
```

## package jar for runtime

```shell
bazel build //:runner_deploy.jar
```
