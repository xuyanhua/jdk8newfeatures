package cn.gaofi.jdk8newfeatures;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuyanhua
 * @description:
 * @date 2018/7/5 下午1:56
 */
public class SreamAPI {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("c");
        list.add("d");
        list.add("a");
        list.add("b");
        list.stream().forEach(System.out::println);
        System.out.println("---------------------");
        list.stream().filter(e -> e.compareTo("b") > 0).forEach(System.out::println);
        System.out.println("---------------------");
        list.stream().filter(e -> e.compareTo("b") > 0).map(e -> e.concat("___")).sorted().forEach(System.out::println);

    }
}
