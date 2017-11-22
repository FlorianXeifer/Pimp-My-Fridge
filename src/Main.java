import controller.*;
import model.*;
import view. *;

public class Main {

  public static void main(String[] args) {
    //Instanciation de notre mod�le
	  try
      {
          (new TwoWaySerialComm()).connect("COM4");
      }
      catch ( Exception e )
      {
          // TODO Auto-generated catch block
          e.printStackTrace();
      }
    Model model = new Fridge();
    //Cr�ation du contr�leur
    Controller controler = new Controller();
    //Cr�ation de notre fen�tre avec le contr�leur en param�tre
    //Calculette calculette = new Calculette(controler);
    //Ajout de la fen�tre comme observer de notre mod�le
    model.AddFrigo();
  }
}