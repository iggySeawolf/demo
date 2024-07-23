package xyz.iggy.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DumbHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(DumbHelloApplication.class, args);
	}



}

@RestController
class MyController{
	private final MyService myService;

    MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/1")
	public ResponseEntity<String> getOne(){
		return new ResponseEntity<String>(myService.retStr(), HttpStatus.OK);
	}
}

@Service
class MyService{
	public String retStr(){
		return "77";
	}
}