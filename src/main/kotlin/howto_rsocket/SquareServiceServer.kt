package howto_rsocket

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.stereotype.Controller
import reactor.core.publisher.Mono

@Controller
class SquareServiceServer(
    private val squareService: SquareService
) {

    @MessageMapping("my-square")
    fun square(x: Double): Mono<Double> {
        LOG.info("computing the square of $x")
        return Mono.just(this.squareService.square(x))
    }

    companion object {
        val LOG: Logger = LoggerFactory.getLogger(SquareServiceServer::class.java)
    }

}
