package pertemuan9;

//LATIHAN 4
public class QueueMain {
	
	public static void main(String[] args) {
		StrukturQueue sq = new StrukturQueue();
		System.out.println("### Sebelum Enqueue 3x ###");
		sq.displayElement();
//		sq.enqueue(2);
//		sq.enqueue(7);
//		sq.enqueue(6);
//		sq.enqueue(1);
		
		System.out.println("### Enqueue 3x ###");
		sq.displayElement();
		sq.dequeue();
		sq.dequeue();

	}


}
