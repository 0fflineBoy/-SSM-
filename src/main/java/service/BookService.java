package service;
import pojo.Books;


import java.util.List;

public interface BookService {
    //增加一本书
    int addBook(Books book);
    //删除一本书
    int deleteBookById(int id);
    //更新一本书
    int updateBook(Books book);
    //查询一本书
    Books queryBookById(int id);
    //查询全部书
    List<Books> queryAllBook();
    List<Books> queryBookByName(String bookName);
}
