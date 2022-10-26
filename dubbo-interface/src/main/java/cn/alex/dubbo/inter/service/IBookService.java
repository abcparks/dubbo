package cn.alex.dubbo.inter.service;

import cn.alex.dubbo.inter.entity.Book;

import java.util.List;

/**
 * Created by WCY on 2022/10/21
 */
public interface IBookService {

    List<Book> getBookList();

}
