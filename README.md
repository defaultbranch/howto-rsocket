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

# Remaining Questions:

- How to use server side `@ConnectMapping`
- How to handle other payload
    - data classes, JSON documents
    - binary data
    - binary streams (file upload and download)
- How to catch and handle errors and exceptions on the server side? (avoid raw stack traces)
    - bad route (not found: 404)
    - bad data (bad request: 400)
    - exception (internal server error: 500)
- How to return errors to the client (4xx vs 5xx)
    - should this be part of the response data type? 
- How to handle stubborn clients (resilience)
- What is the best replacement for RPC?
    - per request, with new stream ID per request?
    - should client try to keep connection open?
    - should server terminate connection after some time?
- Can I monitor the stream?
    - does wireshark recognize RSocket?
- Routing and load balancing on Kubernetes
    - is `service` sufficient and feasible?
        - does `service` correclty handle TCP connections kept alive?
        - do TCP connections kept alive conflict with load balancing?
    - should a Kubernetes-aware Spring app connect to PODs directly?
        - can this handle 'READY' state of pods
    - note: this has been answered on
      [StackOverflow](https://stackoverflow.com/questions/62798271/rsocket-how-to-balance-the-load),
      there are client side load balancers, or intermediate brokers
