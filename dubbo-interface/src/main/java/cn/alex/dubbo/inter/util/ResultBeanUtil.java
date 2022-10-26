package cn.alex.dubbo.inter.util;

import cn.alex.dubbo.inter.common.ResultBean;

/**
 * Created by WCY on 2022/10/24
 */
public class ResultBeanUtil {

    public static ResultBean<Object> success(Object data) {
        return success(null, data);
    }

    public static ResultBean<Object> success(String message, Object data) {
        return getResult(1, message, data);
    }

    public static ResultBean<Object> error(Object data) {
        return error(null, data);
    }

    public static ResultBean<Object> error(String message, Object data) {
        return getResult(0, message, data);
    }

    public static ResultBean<Object> getResult(int code, String message, Object data) {
        return new ResultBean<>(code, message, data);
    }

}
