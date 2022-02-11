package com.algaworks.crm.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Entidade para ser mapeada em uma tabela de BD
@Entity
public class Cliente {
	
	//identificando o id no BD como se fosse uma chave primaria
	@Id
	//Delegando a resposabilidade para o BD gerar o id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//È obrigatorio preencher a informação
	@Column(nullable = false)
	private String pacote;

	//È obrigatorio preencher a informação
	@Column(nullable = false)
	private String origuem;
		
	//È obrigatorio preencher a informação
	@Column(nullable = false)
	private String destino;
			
	
	//È obrigatorio preencher a informação
	@Column(nullable = false)
	private String data_inda;
		
		
	private String data_volta;
	
	
	//È obrigatorio preencher a informação
	@Column(nullable = false)
	private String cartao_passagens;
		
		
	//È obrigatorio preencher a informação
	@Column(nullable = false)
	private String cidade;
		
	//È obrigatorio preencher a informação
	@Column(nullable = false)
	private String hotel;
	
	//È obrigatorio preencher a informação
	@Column(nullable = false)
	private String data_entrada;
	
	//È obrigatorio preencher a informação
	@Column(nullable = false)
	private String data_saida;
	
	//È obrigatorio preencher a informação
	@Column(nullable = false)
	private String numero_de_quartos;
	
	//È obrigatorio preencher a informação
	@Column(nullable = false)
	private String cartao_hospedagem;
	
	
	//Metodos Get e Set
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPacote() {
		return pacote;
	}

	public void setPacote(String pacote) {
		this.pacote = pacote;
	}

	public String getOriguem() {
		return origuem;
	}

	public void setOriguem(String origuem) {
		this.origuem = origuem;
	}

	
	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public String getData_inda() {
		return data_inda;
	}

	public void setData_inda(String data_inda) {
		this.data_inda = data_inda;
	}

	public String getData_volta() {
		return data_volta;
	}

	public void setData_volta(String data_volta) {
		this.data_volta = data_volta;
	}

	public String getCartao_passagens() {
		return cartao_passagens;
	}

	public void setCartao_passagens(String cartao_passagens) {
		this.cartao_passagens = cartao_passagens;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public String getData_entrada() {
		return data_entrada;
	}

	public void setData_entrada(String data_entrada) {
		this.data_entrada = data_entrada;
	}

	public String getData_saida() {
		return data_saida;
	}

	public void setData_saida(String data_saida) {
		this.data_saida = data_saida;
	}

	public String getNumero_de_quartos() {
		return numero_de_quartos;
	}

	public void setNumero_de_quartos(String numero_de_quartos) {
		this.numero_de_quartos = numero_de_quartos;
	}

	public String getCartao_hospedagem() {
		return cartao_hospedagem;
	}

	public void setCartao_hospedagem(String cartao_hospedagem) {
		this.cartao_hospedagem = cartao_hospedagem;
	}

	
	//Metedos hashCOde() e equals()
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	

}
