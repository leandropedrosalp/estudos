package com.smu.spark.dao;

import com.google.gson.annotations.Expose;
import lombok.Data;

@Data
public class Usuario {

	@Expose
	private Long id;

	@Expose
	private String nome;

	@Expose
	private String email;
}
