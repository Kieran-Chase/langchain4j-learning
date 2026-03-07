package pers.kieran.study.service;

import reactor.core.publisher.Flux;

/**
 * @Description: TODO
 */
public interface ChatAssistant
{
    String chat(String prompt);

    Flux<String> chatFlux(String prompt);
}
