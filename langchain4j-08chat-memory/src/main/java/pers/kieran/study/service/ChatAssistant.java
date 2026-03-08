package pers.kieran.study.service;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.UserMessage;

/**
 * @Description: TODO
 */
public interface ChatAssistant
{
    /**
    * @Description: 普通聊天对话，不带记忆缓存功能
    */
    String chat(String prompt);
}
