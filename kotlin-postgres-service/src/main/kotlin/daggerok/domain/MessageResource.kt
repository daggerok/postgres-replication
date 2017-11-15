package daggerok.domain

import daggerok.confog.DBProps
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageResource(val dbProps: DBProps) {

  @GetMapping("/")
  fun dbProps() = dbProps
}
