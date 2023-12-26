package howto_rsocket

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(MyServer::class, MyClient::class)
class Main

fun main(args: Array<String>) {
    runApplication<Main>(*args)
}
