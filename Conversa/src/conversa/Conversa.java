/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversa;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Conversa{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        
        Paquerador p = new Paquerador();
        Pessoa j = new Pessoa();
                
        p.nome = "Joseph";
        p.idade = 23;
        p.nomedaMae = "Joliene Joestar";
        
        j.nome = "Emilia";
        j.idade = 17;
        j.nomedaMae = "Sophie Soares";
        
        p.saudacao(j.nome);
        j.saudacao(p.nome);
        
        p.perguntaIdade(j.nome);
        j.respondeIdade(j.idade);
        
        j.perguntaIdade(p.nome);
        p.respondeIdade(p.idade);
        
        j.perguntaNomeMae(p.nome);
        p.respondeNomeMae(p.nomedaMae);
        
        p.perguntaNomeMae(j.nome);
        j.respondeNomeMae(j.nomedaMae);
        
        
        String resp = "";
        
        do {
            System.out.println("Deseja fazer uma cantada?(S/N)");
            resp = scan.nextLine();
            
            if(resp.equals("S"))
            {
                p.cantada(j.nome);
                j.sentimento = "nojinho";
            }
            else if(resp.equals("N"))
            {
                j.sentimento = "Felicidade";
            }
            else 
            {
                System.out.println("Caracter inválido!");
            }
            
        }while(resp == "S" || resp == "N");
        
        j.sentimentoMetodo(j.sentimento);
        
    }
    
}
