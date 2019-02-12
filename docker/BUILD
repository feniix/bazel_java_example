load("@io_bazel_rules_docker//container:image.bzl", "container_image")
container_image(
    name = "image",
    base = "@java_base//image",
    files = ["//main:main_deploy.jar"],
    cmd = ["main_deploy.jar"],
)
