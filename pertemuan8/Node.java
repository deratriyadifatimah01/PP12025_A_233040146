package pertemuan8;

public class Node {
    private Matakuliah data; // Menggunakan huruf kecil untuk konvensi penamaan
    private Node next;

    //LATIHAN 1
    // Constructor
    public Node(Matakuliah data) {
        this.data = data;
    }

    // Getter untuk data
    public Matakuliah getData() {
        return data;
    }

    // Setter untuk data
    public void setData(Matakuliah data) {
        this.data = data;
    }

    // Getter untuk next
    public Node getNext() {
        return next;
    }

    // Setter untuk next
    public void setNext(Node next) {
        this.next = next;
    }
}
