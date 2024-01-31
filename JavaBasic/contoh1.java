public class contoh1 {
    public static void main(String[] args) {
        Node newNode = new Node(data);
        if(head==null) {
            head==newNode;
        }
        else{
            Node current=head;
            whlie(current.next !=null){
                currnet = current.next;
            }
            current.next = newNode;
        }
    }
}
