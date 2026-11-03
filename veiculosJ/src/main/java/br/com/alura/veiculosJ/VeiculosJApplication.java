package br.com.alura.veiculosJ;

import br.com.alura.veiculosJ.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VeiculosJApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VeiculosJApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Principal principal = new Principal();
		principal.exibirMenu();

	}
}
