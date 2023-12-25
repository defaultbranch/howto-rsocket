
_** WORK In PROGRESS **_ 

# Usage

Build:
```
mvn package
```

Run the server from the command line:
```
java -cp target/howto-rsocket-0.0.1-SNAPSHOT.jar \
     -Dloader.main=howto_rsocket.MyServerKt \
     -Dspring.profiles.active=server \
     org.springframework.boot.loader.launch.PropertiesLauncher
```

Run the client from the command line:
```
java -cp target/howto-rsocket-0.0.1-SNAPSHOT.jar \
     -Dloader.main=howto_rsocket.MyClientKt \
     -Dspring.profiles.active=client \
     org.springframework.boot.loader.launch.PropertiesLauncher
```
