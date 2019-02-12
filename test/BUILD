package(default_visibility = ["//visibility:public"])

java_test(
    name = "test",
    srcs = glob(["src/java/com/example/*.java"]),
    test_class = "com.example.GreetingUnitTest",
    deps = [
        "//lib:greeter",
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
