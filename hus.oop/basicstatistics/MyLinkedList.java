package hus.oop.basicstatistics;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        /* TODO */
        head = null;
    }

    /**
     * Lấy kích thước của list.
     *
     * @return
     */
    @Override
    public int size() {
        /* TODO */
        int count = 0;
        while (head != null) {
            count++;
            head = head.getNext();
        }
        return count;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     *
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        /* TODO */
        MyLinkedListNode node = getNodeByIndex(index);
        if (node == null) {
            return null;
        }
        return node.getPayload();
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     *
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if (index == 0) {
            head = head.getNext();
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(current.getNext().getNext());
        }
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     *
     * @param payload
     */
    @Override
    public void append(Object payload) {
        /* TODO */
        insert(payload, size());
    }

    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     *
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        /* TODO */
        if (index == 0) {
            head = new MyLinkedListNode(payload, head);
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(new MyLinkedListNode(payload, current.getNext()));
        }

    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     *
     * @return
     */
    @Override
    public MyIterator iterator() {
        /* TODO */
        return new MyLinkedListIterator(head);
    }

    /**
     * Lấy node ở vị trí index.
     *
     * @param index
     * @return
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        /* TODO */
        MyLinkedListNode current = null;
        current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }


    private class MyLinkedListIterator implements MyIterator {
        /*
         * MyLinkedListIterator cần phải tham chiếu đến node hiện tại của MyLinkedList để có thể duyệt qua
           các phần tử còn lại trong MyLinkedList.
        */
        private MyLinkedListNode currentNode;

        /**
         * Khởi tạo dữ liệu cho Iterator là node hiện tại trong MyLinkedList.
         *
         * @param node
         */
        public MyLinkedListIterator(MyLinkedListNode node) {
            /* TODO */
            this.currentNode = node;
        }

        /**
         * Kiểm tra trong MyLinkedList có còn phần tử tiếp theo không.
         * Nếu còn thì trả về true, nếu không còn thì trả về false.
         *
         * @return
         */
        @Override
        public boolean hasNext() {
            /* TODO */
            return currentNode != null;
        }

        /**
         * iterator dịch chuyển sang phần tử kế tiếp của MyLinkedList và trả ra dữ liệu (payload) của phần tử hiện tại của MyLinkedList.
         *
         * @return payload của phần tử hiện tại.
         */
        @Override
        public Object next() {
            /* TODO */
            if (hasNext()) {
                Object payload = currentNode.getPayload();
                currentNode = currentNode.getNext();
                return payload;
            }
            return null;
        }

        @Override
        public void remove() {
            /* TODO */

        }
    }
}
