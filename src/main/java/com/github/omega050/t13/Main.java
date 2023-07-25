package com.github.omega050.t13;
import java.util.Date;

public class Main {//gerado com auxilio do Chat GPT apenas para fins de teste das classes criadas
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Hospital Geral", "Rua Principal, 123");
        Medico medico = new Medico("Dr. João Silva", 12345, "Cardiologia", 5000.0, 1);
        Paciente paciente = new Paciente("Alice Smith", 123456789);
        Date dataConsulta = new Date();
        Consulta consulta = new Consulta(medico, paciente, dataConsulta);

        hospital.agendarConsulta(paciente, medico);

        Medico medicoResponsavel = consulta.getMedico();
        Paciente pacienteAtendido = consulta.getPaciente();
        Date dataC = consulta.getDataConsulta();

        System.out.println("Detalhes da Consulta:");
        System.out.println("Médico: " + medicoResponsavel.getNome());
        System.out.println("Paciente: " + pacienteAtendido.getNome());
        System.out.println("Data: " + dataC);

        Medicamento medicamento = new Medicamento("Paracetamol", "Acetaminofeno", "Analgésico", 100);

        Estoque estoque = new Estoque(medicamento);
        estoque.getMedicamentos().add(medicamento);


        Medicamento medicamentoSimilar1 = new Medicamento("Ibuprofeno", "Ibuprofeno", "Analgésico", 50);
        Medicamento medicamentoSimilar2 = new Medicamento("Aspirina", "Ácido Acetilsalicílico", "Analgésico", 75);
        medicamento.addSimilares(medicamentoSimilar1);
        medicamento.addSimilares(medicamentoSimilar2);

        System.out.println("\nDetalhes do Medicamento:");
        System.out.println("Nome: " + medicamento.getNome());
        System.out.println("Princípio Ativo: " + medicamento.getPrincipioAtivo());
        System.out.println("Descrição: " + medicamento.getDescricao());
        System.out.println("Quantidade em Estoque: " + medicamento.getQuantidade());
        System.out.println("Medicamentos Similares: " + medicamento.getSimilares());

        Receita receita = new Receita(medicamento, medico, dataConsulta, "Conforme necessário");

        Medicamento medicamentoAdicional = new Medicamento("Antibiótico", "Amoxicilina", "Antibiótico", 20);
        receita.addMed(medicamentoAdicional);

        System.out.println("\nDetalhes da Receita:");
        System.out.println("Médico Responsável: " + receita.getMedicoResponsvel().getNome());
        System.out.println("Medicamentos: " + receita.getReceitaMedica());
        System.out.println("Válida até: " + receita.getValidade());
        System.out.println("Uso: " + receita.getUso());
    }
}
