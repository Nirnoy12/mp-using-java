import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.util.*;
import javax.sound.sampled.*;
import javax.swing.*;
import javax.swing.border.Border;
public class mp{
    public static void main(String[] args)throws UnsupportedAudioFileException, IOException, LineUnavailableException{

        ImageIcon i = new ImageIcon("Premium Vector _ Blue and golden sound waves background.jpg");
        Border border = BorderFactory.createLineBorder(new Color(0x330099),6);
        JLabel l = new JLabel();
        l.setText("FEEL THE MUSIC");
        l.setIcon(i);
        l.setHorizontalTextPosition(JLabel.CENTER);
        l.setVerticalTextPosition(JLabel.BOTTOM);
        l.setForeground(new Color(0xFF2400));
        l.setFont(new Font("MV Boil",Font.BOLD,80));
        l.setIconTextGap(10);
        l.setBackground(Color.BLACK);
        l.setOpaque(true);
        l.setBorder(border);
        l.setVerticalAlignment(JLabel.TOP);
        l.setHorizontalAlignment(JLabel.CENTER);

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setVisible(true);
        f.add(l);
        f.pack();

        Scanner sc=new Scanner(System.in);

        File fi=new File("fun-punk-opener-14343.wav");

        AudioInputStream as=AudioSystem.getAudioInputStream(fi);

        Clip c=AudioSystem.getClip();

        c.open(as); 

        String res ="";
         
        while(!res.equals("Q")){
            System.out.println("P = PLAY , S = STOP , R = REPLAY , Q = QUIT");
            System.out.println("ENTER YOUR CHOICE");

            res=sc.next();
            res=res.toUpperCase();

            switch (res) {

                case ("P"):c.start();
                    
                    break;

                case ("S"):c.stop();
                    
                    break;

                case ("R"):c.setMicrosecondPosition(0);
                    
                    break;

                case ("Q"):c.close();
                    
                    break;

                default:

                System.out.println("NOT A VALID INPUT");
                    break;
            }
        }
        System.out.println("DON'T FORGET TO USE THE MUSIC PLAYER AGAIN : BYEEE");
    }
}