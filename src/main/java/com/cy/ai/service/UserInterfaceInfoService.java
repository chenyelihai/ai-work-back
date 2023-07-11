package com.cy.ai.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cy.ai.model.entity.UserInterfaceInfo;

/**
* @author 86147
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-07-07 19:11:58
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    boolean invokeCount(long interfaceInfoId, long userId);
}
