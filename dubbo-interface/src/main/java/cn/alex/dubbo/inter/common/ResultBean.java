package cn.alex.dubbo.inter.common;

import cn.alex.dubbo.inter.enums.ResultCode;
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
public class ResultBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer code;

    private String message;

    private Object data;

    public ResultBean() {
    }

    public ResultBean(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static ResultBean success(Object data) {
        return success(null, data);
    }

    public static ResultBean success(String message, Object data) {
        return new ResultBean(ResultCode.SUCCESS.getCode(), message, data);
    }

    public static ResultBean error(Object data) {
        return error(null, data);
    }

    public static ResultBean error(String message, Object data) {
        return new ResultBean(ResultCode.ERROR.getCode(), message, data);
    }

}
