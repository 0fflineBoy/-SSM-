package dao;

import org.apache.ibatis.annotations.Param;
import pojo.Books;

import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBook(Books book);
    //删除一本书
    int deleteBookById(@Param("bookID") int id);
    //更新一本书
    int updateBook(Books book);
    //查询一本书
    Books queryBookById(@Param("bookID") int id);
    //查询全部书
    List<Books> queryAllBook();
    //根据名字查询一本书
    List<Books> queryBookByName(@Param("bookName") String bookName);
}
