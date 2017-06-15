package filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Administrator on 2017/6/14.
 */
public class LoginFilter implements Filter {
//    public static final String LOGIN_PAGE = "/login.html";
    public static final String LOGOUT_PAGE = "/login.html";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;

        String currentURL = request.getRequestURI();
        String checkCSS = request.getRequestURI();
        String ctxPath = request.getContextPath();

        String targetURL = currentURL.substring(ctxPath.length());
        HttpSession session = request.getSession(false);

        if(checkCSS.toLowerCase().contains(".css") || checkCSS.toLowerCase().contains(".js") || checkCSS.toLowerCase().contains(".png") || checkCSS.toLowerCase().contains(".gif") || checkCSS.toLowerCase().contains(".jpg")){
            filterChain.doFilter(request, response);
            return;
        }else if (!("/login.html").equals(targetURL)) {

                if (session == null || session.getAttribute("username") == null || ("").equals(session.getAttribute("username"))) {
                    response.sendRedirect(LOGOUT_PAGE);
                } else {
                    filterChain.doFilter(request, response);
                    return;
                }
            } else {
                filterChain.doFilter(request, response);
                return;
            }
        }



    @Override
    public void destroy() {

    }
}
