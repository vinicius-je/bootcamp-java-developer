package me.dio.academia.digital.entity.form;

import me.dio.academia.digital.entity.Aluno;

public class AvaliacaoFisicaForm {

  private Long alunoId;

  private double peso;

  private double altura;

  public Long getAlunoId() {
    return alunoId;
  }

  public void setAlunoId(Long alunoId) {
    this.alunoId = alunoId;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }
}
