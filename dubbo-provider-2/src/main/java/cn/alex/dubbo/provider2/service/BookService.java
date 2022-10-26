package cn.alex.dubbo.provider2.service;

import cn.alex.dubbo.inter.entity.Book;
import cn.alex.dubbo.inter.service.IBookService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by WCY on 2022/10/21
 */
@Service(value = "bookService")
public class BookService implements IBookService {

    @Override
    public List<Book> getBookList() {
        Book book = new Book();
        book.setBookId(20883L);
        book.setBookName("格林童话");
        book.setBookPrice(61.00);
        return Arrays.asList(book, new Book());
    }

}
