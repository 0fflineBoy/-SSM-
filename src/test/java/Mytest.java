
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Books;
import service.BookServiceImpl;

import java.util.List;


public class Mytest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookServiceImpl = (BookServiceImpl) context.getBean("BookServiceImpl");
        List<Books> list = bookServiceImpl.queryAllBook();
        for (Books books : list) {
            System.out.println(books);
        }

    }
}

