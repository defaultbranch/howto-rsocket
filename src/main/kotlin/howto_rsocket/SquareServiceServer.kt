package howto_rsocket

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.stereotype.Controller
import reactor.core.publisher.Mono

@Controller
class SquareServiceServer(
    private val squareService: SquareService
) {

    @MessageMapping("currentMarketData")
    fun square(x: Double): Mono<Double> {
        return Mono.just(this.squareService.square(x))
    }


}
