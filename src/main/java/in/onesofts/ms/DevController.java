package in.onesofts.ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevController {

	@GetMapping("/")
	public String msg() {
		return "Hello all";
	}
}
