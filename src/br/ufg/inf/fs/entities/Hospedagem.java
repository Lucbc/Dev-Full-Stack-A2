package br.ufg.inf.fs.entities;

import java.sql.Date;

public class Hospedagem {
	
	private int id_hospedagem;
	private int id_quarto;
	private int id_hospede;
	private Date dt_checkin;
	private Date dt_checkout;
	
	public Hospedagem() {
		super();

	}
	
	public Hospedagem(int id_hospedagem, int id_quarto, int id_hospede, Date dt_checkin, Date dt_checkout) {
		super();
		this.id_hospedagem = id_hospedagem;
		this.id_quarto = id_quarto;
		this.id_hospede = id_hospede;
		this.dt_checkin = dt_checkin;
		this.dt_checkout = dt_checkout;
	}

	public int getId_hospedagem() {
		return id_hospedagem;
	}

	public void setId_hospedagem(int id_hospedagem) {
		this.id_hospedagem = id_hospedagem;
	}

	public int getId_quarto() {
		return id_quarto;
	}

	public void setId_quarto(int id_quarto) {
		this.id_quarto = id_quarto;
	}

	public int getId_hospede() {
		return id_hospede;
	}

	public void setId_hospede(int id_hospede) {
		this.id_hospede = id_hospede;
	}

	public java.sql.Date getDt_checkin() {
		return dt_checkin;
	}

	public void setDt_checkin(Date dt_checkin) {
		this.dt_checkin = dt_checkin;
	}

	public Date getDt_checkout() {
		return dt_checkout;
	}

	public void setDt_checkout(Date dt_checkout) {
		this.dt_checkout = dt_checkout;
	}

	@Override
	public String toString() {
		return "Hospedagem [id_hospedagem=" + id_hospedagem + ", id_quarto=" + id_quarto + ", id_hospede=" + id_hospede
				+ ", dt_checkin=" + dt_checkin + ", dt_checkout=" + dt_checkout + "]";
	}
	

}
