package com.github.qyzhangaws.cloudhsm.model;

import java.io.Serializable;

public class MyPojoData implements Serializable {

	private static final long serialVersionUID = 1L;

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
