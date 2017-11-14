package daggerok

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinPostgresServiceApplication

fun main(args: Array<String>) {
  SpringApplication.run(KotlinPostgresServiceApplication::class.java, *args)
}
