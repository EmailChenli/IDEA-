package com.example.demo.entitytools;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultsConstructor<T> {
	private int code;
	private String msg;
	private T data;
}
