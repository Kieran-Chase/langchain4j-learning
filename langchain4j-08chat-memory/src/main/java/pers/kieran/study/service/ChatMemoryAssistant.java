package pers.kieran.study.service;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.UserMessage;

/**
 * @Description: TODO
 */
public interface ChatMemoryAssistant
{

    /**
     * 聊天带记忆缓存功能
     *
     * @param userId  用户 ID
     * @param prompt 消息
     * @return {@link String }
     */
    String chatWithChatMemory(@MemoryId Long userId, @UserMessage String prompt);
}
