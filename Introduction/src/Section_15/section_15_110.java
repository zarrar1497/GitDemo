package Section_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class section_15_110 {
//THIS CODE IS NOT WORKING FINE 
	public static void main(String args[]) {
		regular();
		filter();
		streamMap();
		streamCollect();
		
	}

	// JAVA STREAMS
	@Test
	public static void regular() {
		System.out.println("regular function started");
		ArrayList<String> names = new ArrayList<String>();

		names.add("Abhijeet");
		names.add("Don");
		names.add("Zarrar");
		names.add("Rahim");
		names.add("Adam");
		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;

			}

		}
		System.out.println(count);
		System.out.println("regular function closed");
	}

	@Test
	public static void filter() {
		System.out.println("filter function started");
		ArrayList<String> names = new ArrayList<String>();

		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		Long c=		names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		//no life of intermediate operation if there is no terminal operation
		//terminal operation will execute only if intermediate operation[FILTER] returns true
		//We can create stream like below
		//How to use filter in stream API
		
		long d=Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->
				{
					s.startsWith("Z");
				return true; 
				//return false; // if you apply this it will always return false with 0 value
				}).count();
		
				System.out.println(d);
				//names.stream().filter(s->s.length()<2).forEach(s->System.out.println(s));
				names.stream().filter(s->s.length()<2).limit(1).forEach(s->System.out.println(s));
				System.out.println("filter function closed");
				
	}

	public static void streamMap() {
		System.out.println("streamMap function started");
		
		//print names of length with upper case
		Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->s.endsWith("r")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		
		List<String> names=Arrays.asList("Abhijeet","Don","Alekhya","Adam","Ram");
		names.stream().filter(s->s.startsWith("D")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		//merging 2 different list
		List<String> names1=Arrays.asList("Rehan","Noor","Salman","Rahim","Masrur");
		System.out.println("MERGING NOW");
		Stream<String> newStream=Stream.concat(names.stream(), names1.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		Assert.assertTrue(flag);
		System.out.println(flag);
		
		
		System.out.println("streamMap function closed");
		
	}
	
	public static void streamCollect() {
		System.out.println("streamCollect function started");
		
		List<String> ls=Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		
		
		//sorting the unique no
		List<Integer>values=Arrays.asList(3,5,5,4,8,9,9,1);
		values.stream().distinct().forEach(s->System.out.println(s));
		
		//sorting the no
		values.stream().sorted().forEach(s->System.out.println(s));
		
		//get me the 3rd index
		List<Integer> list=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(list.get(2));
		
		System.out.println("streamCollect function closed");
		
	}
}
