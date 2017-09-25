package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ExerciciosController {

	private Double resultado;
	private Double valor1;
	private Double valor2;
	public Double getResultado() {
		return resultado;
	}

	
	public Double exibirResultado() {
		return resultado;
	}
	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	public void somar() {
		resultado = valor1 + valor2;
		
	}

	public void subtrair() {
		resultado = valor1 - valor2;
	
	}

	public void dividir() {
		resultado = valor1/valor2;
		
	}

	public void multiplicar() {
		resultado = valor1 * valor2;
		
	}

	public Double getValor2() {
		return valor2;
	}

	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}

	public Double getValor1() {
		return valor1;
	}

	public void setValor1(Double valor1) {
		this.valor1 = valor1;
	}
}
