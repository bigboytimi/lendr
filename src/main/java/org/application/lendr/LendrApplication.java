package org.application.lendr;

import lombok.RequiredArgsConstructor;
import org.application.lendr.domain.model.User;
import org.application.lendr.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LendrApplication implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    public static void main(String[] args) {
        SpringApplication.run(LendrApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User(1L, "Jones", "Cho", 26, "Marketer"));
        userRepository.save(new User(3L, "Jane", "Yu", 21, "Trader"));

    }
}
