package howto_rsocket

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Profile
import org.springframework.context.annotation.Scope
import org.springframework.shell.boot.ShellRunnerAutoConfiguration



@SpringBootApplication
@Profile("server")
@EnableAutoConfiguration(exclude = [ShellRunnerAutoConfiguration::class])
class MyServer {

	@Bean
	@Scope("singleton")
	fun squareService() = SquareServiceImpl()

	@Bean
	@Scope("singleton")
	fun server() = SquareServiceServer(squareService())
}

fun main(args: Array<String>) {
	runApplication<MyServer>(*args)
}
