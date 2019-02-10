package com.br.autopecas.main;

import com.br.autopecas.enums.TipoFabricaEnum;

public class TestaEnum {

	public static void main(String[] args) {

		
		System.out.println(TipoFabricaEnum.CD.toString());
		System.out.println(TipoFabricaEnum.FILIAL);
		System.out.println(TipoFabricaEnum.valueOf(TipoFabricaEnum.class, "MATRIZ"));
		System.out.println(TipoFabricaEnum.FILIAL.ordinal());
		// PERCORRENDO VALORES
		for (TipoFabricaEnum f : TipoFabricaEnum.values()) {
			
			System.out.println( f.name() + ": equivalente ao valor: " + f.getValor());
		}

	}
}

