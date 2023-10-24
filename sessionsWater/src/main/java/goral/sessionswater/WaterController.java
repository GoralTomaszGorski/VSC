package goral.sessionswater;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet({"/control"})
public class WaterController extends HttpServlet {
    private static final int GLASS_OF_WATER = 250;

    public WaterController() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String option = request.getParameter("option");
        HttpSession session = request.getSession();
        if (option.equals("water")) {
            this.increaseWaterLevel(session);
        } else if (option.equals("clear")) {
            session.removeAttribute("water");
        }

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    private void increaseWaterLevel(HttpSession session) {
        Object water = session.getAttribute("water");
        int resultWater;
        if (water == null) {
            resultWater = GLASS_OF_WATER;
        } else {
            resultWater = (int)water + GLASS_OF_WATER;
        }

        session.setAttribute("water", resultWater);
    }
}
