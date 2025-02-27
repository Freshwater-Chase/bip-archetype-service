package gov.va.bip.origin;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 * Controller for the root URL - redirects to the Swagger UI
 */
@Controller
public class HomeController {

	/**
	 * Request mapping for root URL with no path - redirects to the Swagger UI
	 *
	 * @param request
	 * @param response
	 * @throws IOException
	 */
    @GetMapping("/")
    public void home(HttpServletRequest request, HttpServletResponse response) throws IOException {
    	response.sendRedirect(ServletUriComponentsBuilder.fromCurrentContextPath().path("/swagger-ui.html").build().toUriString());
    }
}
