import javax.swing.*;

public class HelloWorldAnimation {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Hello World Animation");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel label = new JLabel("Hello World");
    frame.add(label);
    frame.setSize(200, 100);
    frame.setVisible(true);

    for (int i = 0; i < 100; i++) {
      label.setLocation(label.getX() + 1, label.getY() + 1);
      try {
        Thread.sleep(50);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}