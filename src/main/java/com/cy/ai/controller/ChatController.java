package com.cy.ai.controller;

import cn.hutool.core.io.FileUtil;
import com.cy.ai.common.BaseResponse;
import com.cy.ai.common.ErrorCode;
import com.cy.ai.common.ResultUtils;
import com.cy.ai.constant.CommonConstant;
import com.cy.ai.exception.BusinessException;
import com.cy.ai.exception.ThrowUtils;
import com.cy.ai.manager.AiManager;
import com.cy.ai.model.dto.chart.GenChart;
import com.cy.ai.model.dto.chat.GenChat;
import com.cy.ai.model.entity.Chart;
import com.cy.ai.model.entity.Chat;
import com.cy.ai.model.entity.User;
import com.cy.ai.model.vo.ChartResponse;
import com.cy.ai.service.ChatService;
import com.cy.ai.service.UserService;
import com.cy.ai.utils.ExcelUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

import static com.cy.ai.constant.CommonConstant.CHAT_ID;

/**
 * @author 86147
 * create  30/6/2023 下午5:36
 */
@RestController
@RequestMapping("/chat")
@Slf4j
public class ChatController {

    @Resource
    private ChatService chatService;

    @Resource
    private AiManager aiManager;

    @Resource
    private UserService userService;


    @PostMapping("/gen")
    public BaseResponse<String> genChatByAi(@RequestBody String question,HttpServletRequest request) {
        String answer = aiManager.doChat(CHAT_ID, question);
        Chat chat = new Chat();
        chat.setQuestion(question);
        chat.setAnswer(answer);
        User loginUser = userService.getLoginUser(request);
        chat.setUserId(Math.toIntExact(loginUser.getId()));
        boolean save = chatService.save(chat);
        if (save) return ResultUtils.success(answer);
        else return ResultUtils.success("意外错误,请重新提问");
    }
}
