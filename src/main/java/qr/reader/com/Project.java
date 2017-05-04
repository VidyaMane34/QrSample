package qr.reader.com;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.google.zxing.EncodeHintType;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
@EnableAutoConfiguration
@SpringBootApplication
@ControllerAdvice
public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		SpringApplication.run(Project.class, args);
		
		 

		 
	}

	
}
