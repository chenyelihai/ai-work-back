package com.cy.ai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cy.ai.model.entity.Chart;
import com.cy.ai.service.ChartService;
import com.cy.ai.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author 86147
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2023-06-25 15:35:21
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




