package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Books;
import service.BookService;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller调用service
    @Autowired//自动注入
    //当容器扫描到@Autowied 就会在IoC容器自动查找需要的bean，并装配给该对象的属性
    @Qualifier("BookServiceImpl")
    //指定注入哪个对象
    private BookService bookService;
    //查询全部书籍,并且返回到一个书籍展示界面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }
    @RequestMapping("/toAddBook")
    public String toAddPage(){
        return "addBook";
    }
    @RequestMapping("/addBook")
    public String addBook(Books books){
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int id,Model model){
        Books books=bookService.queryBookById(id);
        model.addAttribute("book",books);
        return "updateBook";
    }
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }
    @RequestMapping("/del/{bookID}")
    public String deleteBook(@PathVariable("bookID") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }
    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String BookName,Model model){
        List<Books> list = bookService.queryBookByName(BookName);
        model.addAttribute("list",list);
        return "allBook";
    }
}
