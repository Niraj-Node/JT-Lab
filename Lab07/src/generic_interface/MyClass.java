package generic_interface;

interface MinMax<T extends Comparable<T>> 
{
	T findMin(T[] array);
	T findMax(T[] array);
}

public class MyClass<T extends Comparable<T>> implements MinMax<T> 
{
	 @Override
	 public T findMin(T[] array) 
	 {
	     if(array == null || array.length == 0) {
	         throw new IllegalArgumentException("Array is empty or null");
	     }
	
		 T min = array[0];
		 for(T element : array) 
		 {
		     if(element.compareTo(min) < 0) {
		         min = element;
		     }
		 }
		 return min;
	 }

	 @Override
	 public T findMax(T[] array) 
	 {
	     if(array == null || array.length == 0) {
	         throw new IllegalArgumentException("Array is empty or null");
	     }
	
	     T max = array[0];
	     for(T element : array) 
	     {
	         if(element.compareTo(max) > 0) {
	             max = element;
	         }
	     }
	     return max;
	 }
}

class Book implements Comparable<Book> 
{
	String title;
	double price;
	
	public Book(String title, double price) {
	    this.title = title;
	    this.price = price;
	}
	
	@Override
	public int compareTo(Book other) {
	    return Double.compare(this.price, other.price);
	}
	
	@Override
	public String toString() {
	    return "Book{title='" + title + "', price=" + price + '}';
	}
}

class MinMaxDemo 
{
	 public static void main(String[] args) 
	 {
	     Book[] books = {
	             new Book("Book1", 20.5),
	             new Book("Book2", 15.8),
	             new Book("Book3", 25.2),
	             new Book("Book4", 18.6),
	             new Book("Book5", 22.3)
	     };
	
	     MyClass<Book> myClass = new MyClass<>();
	
	     Book minBook = myClass.findMin(books);
	     System.out.println("Book with Minimum Price: " + minBook);
	
	     Book maxBook = myClass.findMax(books);
	     System.out.println("Book with Maximum Price: " + maxBook);
	 }
}

