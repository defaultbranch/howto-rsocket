package howto_rsocket

import howto_rsocket.SquareService.RealNumber
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.stereotype.Controller
import reactor.core.publisher.Mono

@Controller
class SquareServiceServer(
    private val squareService: SquareService
) {

    @MessageMapping("square")
    fun square(x: RealNumber): Mono<RealNumber> {
        return Mono.just(this.squareService.square(x))
    }


}
