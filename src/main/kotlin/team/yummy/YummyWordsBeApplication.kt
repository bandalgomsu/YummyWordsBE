package team.yummy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class YummyWordsBeApplication

fun main(args: Array<String>) {
    runApplication<YummyWordsBeApplication>(*args)
}
