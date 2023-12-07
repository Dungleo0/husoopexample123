package midterm.oop.statistics;

public class LinkedListDataSet extends AbstractDataSet {
    private Node head;

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public LinkedListDataSet() {
        this.head = null;
    }

    @Override
    public int size() {
        /* TODO */
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    /**
     * Lấy giá trị của phần tử ở vị trí index.
     *
     * @param index
     * @return
     */
    @Override
    public double get(int index) {
        /* TODO */
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     *
     * @param data
     * @param index
     */
    @Override
    public void set(double data, int index) {
        /* TODO */
        getNodeByIndex(index).setData(data);
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     *
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void append(double value) {
        /* TODO */
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node lastNode = getNodeByIndex(size() - 1);
            lastNode.next = newNode;
        }
    }


    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * Chỉ thêm được nếu index nằm trong đoạn [0 - size()].
     *
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     * @param index vị trí mà bạn muốn thêm phần tử dữ liệu.
     */
    @Override
    public void insert(double value, int index) {
        if (index >= 0 && index <= size()) {
            Node newNode = new Node(value);
            if (index == 0) {
                newNode.next = head;
                head = newNode;
            } else {
                Node prevNode = getNodeByIndex(index - 1);
                newNode.next = prevNode.next;
                prevNode.next = newNode;
            }
        } else {
            System.out.println("Invalid index.");
        }
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * Chỉ xóa được nếu index nằm trong đoạn [0 - (size() - 1)]
     *
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */

        if (index >= 0 && index <= size() - 1) {
            Node current = getNodeByIndex(index);
            if (index == 0) {
                head = head.next;
            } else {
                Node prev = getNodeByIndex(index - 1);
                prev.next = current.next;
            }
        }
    }

    /**
     * Phương thức lấy Node ở vị trí index.
     *
     * @param index
     * @return
     */
    private Node getNodeByIndex(int index) {
        /* TODO */
        if(index < 0 || index > size()) {
            return null;
        }
        if (index == 0) {
            return head;
        }
        Node current = head;
        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public double[] toArray() {
        int size = size();
        double[] array = new double[size];
        Node current = head;
        for (int i = 0; i < size; i++) {
            array[i] = current.data;
            current = current.next;
        }
        return array;
    }
}
