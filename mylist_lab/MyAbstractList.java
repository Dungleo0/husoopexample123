package mylist_lab;


public abstract class MyAbstractList implements MyList {
    /**
     * Mô tả dữ liệu của list.
     *
     * @return mô tả list theo định dạng [a1] [a2] [a3] ... [an]
     */
    @Override
    public String toString() {
        /* TODO */
        MyIterator iterator = iterator();
        StringBuilder sb = new StringBuilder();
        while (iterator.hasNext()) {
            sb.append("[").append(iterator.next()).append("] ");
        }
        return sb.toString();
    }
}
