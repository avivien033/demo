package com.jiawa.wiki.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * test
 * @author 
 */
@Data
public class Test implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    private static final long serialVersionUID = 1L;
}