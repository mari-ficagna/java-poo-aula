/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooaula02exercicio2;

/**
 *
 * @author Mari (48) 99618-5728
 */
public class Aula {
    String conteudo;
    String duração;
    String data;
    boolean corfirmado;
    String local;
    int numero;
    
    void status (){
        System.out.println("Aula "+this.numero);
        System.out.println("");
        System.out.println("Conteúdo: "+this.conteudo);
        System.out.println("Data: "+this.data);
        System.out.println("Duração: "+this.duração);
        System.out.println("Local: "+this.local);
        System.out.println("");
        System.out.println("Confirmado? "+this.corfirmado);
        System.out.println("");
    }
    void confirmacao(){
        
    }
    
}
