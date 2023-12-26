package howto_rsocket

import howto_rsocket.SquareService.RealNumber

class SquareServiceImpl : SquareService {
    override fun square(x: RealNumber) = RealNumber(x.value * x.value)
}
