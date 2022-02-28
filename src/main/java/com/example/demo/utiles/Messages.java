package com.example.demo.utiles;

public class Messages {

	private static final String ERRORLOGIN = "Nombre de usuario o contraseña erroneos";
	private static final String ERRORCATALOGO = "No puedes realizar un pedido sin añadir productos al carrito";
	private static final String ERROREDITAR = "No puedes borrar todos los productos de un pedido";
	
	
	
	public Messages() {
		super();
	}
	
	public static String getErrorLogin() {
		return ERRORLOGIN;
	}
	public static String getErrorCatalogo() {
		return ERRORCATALOGO;
	}
	public static String getErrorEditar() {
		return ERROREDITAR;
	}

}

