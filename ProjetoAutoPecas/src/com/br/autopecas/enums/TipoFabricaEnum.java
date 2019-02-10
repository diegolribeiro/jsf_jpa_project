package com.br.autopecas.enums;

public enum TipoFabricaEnum {
	MATRIZ(0), FILIAL(1), CD(2);

	private int valor;

	private TipoFabricaEnum(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

}
