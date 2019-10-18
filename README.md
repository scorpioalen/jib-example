# jib-example

https://github.com/GoogleContainerTools/distroless/tree/master/java

# 1 Run
./gradlew jibDockerBuild

$ jib-example            0.0.1               5678c785e0e7        49 years ago        221MB

# 2 Run 
Added creation time and new dependency

./gradlew jibDockerBuild

Result: 
- faster docker build time (Jib separates application into multiple layers, splitting dependencies from classes)
- Deploy layers that changed (Docker cache)
- Reproducible
- Jib's build strategy separates the Java application into multiple layers for more granular incremental builds
    
$ jib-example            0.0.1               538ecd46a5b8        56 seconds ago      223MB

$ docker run -d --name jib-example -p 8080:8080 jib-example:0.0.1

# 3 Run
Deploy on docker registry

#### Generate local docker images
$ ./gradlew jibDockerBuild
#### Deploy docker image on public repository
$ ./gradlew jib

