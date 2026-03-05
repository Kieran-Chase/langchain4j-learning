package pers.kieran.study.service;

import dev.langchain4j.service.spring.AiService;

/**
 * 知识出处，https://docs.langchain4j.dev/tutorials/spring-boot-integration/#spring-boot-starter-for-declarative-ai-services
 */
@AiService
public interface ChatAssistant
{
    String chat(String prompt);
}
