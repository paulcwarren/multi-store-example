package com.example.multistore;

import java.io.ByteArrayInputStream;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.content.commons.repository.ContentStore;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MultiStoreExampleApplication {

    private static final Log logger = LogFactory.getLog(MultiStoreExampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MultiStoreExampleApplication.class, args);
	}

    @Component
    public class MyRunner implements CommandLineRunner {

        @Autowired
        private DocRepository repository;

        @Autowired
        private ContentStore<Doc, UUID> store;

        @Override
        public void run(String... args) throws Exception {
            repository.deleteAll();

            Doc d = new Doc();
            d = store.setContent(d, new ByteArrayInputStream("Hello Multi-Store World!".getBytes()));
            d = repository.save(d);

            logger.info("Doc content uploaded");
        }
    }
}
