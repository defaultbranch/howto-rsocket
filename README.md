_** WORK In PROGRESS **_

# Test the Server

Build and run server:

```
mvn clean package
java -Dspring.profiles.active=server -jar target/howto-rsocket-0.0.1-SNAPSHOT.jar
```

Run [`rsocket-cli`](https://github.com/rsocket/rsocket-cli):

```
rsocket-cli --request tcp://localhost:7000 --route my-square --input 25
```

# Test Server and Client

Start the client from the command line:

```
java -Dspring.profiles.active=client -jar target/howto-rsocket-0.0.1-SNAPSHOT.jar
```

Submit a request:

```
shell:> square 16
256.0
```
