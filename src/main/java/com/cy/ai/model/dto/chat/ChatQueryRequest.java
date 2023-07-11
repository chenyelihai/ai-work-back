package com.cy.ai.model.dto.chat;

import com.cy.ai.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class ChatQueryRequest extends PageRequest implements Serializable {

    private String question;

    private Integer userId;

    private static final long serialVersionUID = 1L;
}
