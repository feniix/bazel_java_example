package(default_visibility = ["//visibility:public"])

java_binary(
    name = "runner",
    main_class = "com.example.ProjectRunner",
    srcs = ["src/main/java/com/example/ProjectRunner.java"],
    deps = [
        ":greeter"
    ],
)

java_library(
    name = "greeter",
    srcs = ["src/main/java/com/example/Greeting.java"],
)

java_test(
    name = "tests",
    srcs = glob(["src/test/java/com/example/*.java"]),
    test_class = "com.example.GreetingUnitTest",
    deps = [
        ":greeter",
        "@junit_junit//jar",
        "@org_apiguardian_apiguardian_api//jar",
        "@org_hamcrest_hamcrest_core//jar",
        "@org_junit_jupiter_junit_jupiter_api//jar",
        "@org_junit_jupiter_junit_jupiter_engine//jar",
        "@org_junit_platform_junit_platform_commons//jar",
        "@org_junit_platform_junit_platform_engine//jar",
        "@org_junit_platform_junit_platform_launcher//jar",
        "@org_junit_platform_junit_platform_runner//jar",
        "@org_junit_platform_junit_platform_suite_api//jar",
        "@org_opentest4j_opentest4j//jar",
    ],
)

load("@io_bazel_rules_docker//container:image.bzl", "container_image")
container_image(
    name = "docker",
    base = "@java_base//image",
    files = [":runner_deploy.jar"],
    cmd = ["runner_deploy.jar"],
)
