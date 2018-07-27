package bean;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import model.Administrador;

@Named
@ViewScoped
public class AdministradorMB implements Serializable
{
	private Administrador administrador;
	
	public Administrador getAdministrador()
	{
		return administrador;
	}

	public void setAdministrador(Administrador administrador)
	{
		this.administrador = administrador;
	}
	
	
}
