//Ball without threads
package Threads;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class BounceFrame extends JFrame {

    private JPanel canvas;
    private JButton startButton;
    private JButton stopButton;
    private JButton closeButton;
    private Ball ball;
    private ArrayList<Ball> balls = new ArrayList();
    
    public BounceFrame() {

        setSize(300, 200);
        setTitle("Bounce");
        canvas = new JPanel();
        add(canvas, "Center");

        JPanel buttonPanel = new JPanel();
        startButton = new JButton("Start");
        closeButton = new JButton("Close");
        stopButton = new JButton("Stop");

        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(closeButton);

        ButtonHandler handler = new ButtonHandler();

        startButton.addActionListener(handler);
        stopButton.addActionListener(handler);
        closeButton.addActionListener(handler);

        add(buttonPanel, "South");
    }

    private class ButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == startButton) {
                ball = new Ball(canvas);
                balls.add(ball);
                Thread t1 = new Thread(ball);
                t1.start();
                //ball.bounce();
            }else if (event.getSource() == stopButton) {
                //balls.get(balls.lastIndexOf(ball)).setRunning(false);

                for(Ball b : balls){
                    b.setRunning(false);
                }


            } else if (event.getSource() == closeButton) {
                System.exit(0);
            }
        }
    }
    
    public static void main(String[] args) {
        BounceFrame frame = new BounceFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
