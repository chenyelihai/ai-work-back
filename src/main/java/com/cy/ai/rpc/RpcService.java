package com.cy.ai.rpc;

import com.cy.ai.model.entity.InterfaceInfo;
import com.cy.ai.model.entity.User;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author 86147
 * create  10/7/2023 上午11:24
 */
public interface RpcService {

    public void test(String data);

    public User getInvokeUser(String accessKey);

    public InterfaceInfo getInterfaceInfo(String url, String method);

    public boolean invokeCount(long interfaceInfoId, long userId);
}
