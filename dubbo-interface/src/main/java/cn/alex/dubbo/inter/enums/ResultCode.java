package cn.alex.dubbo.inter.enums;

import lombok.Getter;
import lombok.ToString;

/**
 * Created by WCY on 2026/3/13
 */
@Getter
@ToString
public enum ResultCode {

    /**
     * SUCCESS 成功, ERROR 失败
     */
    SUCCESS(0, "成功"), ERROR(1, "失败");

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 结果编码
     */
    private final Integer code;

    /**
     * 提示消息
     */
    private final String message;

}
