package br.ufg.inf.fs.entities;

import java.sql.Date;

public class Hospede {
	
	private int id_hospede;
	private String nm_hospede;
	private Date dt_nascimento;
	private int cpf;
	public Hospede() {
		super();
	}
	public Hospede(int id_hospede, String nm_hospede, Date dt_nascimento, int cpf) {
		super();
		this.id_hospede = id_hospede;
		this.nm_hospede = nm_hospede;
		this.dt_nascimento = dt_nascimento;
		this.cpf = cpf;
	}
	public int getId_hospede() {
		return id_hospede;
	}
	public void setId_hospede(int id_hospede) {
		this.id_hospede = id_hospede;
	}
	public String getNm_hospede() {
		return nm_hospede;
	}
	public void setNm_hospede(String nm_hospede) {
		this.nm_hospede = nm_hospede;
	}
	public Date getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "Hospede [id_hospede=" + id_hospede + ", nm_hospede=" + nm_hospede + ", dt_nascimento=" + dt_nascimento
				+ ", cpf=" + cpf + "]";
	}


}
