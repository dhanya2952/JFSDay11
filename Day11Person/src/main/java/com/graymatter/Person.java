package com.graymatter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class Person {
	private int id;
	private String name;
	private int age;
	private String mobile;
	private String email;

}
