package howto_rsocket

interface SquareService {

    data class RealNumber(val value: Double)

    fun square(x: RealNumber): RealNumber
}
