package com.cy.ai.utils;


import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import static com.cy.ai.constant.CommonConstant.SALT;


/**
 * Digester.
 *
 * @date 2023-06-05
 */
public class Digester {
    public static String DigestPassword(String password) {
        if (StringUtils.isBlank(password)) {
            throw new RuntimeException("加密值不能为空");
        }
        return DigestUtils.md5DigestAsHex((SALT + password).getBytes());
    }
}