package pilha;
import javax.swing.JOptionPane;

public class MainPilha {
    public static void main(String args[]){
        Pilha pl = new Pilha();
        
        int esc = 0;
        do{
            try {
                esc = Integer.parseInt(JOptionPane.showInputDialog("1- Adicionar nova Processo\n2-Desempilhar\n4 - Sair"));
            switch(esc){
                case 1:
                  int x = Integer.parseInt(JOptionPane.showInputDialog("Informe O que você irá fazer:1-Inscrição\n2-Renovação\n3-Trancamento"));
                    switch(x){
                        case 1:
                            pl.push(3);
                            break;
                        case 2:
                            pl.push(2);
                            break;
                        case 3:
                            pl.push(1);
                            break;
                    }
                    break;
                case 2:
                	pl.pop();
                	break;
                case 3:
                    pl.pop();
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
