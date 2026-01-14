import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Random;

public class Whackmole {
    int boardWidth = 600;
    int boardHeight =650;
    JFrame frame = new JFrame("Mario: Whack A Mole");

    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JButton retryButton;

    JPanel gridPanel = new JPanel();
    JButton[] board =  new JButton[9];

    ImageIcon plantIcon;
    ImageIcon moleIcon;
    ImageIcon retryIcon;

    JButton currMoleTile;
    JButton currPlantTile;

    Random random = new Random();
    Timer setMoleTimer;
    Timer setPlantTimer;

    int score;

    int moleSpeed,plantSpeed;

    Whackmole(){
        score = 0;
        moleSpeed = 1000;
        plantSpeed = 1300;
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textLabel.setFont(new Font("Arial",Font.PLAIN,40));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText("Score: " + Integer.toString(score));
        textLabel.setOpaque(true);

        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);
        frame.add(textPanel,BorderLayout.NORTH);

        gridPanel.setLayout(new GridLayout(3,3));
        frame.add(gridPanel);

        Image plantImg = new ImageIcon(getClass().getResource("./piranha.png")).getImage();
        plantIcon = new ImageIcon(plantImg.getScaledInstance(100,100, Image.SCALE_SMOOTH));

        Image moleImg = new ImageIcon(getClass().getResource("./monty.png")).getImage();
        moleIcon = new ImageIcon(moleImg.getScaledInstance(100,100, Image.SCALE_SMOOTH));

        Image retryImg = new ImageIcon(getClass().getResource("./retry.png")).getImage();
        retryIcon = new ImageIcon(retryImg.getScaledInstance(50,50,Image.SCALE_SMOOTH));
        retryButton = new JButton();
        retryButton.setIcon(retryIcon);
        retryButton.setContentAreaFilled(false);
        retryButton.setBorderPainted(false);
        retryButton.setFocusPainted(false);

        for (int i=0;i<9;i++){
            JButton tile = new JButton();
            board[i] = tile;
            gridPanel.add(tile);
            tile.setFocusable(false);


            tile.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton tile = (JButton) e.getSource();
                    if(tile==currMoleTile){
                        score+=10;
                        if(score%30==0){
                            moleSpeed = Math.max(600,(moleSpeed-50));
                            plantSpeed = Math.max(600,(plantSpeed-50));
                            setPlantTimer.setDelay(plantSpeed);
                            setMoleTimer.setDelay(moleSpeed);
                        }
                        textLabel.setText("Score: " + Integer.toString(score));
                        textPanel.revalidate();
                        textPanel.repaint();
                    } else if (tile == currPlantTile) {
                        textLabel.setText("Game Over: " + Integer.toString(score));
                        textPanel.add(retryButton,BorderLayout.EAST);
                        textPanel.revalidate();
                        textPanel.repaint();
                        setMoleTimer.stop();
                        setPlantTimer.stop();
                        for (int i=0;i<9;i++){
                            board[i].setEnabled(false);
                        }
                    }
                }
            });
        }

        retryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score = 0;
                textLabel.setText("Score: " + Integer.toString(score));
                textPanel.remove(retryButton);
                textPanel.revalidate();
                textPanel.repaint();
                plantSpeed = 1300;
                moleSpeed = 1000;
                setPlantTimer.setDelay(plantSpeed);
                setMoleTimer.setDelay(moleSpeed);
                setMoleTimer.start();
                setPlantTimer.start();
                for (int i=0;i<9;i++){
                    board[i].setEnabled(true);
                }
            }
        });

        setMoleTimer = new Timer(moleSpeed, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(currMoleTile!=null){
                    currMoleTile.setIcon(null);
                    currMoleTile = null;
                }
                int num = random.nextInt(9);
                JButton tile = board[num];
                if(tile==currPlantTile){
                    return;
                }
                currMoleTile = tile;
                currMoleTile.setIcon(moleIcon);

            }
        });

        setPlantTimer = new Timer(plantSpeed, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(currPlantTile!=null){
                    currPlantTile.setIcon(null);
                    currPlantTile = null;
                }
                int num = random.nextInt(9);
                JButton tile = board[num];
                if(tile == currMoleTile){
                    return;
                }
                tile.setIcon(plantIcon);
                currPlantTile = tile;
            }
        });

        setPlantTimer.start();
        setMoleTimer.start();
        frame.setVisible(true);
    }
}
