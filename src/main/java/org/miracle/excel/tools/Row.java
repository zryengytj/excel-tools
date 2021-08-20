package org.miracle.excel.tools;

/**
 * @author zengrenyuan
 * @date 2021/8/18
 **/
public class Row<T> {

    /**
     * 返回每一行数据
     */
    private T data;

    /**
     * 行号,从0行始
     */
    private int index;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
