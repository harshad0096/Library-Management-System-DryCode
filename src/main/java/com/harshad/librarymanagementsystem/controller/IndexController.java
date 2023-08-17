package com.harshad.librarymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.harshad.librarymanagementsystem.entity.Book;
import com.harshad.librarymanagementsystem.service.BookService;

@Controller
public class IndexController {
	@Autowired
	BookService bookService;
	@GetMapping("/admin")
	public String list() {
		return "home";
	}

	@GetMapping("/")
	public String findAllBooks(Model model) {
		final List<Book> books = bookService.findAllBooks();

		model.addAttribute("books", books);
		return "index";
	}

		
}
