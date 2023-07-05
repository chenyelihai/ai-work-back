package com.cy.ai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cy.ai.model.entity.Chat;
import com.cy.ai.service.ChatService;
import com.cy.ai.mapper.ChatMapper;
import org.springframework.stereotype.Service;

/**
* @author 86147
* @description 针对表【chat】的数据库操作Service实现
* @createDate 2023-06-30 17:35:11
*/
@Service
public class ChatServiceImpl extends ServiceImpl<ChatMapper, Chat>
    implements ChatService{

}




