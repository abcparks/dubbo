package cn.alex.dubbo.consumer.service;

import cn.alex.dubbo.inter.common.ResultBean;
import cn.alex.dubbo.inter.entity.Book;
import cn.alex.dubbo.inter.service.IBookService;
import cn.alex.dubbo.inter.service.IGoddessService;
import cn.alex.dubbo.inter.util.ResultBeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by WCY on 2022/10/24
 */
@Service
public class GoddessService implements IGoddessService {

    @Autowired
    private IBookService bookService;

    @Override
    public ResultBean getGoddess(String resource, Map<String, Object> params) {
        List<Book> bookList = bookService.getBookList();
        return ResultBeanUtil.success("goddess is reading!", bookList);
    }

}
