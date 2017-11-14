package daggerok.domain

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
data class Message(@Id @GeneratedValue(strategy = GenerationType.AUTO) var id: UUID? = null,
                   var sender: String? = null,
                   var receiver: String? = null,
                   var subject: String? = null,
                   var body: String? = null) : Serializable {

  companion object {

    const val serialVersionUID = 1L

    fun of(body: String) = Message(
        sender = "anonymous",
        receiver = "all",
        subject = if (body.length < 20) body else body.take(20),
        body = body
    )
  }
}
