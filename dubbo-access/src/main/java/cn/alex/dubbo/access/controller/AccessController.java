package cn.alex.dubbo.access.controller;

import cn.alex.dubbo.inter.common.ResultBean;
import cn.alex.dubbo.inter.entity.Book;
import cn.alex.dubbo.inter.service.IBookService;
import cn.alex.dubbo.inter.service.IGoddessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by WCY on 2022/10/21
 */
@RestController
public class AccessController {

    /*
        loadbalance = "roundrobin", 按权重随机
        loadbalance = "random", 按权重轮询
     */
    //@DubboReference(version = "1.0", loadbalance = "random", reconnect = "true")
    @Autowired
    private IBookService bookService;

    @Autowired
    private IGoddessService goddessService;

    @GetMapping("getBookList")
    public Object getBookList() {
        List<Book> bookList = bookService.getBookList();
        return bookList;
    }

    @GetMapping("getGoddessList")
    public Object getGoddessList(@RequestParam(name = "file", required = false) MultipartFile file) throws IOException {
        // 测试payload文件上传限制
        Map<String, Object> params = new HashMap<>();
        if (file != null && !file.isEmpty()) {
            byte[] bytes = file.getBytes();
            params.put("byte", bytes);
        }

        ResultBean resultBean = goddessService.getGoddess("goddess", params);
        return resultBean;
    }
}
