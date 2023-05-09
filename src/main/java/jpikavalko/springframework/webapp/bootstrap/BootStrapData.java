package jpikavalko.springframework.webapp.bootstrap;

import jpikavalko.springframework.webapp.domain.Author;
import jpikavalko.springframework.webapp.domain.Book;
import jpikavalko.springframework.webapp.domain.Publisher;
import jpikavalko.springframework.webapp.repositories.AuthorRepository;
import jpikavalko.springframework.webapp.repositories.BookRepository;
import jpikavalko.springframework.webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in Bootstrap");
        Publisher publisher = new Publisher("Jukka", "Kruutinkuja 1", "Tampere", "Pirkanmaa", "33710");

        publisherRepository.save(publisher);


        Author george = new Author("George", "Orwell");
        Book animalFarm = new Book("Animal Farm", "123456");
        george.getBooks().add(animalFarm);
        animalFarm.getAuthors().add(george);

        authorRepository.save(george);
        bookRepository.save(animalFarm);

        Author haruki = new Author("Haruki", "Murakami");
        Book hbw = new Book("Hard-Boiled Wonderland And The End Of The World", "222222");
        haruki.getBooks().add(hbw);
        hbw.getAuthors().add(haruki);

        authorRepository.save(haruki);
        bookRepository.save(hbw);

        System.out.println("Number of Publishers "+publisherRepository.count());

        System.out.println("Number of Books: " + bookRepository.count());
    }
}
