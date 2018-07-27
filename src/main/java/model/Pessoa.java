/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @NotNull @Size(max=35)
    @Column(nullable=false, length=35)
    private String nome;
    @NotNull @Size(max=35)
    @Column(nullable=false, length=35)
    private String sobrenome;
    @NotNull @Size(max=35)
    @Column(nullable=false) @Temporal(TemporalType.TIMESTAMP)
    private Date dataNascimento;
    @NotNull @Size(max=35)
    @Column(nullable=false, length=35)
    private String email;
    @NotNull @Size(max=16)
    @Column(nullable=false, length=16)
    private String senha;
    //NAO SEI COMO QUE FAZ - PESQUISAR
    private byte[] foto;

	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getSobrenome()
	{
		return sobrenome;
	}
	public void setSobrenome(String sobrenome)
	{
		this.sobrenome = sobrenome;
	}
	public Date getDataNascimento()
	{
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento)
	{
		this.dataNascimento = dataNascimento;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getSenha()
	{
		return senha;
	}
	public void setSenha(String senha)
	{
		this.senha = senha;
	}
	public byte[] getFoto()
	{
		return foto;
	}
	public void setFoto(byte[] foto)
	{
		this.foto = foto;
	}
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id == null)
		{
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
