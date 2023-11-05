package service;
import java.util.Date;
public class Compte {
	private int code;
	private double solde;
	private Date date;
	public Compte(int co, double s, Date dateC) {
		code = co;
		solde = s;
		date = dateC;}
	public int getCode() {
		return code;
	}
	public void setCode(int co) {
	   code = co;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double so) {
	    solde = so;
	}
	public Date getDateCreation() {
		return date;
	}
	public void setDateCreation(Date dateCreation) {
		date = dateCreation;
	}}