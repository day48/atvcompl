iimport javax.swing.JOptionPane;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nomeUser = JOptionPane.showInputDialog("Informe o seu nome");
        String nomeBanco = JOptionPane.showInputDialog("Informe o nome do Banco");

        Banco b = new Banco();

        ArrayList<Conta> Dados = new ArrayList<>();
        try {
            Scanner leitor = new Scanner(new File("C:/Users/rodrigo.camargos/Desktop/Nova pasta/Contas.txt"));
            while (leitor.hasNextLine()) {
                String dadosConta = leitor.nextLine();
                String[] dado = dadosConta.split(",");
                Conta c = new Conta();
                c.setNumero(Integer.parseInt( dado[0]));
                c.setAgencia(Integer.parseInt( dado[1]));
                c.setSaldo(Integer.parseInt( dado[3]));

                b.contas.add(c);


                //Quebrar o nome usando split


            }
            leitor.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
        }




        System.out.println("Lista de clientes:");
        for ( Dados : Dados) {
            System.out.println(Dados);
        }
    }
}