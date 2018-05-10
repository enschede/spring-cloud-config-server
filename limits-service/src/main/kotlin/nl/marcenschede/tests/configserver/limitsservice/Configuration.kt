package nl.marcenschede.tests.configserver.limitsservice

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
// Deze naam bepaalt de prefix van de properties
@ConfigurationProperties("limit-service")
data class Configuration(var minimum: Int = 0, var maximum: Int = 0)
