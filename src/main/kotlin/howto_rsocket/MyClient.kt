package howto_rsocket

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Profile
import org.springframework.messaging.rsocket.RSocketRequester
import org.springframework.messaging.rsocket.retrieveMono
import org.springframework.shell.standard.ShellComponent
import org.springframework.shell.standard.ShellMethod

@Profile("client")
@ShellComponent  // consider putting this into a separate class (like a controller)
class MyClient {

    @Autowired
    private lateinit var builder: RSocketRequester.Builder

    @ShellMethod("compute the square of a number")
    fun square(x: Double): String = builder
        .tcp("localhost", 7000)
        .route("my-square")
        .data(x)
        .retrieveMono<Double>()
        .block()
        .toString()

}
