/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaarraylist;

import java.util.ArrayList;

/**
 *
 * @author ranielly
 */
public class PrincipalAluno {
    public static void main(String[] args){
        
        Aluno ian =  new Aluno();
        ian.setNome("Ian");
        ian.setSobrenome("Raicar");
        ian.setCurso("ADS");
        ian.setRA("123456789-98");
        ian.setAnoIngresso(2023);
        ian.setPrevisaoTempo(2030);
        
        Aluno ranielly =  new Aluno();
        ranielly.setNome("Ranielly");
        ranielly.setSobrenome("Ferreira");
        ranielly.setCurso("ADS");
        ranielly.setRA("987654321-14");
        ranielly.setAnoIngresso(2023);
        ranielly.setPrevisaoTempo(2026);
        
        Aluno paulo =  new Aluno();
        paulo.setNome("Paulo");
        paulo.setSobrenome("Junior");
        paulo.setCurso("ADS");
        paulo.setRA("333444888-99");
        paulo.setAnoIngresso(2023);
        paulo.setPrevisaoTempo(2026);
        
        ArrayList<Aluno> lista = new ArrayList();
        lista.add(ian);
        lista.add(ranielly);
        lista.add(paulo);
        
        for(Aluno aux : lista){
            
            System.out.println("Nome e Sobrenome: " + aux.getNome() + 
                    " " + aux.getSobrenome());
            System.out.println("Curso: " + aux.getCurso());
            System.out.println("RA: " + aux.getRA());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        
        
    }
}
