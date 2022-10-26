package cn.alex.dubbo.inter.service;

import cn.alex.dubbo.inter.common.ResultBean;
import cn.alex.dubbo.inter.entity.Book;
import cn.alex.dubbo.inter.entity.Goddess;

import java.util.List;
import java.util.Map;

/**
 * Created by WCY on 2022/10/21
 */
public interface IGoddessService {

    ResultBean getGoddess(String resource, Map<String, Object> params);

}
