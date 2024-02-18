package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetails(@PathVariable("userId") int userId, @PathVariable("userName") String userName) {
		System.out.println("User ID: " + userId);
		System.out.println("User Name: " + userName);
//		Integer.parseInt(userName);
		return "home";
	}

	@RequestMapping("/home")
	public String home() {
		System.out.println("Going to Home View");
		// processing area..
		String s = null;
//		System.out.println(s.length());
		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query, Model model) {
		RedirectView redirectView = new RedirectView();
		if (query.isBlank()) {
			redirectView.setUrl("home");
			model.addAttribute("message", "Fill Content");
			return redirectView;
		}
		String url = "https://www.google.com/search?q=" + query;
		redirectView.setUrl(url);

		return redirectView;
	}
	
////	Handling Exception in our spring mvc
//	
////	@ExceptionHandler({NullPointerException.class,NumberFormatException.class}) // for more
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value = NullPointerException.class)
//	public String exceptionHandlerNull(Model m) {
//		m.addAttribute("msg", "NullPointerException has occured");
//		return "null_page";
//	}
//	
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value = NumberFormatException.class)
//	public String exceptionHandlerNumberFormat(Model m) {
//		m.addAttribute("msg", "NumberFormatException has occured");
//		return "null_page";
//	}
//	
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value = Exception.class)
//	public String exceptionHandlerGeneric(Model m) {
//		m.addAttribute("msg", "Exception has occured");
//		return "null_page";
//	}

}
