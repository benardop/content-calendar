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
			Content content = new Content(null,
					"Hello, I wrote something new in ChtGPT",
					"All about chatGPT",
					Status.IDEA,
					Type.VIDEO,
					LocalDateTime.now(),
					null,
					"");
			repository.save(content);
		};
	}

}
