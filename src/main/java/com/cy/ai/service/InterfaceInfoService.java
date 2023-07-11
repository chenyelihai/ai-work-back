package com.cy.ai.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cy.ai.model.entity.InterfaceInfo;

/**
* @author 86147
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-07-06 17:17:20
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean b);
}
