package br.unifor.natanbarber;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.unifor.natanbarber.model.Curriculo;
import br.unifor.natanbarber.model.CurriculoApoio;
import br.unifor.natanbarber.model.CurriculoBarbeiro;
import br.unifor.natanbarber.model.CurriculoTI;
import br.unifor.natanbarber.model.Diploma;
import br.unifor.natanbarber.model.Funcionario;


@SpringBootApplication
public class NatanbarberApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NatanbarberApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Diploma cienciaComputacao = new Diploma("Bacharel em Ciência da Computação", "Universidade de Fortaleza", LocalDate.of(2018, 1, 1), null, "Graduação");
		
		Funcionario siwan = new Funcionario("079.079.079.79", "Siwan Eden");
		siwan.adicionarDiploma(cienciaComputacao);
		
		Curriculo curriculoSiwan = new CurriculoTI(siwan);

		// Funcionario yuri = new Funcionario("060.060.060.60", "Yuri Cortez");
		// Funcionario felipe = new Funcionario("111.111.111-11", "Felipe Ben-hur");

		// Curriculo curriculoYuri = new CurriculoBarbeiro(yuri);
		// Curriculo curriculoFelipe = new CurriculoApoio(felipe);
	}

}
