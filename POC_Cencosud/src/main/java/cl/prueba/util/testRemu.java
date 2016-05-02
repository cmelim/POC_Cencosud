package cl.prueba.util;

import cencosud.remuneraciones.Vendedor;

public class testRemu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vendedor vendedor =  new Vendedor();
		vendedor.setSueldo(100000);
		vendedor.setComision(15);
		System.out.println(vendedor.getSueldo() + ((vendedor.getSueldo() * vendedor.getComision())/100));

	}

}
