package testes;

import javax.swing.JOptionPane;

public class MenuEnum {
  
  public static void main(String[] args) {
    switch(montaMenu()){

    }
  }
  private static int montaMenu() {
    String str = "";
    for(OpcoesMenu opcaoMenu : OpcoesMenu.values())
      str += opcaoMenu.getNumMenu()+ " " + 
      opcaoMenu.getTextoMenu() + "\n";

      return Integer.parseInt(JOptionPane.showInputDialog(str));
      
  }
}
