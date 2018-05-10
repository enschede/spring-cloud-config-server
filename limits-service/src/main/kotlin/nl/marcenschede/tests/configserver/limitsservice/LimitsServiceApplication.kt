package nl.marcenschede.tests.configserver.limitsservice

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class LimitsServiceApplication {

    @Autowired
    lateinit var configuration: Configuration

    @GetMapping("/limits")
    fun limits(): Limits {
        return Limits(configuration.minimum, configuration.maximum)
    }
}

fun main(args: Array<String>) {
    runApplication<LimitsServiceApplication>(*args)
}
