package com.cy.ai.mapper;

import com.cy.ai.model.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 86147
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2023-06-25 15:35:21
* @Entity com.yupi.ai.model.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




