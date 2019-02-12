load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
http_archive(
    name = "io_bazel_rules_docker",
    sha256 = "aed1c249d4ec8f703edddf35cbe9dfaca0b5f5ea6e4cd9e83e99f3b0d1136c3d",
    strip_prefix = "rules_docker-0.7.0",
    urls = ["https://github.com/bazelbuild/rules_docker/archive/v0.7.0.tar.gz"],
)

load("@io_bazel_rules_docker//repositories:repositories.bzl", "repositories")
repositories()

load("@io_bazel_rules_docker//container:container.bzl", "container_pull")
container_pull(
  name = "java_base",
  registry = "gcr.io",
  repository = "distroless/java",
  tag = "latest",
)

# Kotlin support
rules_kotlin_version = "a632c3a30bb0bd9f5f88fb771489809b9aba602f"

http_archive(
    name = "io_bazel_rules_kotlin",
    urls = ["https://github.com/bazelbuild/rules_kotlin/archive/%s.zip" % rules_kotlin_version],
    type = "zip",
    strip_prefix = "rules_kotlin-%s" % rules_kotlin_version
)

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kotlin_repositories", "kt_register_toolchains")
my_compiler_release = {
    "urls": [
        "https://github.com/JetBrains/kotlin/releases/download/v1.2.71/kotlin-compiler-1.2.71.zip",
    ],
    "sha256": "e48292fdfed42f44230bc01f92ffd17002101d8c5aeedfa3dba3cb29c5b6ea7b",
}
kotlin_repositories(compiler_release = my_compiler_release)
kt_register_toolchains()

#################### generate workspace deps #########################################
maven_jar(
    name = "org_junit_jupiter_junit_jupiter_api",
    artifact = "org.junit.jupiter:junit-jupiter-api:5.4.0",
    repository = "https://repo.maven.apache.org/maven2/",
    sha1 = "1a09f25a160f71c267f9ebe3b229b17805c683e9",
)


maven_jar(
    name = "org_junit_platform_junit_platform_runner",
    artifact = "org.junit.platform:junit-platform-runner:1.4.0",
    repository = "https://repo.maven.apache.org/maven2/",
    sha1 = "a8a0ef915bf648671d9404c1cfe52e4b80b14243",
)


# org.junit.platform:junit-platform-runner:jar:1.4.0
maven_jar(
    name = "org_junit_platform_junit_platform_launcher",
    artifact = "org.junit.platform:junit-platform-launcher:1.4.0",
    repository = "https://repo.maven.apache.org/maven2/",
    sha1 = "5cc8b7b305ffc79aa124a1a4fe5efab114f28cac",
)


# org.junit.platform:junit-platform-launcher:jar:1.4.0 got requested version
# org.junit.platform:junit-platform-engine:jar:1.4.0 got requested version
# org.junit.platform:junit-platform-commons:jar:1.4.0 got requested version
# org.junit.jupiter:junit-jupiter-engine:jar:5.4.0
# org.junit.platform:junit-platform-runner:jar:1.4.0 got requested version
# org.junit.jupiter:junit-jupiter-api:jar:5.4.0 got requested version
# org.junit.platform:junit-platform-suite-api:jar:1.4.0 got requested version
maven_jar(
    name = "org_apiguardian_apiguardian_api",
    artifact = "org.apiguardian:apiguardian-api:1.0.0",
    repository = "https://repo.maven.apache.org/maven2/",
    sha1 = "3ef5276905e36f4d8055fe3cb0bdcc7503ffc85d",
)


# junit:junit:jar:4.12
maven_jar(
    name = "org_hamcrest_hamcrest_core",
    artifact = "org.hamcrest:hamcrest-core:1.3",
    repository = "https://repo.maven.apache.org/maven2/",
    sha1 = "42a25dc3219429f0e5d060061f71acb49bf010a0",
)


# org.junit.jupiter:junit-jupiter-api:jar:5.4.0 got requested version
# org.junit.platform:junit-platform-engine:jar:1.4.0
maven_jar(
    name = "org_opentest4j_opentest4j",
    artifact = "org.opentest4j:opentest4j:1.1.1",
    repository = "https://repo.maven.apache.org/maven2/",
    sha1 = "efd9f971e91074491ea55b19f67b13470cf4fcdd",
)


# org.junit.jupiter:junit-jupiter-api:jar:5.4.0 got requested version
# org.junit.platform:junit-platform-engine:jar:1.4.0
maven_jar(
    name = "org_junit_platform_junit_platform_commons",
    artifact = "org.junit.platform:junit-platform-commons:1.4.0",
    repository = "https://repo.maven.apache.org/maven2/",
    sha1 = "e0b2ed8fac32ad6469d75d034e759f1969db8dda",
)


# org.junit.platform:junit-platform-runner:jar:1.4.0
maven_jar(
    name = "junit_junit",
    artifact = "junit:junit:4.12",
    repository = "https://repo.maven.apache.org/maven2/",
    sha1 = "2973d150c0dc1fefe998f834810d68f278ea58ec",
)


maven_jar(
    name = "org_junit_jupiter_junit_jupiter_engine",
    artifact = "org.junit.jupiter:junit-jupiter-engine:5.4.0",
    repository = "https://repo.maven.apache.org/maven2/",
    sha1 = "30083adf3fbd7b734f12e6cb4d99dedab99fc34b",
)


# org.junit.platform:junit-platform-runner:jar:1.4.0
maven_jar(
    name = "org_junit_platform_junit_platform_suite_api",
    artifact = "org.junit.platform:junit-platform-suite-api:1.4.0",
    repository = "https://repo.maven.apache.org/maven2/",
    sha1 = "8c03ee0615180d219c2dac86b004bd5d32b5649c",
)


# org.junit.platform:junit-platform-launcher:jar:1.4.0 got requested version
# org.junit.jupiter:junit-jupiter-engine:jar:5.4.0
maven_jar(
    name = "org_junit_platform_junit_platform_engine",
    artifact = "org.junit.platform:junit-platform-engine:1.4.0",
    repository = "https://repo.maven.apache.org/maven2/",
    sha1 = "b4419dc190a5d82b9cac6b52e0af9140895c3f87",
)

