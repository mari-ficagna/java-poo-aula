/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooaula02exercicio2;

/**
 *
 * @author Mari (48) 99618-5728
 */
public class POOAula02Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aula a1 = new Aula();
        a1.numero = 1;
        a1.conteudo = "Objetos";
        a1.data = "02/02/2023";
        a1.duração = "1h30min";
        a1.local = "Online";
        a1.corfirmado = true;
        
        a1.status();
        
        Aula a2 = new Aula();
        a2.numero = 2;
        a2.conteudo = "Classes";
        a2.data = "03/02/2023";
        a2.local = "Presencial - Escola da Mari";
        a2.corfirmado = false;
        
        a2.status();
    }
    
}
