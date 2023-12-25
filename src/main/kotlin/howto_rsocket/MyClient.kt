package howto_rsocket

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Profile
import org.springframework.shell.standard.ShellComponent
import org.springframework.shell.standard.ShellMethod


@SpringBootApplication
@ShellComponent  // consider putting this into a separate class (like a controller)
@Profile("client")
class MyClient {

	@ShellMethod("compute the square of a number")
	fun square(x: Double) {
		LOG.info("the square of $x is ${x*x}")  // this I want to do remote
	}

	companion object {
		val LOG: Logger = LoggerFactory.getLogger(MyClient::class.java)
	}

}

fun main(args: Array<String>) {
	runApplication<MyClient>(*args)
}
