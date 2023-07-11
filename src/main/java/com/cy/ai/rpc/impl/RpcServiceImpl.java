package com.cy.ai.rpc.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cy.ai.common.ErrorCode;
import com.cy.ai.exception.BusinessException;
import com.cy.ai.mapper.InterfaceInfoMapper;
import com.cy.ai.mapper.UserMapper;
import com.cy.ai.model.entity.InterfaceInfo;
import com.cy.ai.model.entity.User;
import com.cy.ai.rpc.RpcService;
import com.cy.ai.service.UserInterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author 86147
 * create  10/7/2023 上午11:25
 */
@DubboService
public class RpcServiceImpl implements RpcService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;


    @Resource
    private InterfaceInfoMapper interfaceInfoMapper;




    @Override
    public void test(String data) {
        System.out.println(data);
    }

    @Override
    public User getInvokeUser(String accessKey) {
        if (StringUtils.isAnyBlank(accessKey)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("accessKey", accessKey);
        return userMapper.selectOne(queryWrapper);
    }

    @Override
    public InterfaceInfo getInterfaceInfo(String url, String method) {
        if (StringUtils.isAnyBlank(url, method)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<InterfaceInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("url", url);
        queryWrapper.eq("method", method);
        return interfaceInfoMapper.selectOne(queryWrapper);
    }

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
    }




}
