package com.service;

import com.entity.Book;
import com.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // ✔ Add Book
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    // ✔ Get All Books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // ✔ Get Book By ID
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    // ✔ Update Book
    public Book updateBook(Long id, Book updatedBook) {
        Book existing = bookRepository.findById(id).orElse(null);

        if (existing != null) {
            existing.setBookTitle(updatedBook.getBookTitle());
            existing.setAuthor(updatedBook.getAuthor());
            existing.setPublisher(updatedBook.getPublisher());
            existing.setCategory(updatedBook.getCategory());
            existing.setQuantity(updatedBook.getQuantity());
            existing.setRackNo(updatedBook.getRackNo());
            existing.setAddedDate(updatedBook.getAddedDate());
            return bookRepository.save(existing);
        }
        return null;
    }

    // ✔ Delete Book
    public String deleteBook(Long id) {
        if (bookRepository.existsById(id)) {
            bookRepository.deleteById(id);
            return "Book deleted successfully!";
        }
        return "Book not found!";
    }
}
