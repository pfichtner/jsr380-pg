package com.github.pfichtner.bytebuddy.pg._2_own_anno_with_agent;
import javax.validation.constraints.Size;

import lombok.Value;

@Value
@Validate
public class Person {

	@Size(min = 2, max = 20)
	private final String name;

}
