package misclases;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.apache.struts2.StrutsStatics;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class UserInterceptor extends AbstractInterceptor implements StrutsStatics {
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        ComprobarAction action = (ComprobarAction) invocation.getAction();

        ActionContext context = invocation.getInvocationContext();
        HttpServletRequest request = (HttpServletRequest) context.get(HTTP_REQUEST);

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    action.setExiste(true);
                    action.setUser(cookie.getValue());
                }
            }
        }
        return invocation.invoke();
    }
}
