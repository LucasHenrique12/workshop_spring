package com.lucashenrique.workshopspring.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.sql.Date;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.lucashenrique.workshopspring.domain.Post;
import com.lucashenrique.workshopspring.domain.User;
import com.lucashenrique.workshopspring.repository.PostRepository;
import com.lucashenrique.workshopspring.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        userRepository.deleteAll();
        postRepository.deleteAll();
        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        Post postMaria = new Post(null, sdf.parse("22/08/2022"), "Partiu Viagem", "body", maria);
        userRepository.saveAll(Arrays.asList(maria, alex, bob));
        postRepository.saveAll(Arrays.asList(postMaria));
    }

}
