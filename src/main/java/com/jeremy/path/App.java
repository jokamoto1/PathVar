package com.jeremy.path;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class App {
        public static void main(String[] args) {
                SpringApplication.run(App.class, args);
        }
        
        // 1. Annotation
        @RequestMapping("/daichiki/travel/{change}")
        // 3. Method that maps to the request route above
        public String travel(@PathVariable("change") String change) { // 3
        	return "You will soon travel to " + change +"!";
        }
        @RequestMapping("/daichiki/lotto/{change}")
        public String lotto(@PathVariable("change") int change) {
        	
        	if ( change % 2 == 0) {
        		return "You will take a grand journey in the near future, but be weary of tempting offers.";
        	}else {
        		
        		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
        	}
        }
}
