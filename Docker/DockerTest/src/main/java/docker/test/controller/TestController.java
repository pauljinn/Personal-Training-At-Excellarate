package docker.test.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
	@RequestMapping("/")
	public Map<String,Object> getValues(){
		Map<String,Object> data = new HashMap<>();
		data.put("message", "Java api is working find");
		data.put("Languages", Arrays.asList("Java", "Python", "Javascript"));
		data.put("Code", 2345);
		return data;
	}
}
