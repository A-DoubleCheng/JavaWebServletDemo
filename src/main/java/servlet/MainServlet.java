package servlet;

import utils.HttpClientUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/6/16.
 */
@WebServlet(name = "main",urlPatterns = "/main.html")
public class MainServlet extends HttpServlet {
    private final static String ACCESS_TOKEN = "9c608f2f109c4390ae40c76226440221";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HashMap<String, String> param = new HashMap<String, String>();
        param.put("access_token", ACCESS_TOKEN);

        try {
            String s = HttpClientUtils.get("http://api.csdn.net/blog/getarticlelist", param);
            System.out.println(s);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        req.getRequestDispatcher("/view/main.jsp").forward(req, resp);
    }
}
