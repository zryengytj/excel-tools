package org.miracle.excel.tools;

/**
 * @author zengrenyuan
 * @date 2021/8/18
 **/
public class DefaultFormat implements Format<String, String> {
    @Override
    public String format(String s) {
        return s;
    }
}
