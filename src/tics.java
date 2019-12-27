import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;


class tics extends lines{
    private int[][] map = new int[3][3];
     private int[][] moves = new int[3][3];
     private int count = 0;


    tics() {
        JLabel lab1 = new JLabel("");
        lab1.setBounds(30,0,200,200);
        lab1.setFont(new Font("Serif", Font.PLAIN, 200));

        JLabel lab2 = new JLabel("");
        lab2.setBounds(230,0,200,200);
        lab2.setFont(new Font("Serif", Font.PLAIN, 200));

        JLabel lab3 = new JLabel("");
        lab3.setBounds(440,0,200,200);
        lab3.setFont(new Font("Serif", Font.PLAIN, 200));

        JLabel lab4 = new JLabel("");
        lab4.setBounds(30,200,200,200);
        lab4.setFont(new Font("Serif", Font.PLAIN, 200));

        JLabel lab5 = new JLabel("");
        lab5.setBounds(230,200,200,200);
        lab5.setFont(new Font("Serif", Font.PLAIN, 200));

        JLabel lab6 = new JLabel("");
        lab6.setBounds(440,200,200,200);
        lab6.setFont(new Font("Serif", Font.PLAIN, 200));

        JLabel lab7 = new JLabel("");
        lab7.setBounds(30,400,200,200);
        lab7.setFont(new Font("Serif", Font.PLAIN, 200));

        JLabel lab8 = new JLabel("");
        lab8.setBounds(230,400,200,200);
        lab8.setFont(new Font("Serif", Font.PLAIN, 200));

        JLabel lab9 = new JLabel("");
        lab9.setBounds(440,400,200,200);
        lab9.setFont(new Font("Serif", Font.PLAIN, 200));
        add(lab1);
        add(lab2);
        add(lab3);
        add(lab4);add(lab9);
        add(lab5);add(lab8);
        add(lab6);add(lab7);


        for(int i = 0; i < 3; ++i){
            for(int j = 0; j < 3; ++j){
                map[i][j] = 0;
            }
        }
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                if ((mouseEvent.getX() >= 0 && mouseEvent.getX() < 200) && (mouseEvent.getY() >= 0 && mouseEvent.getY() < 200)){
                    if (canPlace(mouseEvent.getX(),mouseEvent.getY())){
                        moves[0][0] = 1;
                        count++;
                        if(count%2 == 0){
                            lab1.setText("O");
                        }else{
                            lab1.setText("X");
                        }
                    }
                }else if ((mouseEvent.getX() > 200 && mouseEvent.getX() < 400) && (mouseEvent.getY() >= 0 && mouseEvent.getY() < 200)){
                    if (canPlace(mouseEvent.getX(),mouseEvent.getY())){
                        moves[0][1] = 1;
                        count++;
                        if(count%2 == 0){
                            lab2.setText("O");
                        }else{
                            lab2.setText("X");
                        }
                    }
                } else if ((mouseEvent.getX() > 400 && mouseEvent.getX() < 600) && (mouseEvent.getY() >= 0 && mouseEvent.getY() < 200)){
                    if (canPlace(mouseEvent.getX(),mouseEvent.getY())){
                        moves[0][2] = 1;
                        count++;
                        if(count%2 == 0){
                            lab3.setText("O");
                        }else{
                            lab3.setText("X");
                        }
                    }
                }else if ((mouseEvent.getX() >= 0 && mouseEvent.getX() < 200) && (mouseEvent.getY() > 200 && mouseEvent.getY() < 400)){
                    if (canPlace(mouseEvent.getX(),mouseEvent.getY())){
                        moves[1][0] = 1;
                        count++;
                        if(count%2 == 0){
                            lab4.setText("O");
                        }else{
                            lab4.setText("X");
                        }

                    }
                }else if ((mouseEvent.getX() > 200 && mouseEvent.getX() < 400) && (mouseEvent.getY() > 200 && mouseEvent.getY() < 400)){
                    if (canPlace(mouseEvent.getX(),mouseEvent.getY())){
                        moves[1][1] = 1;
                        count++;
                        if(count%2 == 0){
                            lab5.setText("O");
                        }else{
                            lab5.setText("X");
                        }
                    }
                }else if ((mouseEvent.getX() > 400 && mouseEvent.getX() < 600) && (mouseEvent.getY() > 200 && mouseEvent.getY() < 400)){
                    if (canPlace(mouseEvent.getX(),mouseEvent.getY())){
                        moves[1][2] = 1;
                        count++;
                        if(count%2 == 0){
                            lab6.setText("O");
                        }else{
                            lab6.setText("X");
                        }
                    }
                }else if ((mouseEvent.getX() >= 0 && mouseEvent.getX() < 200) && (mouseEvent.getY() > 400 && mouseEvent.getY() < 600)){
                    if (canPlace(mouseEvent.getX(),mouseEvent.getY())){
                        moves[2][0] = 1;
                        count++;
                        if(count%2 == 0){
                            lab7.setText("O");
                        }else{
                            lab7.setText("X");
                        }
                    }
                }else if ((mouseEvent.getX() > 200 && mouseEvent.getX() < 400) && (mouseEvent.getY() > 400 && mouseEvent.getY() < 600)){
                    if (canPlace(mouseEvent.getX(),mouseEvent.getY())){
                        moves[2][1] = 1;
                        count++;
                        if(count%2 == 0){
                            lab8.setText("O");
                        }else{
                            lab8.setText("X");
                        }
                    }
                }else if ((mouseEvent.getX() > 400 && mouseEvent.getX() < 600) && (mouseEvent.getY() > 400 && mouseEvent.getY() < 600)){
                    if (canPlace(mouseEvent.getX(),mouseEvent.getY())){
                        moves[2][2] = 1;
                        count++;
                        if(count%2 == 0){
                            lab9.setText("O");
                        }else{
                            lab9.setText("X");
                        }
                    }
                }
            }
        });
    }


    private boolean canPlace(int x, int y){
        if ( ((x >= 0 && x < 200) && (y >= 0 && y < 200)) && (moves[0][0] == 1)){
            return false;
        } else if ( ((x > 200 && x < 400) && (y >= 0 && y < 200)) && (moves[0][1] == 1)){
            return false;
        }
        else if ( ((x > 400 && x < 600) && (y >= 0 && y < 200)) && (moves[0][2] == 1)){
            return false;
        }
        else if ( ((x >= 0 && x < 200) && (y > 200 && y < 400)) && (moves[1][0] == 1)){
            return false;
        }
        else if ( ((x >= 200 && x < 400) && (y > 200 && y < 400)) && (moves[1][1] == 1)){
            return false;
        }
        else if ( ((x >= 400 && x < 600) && (y > 200 && y < 400)) && (moves[1][0] == 1)){
            return false;
        }
        else if ( ((x >= 0 && x < 200) && (y > 400 && y < 600)) && (moves[2][0] == 1)){
            return false;
        }else if ( ((x > 200 && x < 400) && (y > 400 && y < 600)) && (moves[2][1] == 1)){
            return false;
        }else return ((x <= 400 || x >= 600) || (y <= 400 || y >= 600)) || (moves[2][2] != 1);
    }





}
