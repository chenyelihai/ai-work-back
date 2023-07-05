package com.cy.ai.model.vo;

import lombok.Data;

/**
 * Bi 的返回结果
 */
@Data
public class ChartResponse {

    private String genChart;

    private String genResult;

    private Long chartId;
}
