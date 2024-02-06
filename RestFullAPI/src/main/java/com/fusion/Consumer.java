package com.fusion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Consumer {

	@Autowired
	 RestTemplate restTemplate;
	
	@GetMapping("/consumer")
	public String Consumers() {
		System.out.println("inside Consumers");
		return "RestFullApi consumer----8883";
	}
	
	@GetMapping("/consumer/get1")
	public String GetName() {
		System.out.println("Inside GetName().consumer port---8883");
	//	"http://localhost:8882/get"
	//url,HttpMethod,input,output
	
	 ResponseEntity<String> s2=restTemplate.exchange("http://localhost:8882/get", HttpMethod.GET, null, String.class);
		System.out.println(s2);
		if(s2.getStatusCodeValue()==200) {
			System.out.println("response from producer success");
			String response=s2.getBody();
			return response;
		}else {
			System.out.println("response from producer failed");
			String response = s2.getBody();
			return response;
		}
	}
}
