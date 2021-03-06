package me.snowdrop.example.istio.routing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @RequestMapping("/data")
    public String random() {
    	long started = System.currentTimeMillis();
    	try {
    		// Simulate a delay.
  			Thread.sleep((long) (Math.random() * 1000));
  		} catch (InterruptedException e) {
  			// Carry on.
  		}
    	return "Hello from Service A! Operation completed in " + (System.currentTimeMillis() - started) + "ms.";
    }

}
