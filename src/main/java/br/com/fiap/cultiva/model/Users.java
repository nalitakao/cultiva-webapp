package br.com.fiap.cultiva.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Users {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Inserir seu nome é obrigatório")
	private String name;
	
	@Pattern(regexp = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((?:19|20)[0-9][0-9])", message = "Formato esperado: dd/mm/aaaa")
	private String birthday;
	
	@Email @NotBlank(message = "Por favor, insira um e-mail válido")
	private String email;
	
	@Size(min=14, max=14, message = "Digitação esperada: xxx.xxx.xxx-xx")
	private String cpf;
	
	@NotBlank(message = "Telefone é um campo obrigatório")
	private String phone;
	
	@NotBlank(message = "Endereço é um campo obrigatório")
	private String adress;
	
	@NotBlank(message = "Senha é um campo obrigatório")
	private String password;
	
	@NotBlank(message = "Insira qual o tipo da sua horta")
	private String gardentype;

}
