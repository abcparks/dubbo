package cn.alex.dubbo.inter.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by WCY on 2022/10/21
 */
@Getter
@Setter
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long bookId;

    private String bookName;

    private String author;

    private Double bookPrice;

}
