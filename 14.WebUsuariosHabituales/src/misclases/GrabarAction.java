package misclases;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GrabarAction implements ServletRequestAware, ServletResponseAware {

    private String user;
    private HttpServletResponse response;

    public String execute() throws Exception {
        Cookie ck = new Cookie("user", user);
        ck.setMaxAge(2000);
        response.addCookie(ck);
        return "grabado";
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        user = request.getParameter("username");
    }

    @Override
    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }
}
