package cn.alex.dubbo.inter.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by WCY on 2022/10/21
 */
@Getter
@Setter
public class Goddess implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer age;

}
