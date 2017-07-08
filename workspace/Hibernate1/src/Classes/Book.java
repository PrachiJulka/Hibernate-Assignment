package Classes;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

//Q15 Implement One to One mapping between Author and Book.
@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private String bookName;
	@ManyToMany
	private List<Author> auth=new ArrayList<>();
	
	public int getBid() {
		return bid;
	}
	public List<Author> getAuth() {
		return auth;
	}
	public void setAuth(List<Author> auth) {
		this.auth = auth;
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
