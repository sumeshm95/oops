package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Samsple {
public static void main(String[] args) {
	List<String> l=new ArrayList<String>();
	l.add("c");
	l.add("c");
	l.add("v");
	l.add("d");
	int frequency = Collections.frequency(l, "c");
System.out.println(frequency);

}

}
