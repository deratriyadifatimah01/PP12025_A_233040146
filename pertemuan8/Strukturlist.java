package pertemuan8;

public class Strukturlist {
    private Node HEAD;

    public boolean isEmpty() {
        return HEAD == null;
    }

    //LATIHN 2
    public void addTail(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }

    //LATIHAN 3
    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node curNode = HEAD;
            while (curNode != null) {
                Matakuliah mk = curNode.getData();
                System.out.println("Matakuliah: " + mk.getKode() + " " + mk.getNama() + " " + mk.getSks());
                curNode = curNode.getNext();
            }
            System.out.println("");
        }
    }

    //TES 2
    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    //TES 3
    public void addMid(Matakuliah data, int position) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            if (position == 1) {
                newNode.setNext(HEAD);
                HEAD = newNode;
            } else {
                Node curNode = HEAD;
                Node posNode = null;
                int i = 1;
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            }
        }
    }

    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            HEAD = HEAD.getNext();
        }
    }

    public void removeTail() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else if (HEAD.getNext() == null) {
            HEAD = null;
        } else {
            Node preNode = null;
            Node lastNode = HEAD;
            while (lastNode.getNext() != null) {
                preNode = lastNode;
                lastNode = lastNode.getNext();
            }
            preNode.setNext(null);
        }
    }

    public void removeMid(Matakuliah e) {
        if (isEmpty()) {
            System.out.println("List Kosong");
            return;
        }

        Node curNode = HEAD;
        Node preNode = null;
        while (curNode != null) {
            if (curNode.getData().equals(e)) {
                if (preNode == null) {
                    HEAD = curNode.getNext(); // Remove head
                } else {
                    preNode.setNext(curNode.getNext());
                }
                return; // Exit after removing
            }
            preNode = curNode;
            curNode = curNode.getNext();
        }
        System.out.println("Element not found");
    }

    public boolean find(Matakuliah x) {
        Node curNode = HEAD;
        while (curNode != null) {
            if (curNode.getData().equals(x)) {
                return true;
            }
            curNode = curNode.getNext();
        }
        return false;
    }

    public int size() {
        Node curNode = HEAD;
        int count = 0;
        while (curNode != null) {
            count++;
            curNode = curNode.getNext();
        }
        return count;
    }

    public void removeAll() {
        HEAD = null; // Simply set HEAD to null to remove all elements
    }
}
