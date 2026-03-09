package pers.kieran.study.controller;

import cn.hutool.core.date.DateUtil;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.kieran.study.service.FunctionAssistant;

/**
 * @Description: TODO
 */
@RestController
@Slf4j
public class ChatFunctionCallingController
{
    @Resource
    private FunctionAssistant functionAssistant;

    //  http://localhost:9011/chatfunction/test1
    @GetMapping(value = "/chatfunction/test1")
    public String test1()
    {
        String chat = functionAssistant.chat("开张发票,公司：一二三四有限公司 税号：yiersansi533 金额：668.12");

        System.out.println(chat);

        return "success : "+ DateUtil.now() + "\t"+chat;
    }
}
