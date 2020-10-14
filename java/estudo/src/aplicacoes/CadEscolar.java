package aplicacoes;

import java.util.Scanner;

import entidades.Aluno;
import entidades.Professores;

public class CadEscolar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Professores primeiro = new Professores();
		char info;
		Aluno aluno = new Aluno();
		String situacao = " ";
		
		/*System.out.print("Digite seu Nome: ");
		primeiro.nome = leia.next().toUpperCase();
		System.out.print("Digite M para Masculino F para Feminino e O para outros :");
		primeiro.sexo = leia.next().toUpperCase().charAt(0);
		System.out.print("Digite a Especialidade: ");
		primeiro.especialidade = leia.next();
		System.out.print("Digite o Ano de Nascimento :");
		primeiro.anoNasc = leia.nextInt();
		System.out.print("O professor é F-fixo ou C-convidado :");
		info = leia.next().toUpperCase().charAt(0);
		if (info == 'C') {
			primeiro.convidado = true;
			
		} else {
			primeiro.convidado = false;
		}
		
		System.out.println("DADOS DO PRIMEIRO PROFESSOR:");
		System.out.println("Nome: " +primeiro.nome);
		System.out.print("Sexo: ");
		System.out.println((primeiro.opc=='F')?"Feminino":(primeiro.sexo=='M')?"Masculino":"Outros");
		System.out.println("Idade: "+(2020-primeiro.anoNasc));*/
		
		
		
		System.out.print("Digite o nome do aluno: ");
		aluno.nome = leia.next().toUpperCase();
		System.out.print("Digite M - masculino, F - feminino ou O - outros: ");
		aluno.sexo = leia.next().toUpperCase().charAt(0);
		System.out.print("Digite o ano de nascimento: ");
		aluno.anoNascimento = leia.nextInt();
		System.out.print("Digite o nome curso: ");
		aluno.curso = leia.next().toUpperCase();
		System.out.print("Digite a nota geral: ");
		aluno.notaGeral = leia.nextInt();
		
		
		System.out.println("PRIMEIRO ALUNO");
		System.out.println("Nome: " + aluno.nome);
		System.out.print("Sexo: ");
		System.out.println((aluno.sexo=='F')?"Feminino":(aluno.sexo=='M')?"Masculino":"Outros");
		System.out.println("Idade: " + (2020 - aluno.anoNascimento));
		System.out.println("Curso: " + aluno.curso);
		System.out.println("Nota geral: " +aluno.notaGeral);
		
		if(aluno.notaGeral >= 5) {
			situacao = "Aprovado";
		}else {
			situacao = "Reprovado";
		}
		System.out.println("Situação: " + situacao);
		

	}

}
