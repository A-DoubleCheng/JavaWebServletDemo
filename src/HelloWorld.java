import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2017/6/13.
 */
public class HelloWorld extends HttpServlet{
    private String message;

    @Override
    public void init() throws ServletException {
        message = "This is a Java Web Servlet Demo with Idea";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置ContentType
        resp.setContentType("text/html");
        //设置逻辑
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h1>" + message + "</h1>");
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
