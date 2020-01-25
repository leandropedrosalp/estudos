package com.smu.spark.validator;

import com.smu.spark.dao.Usuario;
import spark.utils.StringUtils;

public class UsuarioValidator {

	public static boolean isValido(Usuario usuario) {
		return (usuario != null && !StringUtils.isEmpty(usuario.getEmail()) && !StringUtils.isEmpty(usuario.getNome()));
	}

}
