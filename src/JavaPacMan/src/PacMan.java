package JavaPacMan.src;

import JavaPacMan.src.Board;
import javax.swing.JFrame;

public class PacMan extends JFrame
{

  public PacMan()
  {
    add(new Board());
    setTitle("Pacman");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(380, 420);
    //setSize(500, 600);
    setLocationRelativeTo(null);
    setVisible(true);
  }

  public static void main(String[] args) {
      new PacMan();
  }
}
