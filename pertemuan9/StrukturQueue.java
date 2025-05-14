package pertemuan9;

public class StrukturQueue {

			Node REAR;
			Node FRONT = null;

			//LATIHAN 1
			public void enqueue(int data) {
				Node newNode = new Node(data);
				if (isEmpty()) {
					FRONT = newNode;
					REAR = newNode;
				} else {
					REAR.setNext(newNode);
					REAR = newNode;
				}
			}

			//LATIHAN 2
			public boolean isEmpty() {
				return FRONT == null;
			}

			//LATIHAN 5
			public void displayElement() { 
				if (isEmpty()) {
					System.out.println("Size :" + size());
					System.out.println("Isempty: " + isEmpty());
//					System.out.println("Elemen Queue: Queue Kosong");
				} else {
					Node curNode = FRONT;
					System.out.println("Size :" + size());
					System.out.println("Isempty: " + isEmpty());
//					System.out.print("Elemen Queue : ");
					while (curNode != null) {
						size();
						System.out.print(curNode.getNilai() + " ");
						curNode = curNode.getNext();
					}
					System.out.println(" ");
					System.out.println("Front: " + front());
				}
			}

			//LATIHAN 3
			public int size() {
				int size = 0;
				Node curNode = FRONT;
				while (curNode != null) {
					size++;
					curNode = curNode.getNext();
				}
				return size;
			}

			public int front() {
				return FRONT != null ? FRONT.getNilai() : -1;
			}

			//TUGAS
			public void dequeue() {
				if (isEmpty()) {
					System.out.println("Queue is empty");
				} else {
					FRONT = FRONT.getNext();
					if (FRONT == null) {
						REAR = null;
					}
				}
			}


}
