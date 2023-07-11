package com.cy.ai;

import javax.annotation.Resource;

import com.cy.ai.manager.AiManager;
import com.rabbitmq.client.Channel;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.handler.annotation.Header;

import static com.cy.ai.constant.CommonConstant.BI_MODEL_ID;
import static com.cy.ai.constant.CommonConstant.CHAT_ID;

/**
 * 主类测试
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@SpringBootTest
class MainApplicationTests {

    @Resource
    private AiManager aiManager;

    @Resource
    private RabbitTemplate rabbitTemplate;



    @Test
    void contextLoads() {
        String s = aiManager.doChat(CHAT_ID, "能不能回答我");
        System.out.println(s);
    }

    @Test
    void sendMessage() {
        rabbitTemplate.convertAndSend("chart.direct","","ceshi");
    }

    void receiveMessage() {

    }

}
