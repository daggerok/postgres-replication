package daggerok.confog

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "db")
data class DBProps(var name: String? = null,
                   var user: String? = null,
                   var pass: String? = null,
                   var host: String? = null,
                   var port: Integer? = null)
