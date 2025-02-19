package fraga.com.example.ChatBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "fraga.com.example.ChatBoot")
public class ChatBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatBootApplication.class, args);
	}

}
