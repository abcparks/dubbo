package cn.alex.dubbo.inter.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by WCY on 2022/10/24
 */
@Getter
@Setter
@ToString
public class ResultBean<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer code;

    private String message;

    private T data;

    public ResultBean() {
    }

    public ResultBean(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
