package br.com.pupposoft.poc.springcloud.gateway.produto.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pupposoft.poc.springcloud.gateway.produto.controller.json.LoginFakeJson;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin(origins = "*")//NOSONAR
@RequestMapping("poc/monitoramento/login/v1")
@RestController
@AllArgsConstructor
public class LoginFakeController {

	@PostMapping("fake-login")
	public String fakeLogin(@RequestBody(required = true) LoginFakeJson loginJson){
		
		log.info("Não deve logar password nem senha. loginJson={}", loginJson);
		
		
		return "fake-token";
	}
}
