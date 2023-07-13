package com.benard.contentcalendar;

import com.benard.contentcalendar.model.Content;
import com.benard.contentcalendar.model.Status;
import com.benard.contentcalendar.model.Type;
import com.benard.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		return args -> {
			Content c = new Content(1,
					"Hello, I wrote something new in ChtGPT",
					"My Fist Blog Post",
					Status.IDEA,
					Type.ARTICLE,
					LocalDateTime.now(),
					null,
					"");
		};
	}

}
