package(default_visibility = ["//visibility:public"])

java_binary(
    name = "router",
    main_class = "com.example.ProjectRunner",
    srcs = ["src/main/java/com/example/ProjectRunner.java"],
    deps = [":greeter"]
)

java_library(
    name = "greeter",
    srcs = ["src/main/java/com/example/Greeting.java"],
)

#load("@io_bazel_rules_docker//container:image.bzl", "container_image")
#
#container_image(
#    name = "app",
#    base = "@java_base//image",
##    files = ["//:router_deploy.jar"],
#    cmd = ["java", "-jar", "router_deploy.jar"],
#)
