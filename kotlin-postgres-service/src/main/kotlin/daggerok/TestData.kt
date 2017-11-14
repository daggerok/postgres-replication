package daggerok

import daggerok.domain.Message
import daggerok.domain.MessageRepository
import org.slf4j.LoggerFactory
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.transaction.annotation.Transactional

@Configuration
class TestData(val messageRepository: MessageRepository) {

  companion object {
    val log = LoggerFactory.getLogger(TestData.javaClass.simpleName)
  }

  @Bean
  @Transactional
  fun runner() = ApplicationRunner {

    messageRepository.deleteAll()

    arrayOf("one", "two", "three", "IV", "5")
        .map { Message.of(it) }
        .map { messageRepository.save(it) }
        .forEach { log.info("saved message: {}", it) }
  }
}
