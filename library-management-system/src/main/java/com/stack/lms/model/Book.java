package com.stack.lms.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private boolean borrowed;
    public boolean isBorrowed() {
		return borrowed;
	}
	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}
	@ManyToOne
    @JoinColumn(name = "user_id")
    private User borrowedBy;
	public User getBorrowedBy() {
		return borrowedBy;
	}
	public void setBorrowedBy(User borrowedBy) {
		this.borrowedBy = borrowedBy;
	}
}
