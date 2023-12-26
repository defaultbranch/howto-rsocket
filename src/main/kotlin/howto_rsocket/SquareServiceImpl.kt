package howto_rsocket

class SquareServiceImpl : SquareService {
    override fun square(x: Double) = x * x
}
