package br.com.fiap.cultiva.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
@Entity
public class Harvests {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="O nome do plantio é obrigatório")
	private String harvest;
	
	@NotBlank(message = "Quantidade deve ser maior que 0")
	private String quantity;
	
	@Pattern(regexp = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((?:19|20)[0-9][0-9])", message = "Formato esperado: dd/mm/aaaa")
	private String dtharvest;

	@Pattern(regexp = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((?:19|20)[0-9][0-9])", message = "Formato esperado: dd/mm/aaaa")
	private String dtexpiration;
	
	@NotBlank(message = "Produto de troca deve ser preenchido")
	private String exchangeitem;
	
	@NotBlank(message="Insira no formato: dd/mm/aaaa-HH:mm")
	private String exchangetimes;

}
