package org.miracle.excel.tools;

/**
 * @author zengrenyuan
 * @date 2021/8/18
 **/
public interface Format<Input, Value> {

    /**
     * 格式化返回值
     *
     * @param input 输入
     * @return 输出
     */
    Value format(Input input);

    /**
     * 用于格式化数据使用
     *
     * @return strings[]
     */
    default String[] type() {
        return new String[0];
    }


}
