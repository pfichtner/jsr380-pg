package com.github.pfichtner.bytebuddy.pg._4_no_anno_apt;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {

	@NotNull
	@Size(min = 2, max = 20)
	private final String name;

	public Person(@NotNull @Size(min = 2, max = 20) String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}
