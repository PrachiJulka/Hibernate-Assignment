package Classes;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Book {
	@Id
	private int bid;
	private String bookName;
	@ManyToOne
	private Author auth;
	
public Author getAuth() {
		return auth;
	}

	public void setAuth(Author auth) {
		this.auth = auth;
	}

public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}


public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}
}
