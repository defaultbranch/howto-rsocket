package howto_rsocket

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Profile
import org.springframework.context.annotation.Scope
import org.springframework.shell.boot.ShellRunnerAutoConfiguration

@Profile("server")
@EnableAutoConfiguration(exclude = [ShellRunnerAutoConfiguration::class])
class MyServer {

    @Bean
    @Scope("singleton")
    fun squareService() = SquareServiceImpl()
}
