package oop.Polymorphism;

public class AmazonSearchTest {

	public static void main(String[] args) {
		AmazonSearch s=new AmazonSearch();
		s.search("Sony PS5");
		s.search(30000);
		s.search("OnePlus 11R", 39000);
		s.search("Samsung", "Samsung Tab S7 FE");
	}

}
