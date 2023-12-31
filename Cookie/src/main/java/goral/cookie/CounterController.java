package goral.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Optional;

@WebServlet("/counter")
public class CounterController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Optional<Cookie> visitsCookie = getCookieByName(request, "visits");
        Integer numberOfVisits = visitsCookie
                .map(Cookie::getValue)
                .map(Integer::valueOf)
                .orElse(0);
        numberOfVisits++;


        Cookie cookie = new Cookie("visits", Integer.toString(numberOfVisits));
        cookie.setMaxAge(30 * 24 * 60 * 60);
        response.addCookie(cookie);
        request.setAttribute("numberOfVisits", numberOfVisits);
        request.getRequestDispatcher("/visits.jsp").forward(request, response);
    }

    private Optional<Cookie> getCookieByName(HttpServletRequest request, String cookieNAme){
        Cookie[] cookies = request.getCookies();
        if (cookies == null){
            return Optional.empty();
        }
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(cookieNAme)){
                return Optional.of(cookie);
            }
        }
        return Optional.empty();
    }
}