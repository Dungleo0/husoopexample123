package hus.oop.basicstatistics;

import mylist.MyIterator;

public abstract class MyAbstractList implements MyList {
    /**
     * Mô tả dữ liệu của list.
     * @return mô tả list theo định dạng [a1] [a2] [a3] ... [an]
     */
    @Override
    public String toString() {
        /* TODO */
        MyIterator iterator = (MyIterator) iterator();
        StringBuilder result = new StringBuilder();
        while (iterator.hasNext()) {
            result.append("[").append(iterator.next()).append("] ");
        }
        return result.toString();
    }
}
