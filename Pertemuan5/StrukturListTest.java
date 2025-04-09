package Pertemuan5;

public class StrukturListTest {
	public static void main(String[] args) {
	    StrukturList list = new StrukturList();

// Latihan 4
	    list.addHead(1);
	    list.addHead(5);
	    list.addHead(3);
	    list.addHead(6);
	    list.addHead(2);
	    list.displayElement(); 
	    System.out.println();
	    list.removeTail();
	    list.displayElement(); 
	    System.out.println();
	    list.removeHead();
	    list.displayElement(); 
	    System.out.println();
	    list.removeTail();
	    list.displayElement();

	}
}
