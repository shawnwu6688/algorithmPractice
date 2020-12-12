package com.my.test.stream.bean;
import com.my.test.bean.Apple;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppleServer {
    public static List<Apple> appleStore = new ArrayList<>();
    {
        appleStore.add(new Apple("湖北",1,"yellow",450));
        appleStore.add(new Apple("湖南",2,"black",500));
        appleStore.add(new Apple("江苏",3,"yellow",550));
        appleStore.add(new Apple("北京",3,"black",600));

    }
    public void groupByColor(Predicate<? super Apple> pr){

        List<Apple> yellow = appleStore
                .stream()
                .filter(pr)
                //.filter(a->a.getWeight()>500)
                .collect(Collectors.toList());
        System.out.println(yellow);
    }
    public static void main(String[] args) {
        new AppleServer().groupByColor(a->a.getWeight()>500&&a.getColor().equals("yellow"));
    }
    /**求出每个颜色的平均重量*/
    @Test
    public void groupByColorandWeight(){

        appleStore
                .stream()
                .collect(Collectors.groupingBy(a->a.getColor(),
                        Collectors.averagingInt(a->a.getWeight())))
                .forEach((k,v)-> System.out.println(k+":"+v));

    }

    @Test
    public void test1(){

        List<Apple> yellow = appleStore
                .stream()
                .filter(a -> a.getColor().equals("yellow"))
                .filter(apple -> apple.getWeight() > 450)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(yellow);

    }
    @Test
    public void test2(){
        /**
         * 流不可重复使用
         * collect采集
         *
         */
        /**
         * collect采集
         * 1、list
         * 2、map
         * 3、group by
         * 4.数组
         * 5.求出最大值
         * 6.求任意值
         */
        appleStore
                .stream()
                .filter(a -> a.getColor().equals("yellow"))
                .map(a->a.getColor())
                .peek(a-> System.out.println(a))
                //同foreach一样都是执行一个函数，但是peek是中间节点，foreach是中止节点
                .collect(Collectors.toList());



    }
    @Test
    public void mapTest(){

        /**
         * collect采集
         * 1、list
         * 2、map
         * 3、group by
         * 4.数组
         * 5.求出最大值
         * 6.求任意值
         */
        //基于颜色分组 key:color;value:apple
        Map<String, Apple> appleGroup = appleStore
                .stream()
                .collect(Collectors.toMap(a -> a.getColor(), a -> a, (a1, a2) -> a1));
        System.out.println(appleGroup);



    }



}
