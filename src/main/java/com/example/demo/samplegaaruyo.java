package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WisdomWikiApiApplication {

	public static List<Integer> getList()
	{
	    return new LinkedList<>();
	}
	public static void listTest(List<Integer> list)
	{
	    System.out.println(list.getClass());

	    list.add(1);
	    list.add(2);
	    list.add(3);

	    list.forEach(System.out::println);
	}
}

