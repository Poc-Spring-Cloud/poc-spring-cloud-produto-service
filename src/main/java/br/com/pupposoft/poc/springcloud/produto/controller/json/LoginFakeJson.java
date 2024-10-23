package br.com.pupposoft.poc.springcloud.produto.controller.json;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString(exclude = {"password", "senha"})
public class LoginFakeJson {
	private String login;
	private String password;
	private String senha;
}
