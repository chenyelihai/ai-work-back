package com.cy.ai.model.dto.user;

/**
 * @author 86147
 * create  6/7/2023 下午2:15
 */

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 */
@Data
public class GenApiKeysRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * accessKey
     */
    private String accessKey;

    /**
     * sercetKey
     */
    private String secretKey;
}