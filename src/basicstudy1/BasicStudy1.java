/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicstudy1;

/**
 *
 * @author brusi
 */
public class BasicStudy1 {

    public static void main(String[] args) {
        
        Ninja Kakashi = new Ninja();
        Kakashi.nome = "Kakashi";
        Kakashi.idade = 30;
        Kakashi.aldeia = "Vila da Folha";
        
        System.out.println(Kakashi.nome);
        Kakashi.Attack();
    }
        
}
