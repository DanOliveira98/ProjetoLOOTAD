/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoloo;

import javax.swing.JOptionPane;

/**
 *
 * @author Danie
 */
public class SistemaSenhas {
    public static void main(String args[]){
        ProjetoLOO pl = new ProjetoLOO();
        
        int esc = 0;
        do{
            try {
                esc = Integer.parseInt(JOptionPane.showInputDialog("1- Adicionar nova Senha\n 2- Proxima senha\n 3- Verificar Tamanho da Fila\n 4-Deletar Prioridade Chamada\n 5- Sair"));
            switch(esc){
                case 1:
                  int x = Integer.parseInt(JOptionPane.showInputDialog("Informe Qual Usuario você é:\n 1- Visitante ou Professor\n 2- Aluno\n 3- Maiores de 60 anos, deficiente e gestante"));
                    switch(x){
                        case 1:
                            Object p = pl.getX();
                            pl.add(p, 3);
                            break;
                        case 2:
                            Object p1 = pl.getX();
                            pl.add(p1, 2);
                            break;
                        case 3:
                            Object y = pl.getX();
                            pl.add(y, 1);
                            break;
                        
                    }
                    break;
                case 2:
                    if(pl.p1 != 0){
                    pl.ChamarRecP1(pl.first);
                    }else if(pl.p2 != 0){
                    pl.ChamarRecP2(pl.first);
                    }else{
                    pl.ChamarRecP3(pl.first);
                    }
                    break;
                case 3:
                    pl.size();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Obrigado Por Usar Nosso sistema!");
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Informe uma Opção Valida");
            }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "INFORME UM VALOR NUMERICO");
            }
            }while(esc!=4);
        }
        }
