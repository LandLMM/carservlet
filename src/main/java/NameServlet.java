import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "NameServlet", value = "/showName")
public class NameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("cars", carList());
        req.getRequestDispatcher("showName.jsp").forward(req,resp);
    }

    private List<Car> carList(){
        Car car1 = new Car("BMW Seria5", "Limousine", 2015);
        Car car2 = new Car("Kia ceed", "Compact", 2013);
        Car car3 = new Car("Opel Astra", "Compact", 2017);
        Car car4 = new Car("Audi A7", "Limousine", 2016);
        return Arrays.asList(car1,car2,car3,car4);
    }
}