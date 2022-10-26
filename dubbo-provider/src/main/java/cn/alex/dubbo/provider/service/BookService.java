package cn.alex.dubbo.provider.service;

import cn.alex.dubbo.inter.entity.Book;
import cn.alex.dubbo.inter.service.IBookService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.Arrays;
import java.util.List;

/**
 * Created by WCY on 2022/10/21
 */
@DubboService(version = "1.0")
public class BookService implements IBookService {

    @Override
    public List<Book> getBookList() {
        return Arrays.asList(new Book(), new Book());
    }

}
