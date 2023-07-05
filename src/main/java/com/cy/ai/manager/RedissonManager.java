package com.cy.ai.manager;



import javax.annotation.Resource;

import static com.cy.ai.common.ErrorCode.MANY_REQUESTS_ERROR;

/**
 * @author 86147
 * create  28/6/2023 上午9:47
 */

public class RedissonManager {

//    @Resource
//    private RedissonClient redissonClient;
//
//    public void rateLimit(String key){
//        RRateLimiter rateLimiter = redissonClient.getRateLimiter(key);
//        rateLimiter.trySetRate(RateType.OVERALL,2,1, RateIntervalUnit.SECONDS);
//        boolean res = rateLimiter.tryAcquire(1);
//        if (!res) {
//            throw new BusinessException(MANY_REQUESTS_ERROR);
//        }
//    }


}
