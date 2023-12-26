package howto_rsocket

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(Server::class, Client::class)
class Main

fun main(args: Array<String>) {
    runApplication<Main>(*args)
}
