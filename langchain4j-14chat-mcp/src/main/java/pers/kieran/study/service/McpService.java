package pers.kieran.study.service;

import reactor.core.publisher.Flux;

/**
 * @Description: TODO
 */
public interface McpService
{
    Flux<String> chat(String question);
}
