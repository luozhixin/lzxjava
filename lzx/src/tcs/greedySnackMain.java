package tcs;/**
 * @Auther:zhixin.Luo
 * @Date: 2019/11/13 16:12
 * @Description:
 */

import javax.swing.JFrame;

public class greedySnackMain extends JFrame {
    snackWin snackwin;
    static final int Width = 800 , Height = 600 , LocX = 10 , LocY = 100;

    public greedySnackMain() {
        super("GreedySncak_SL");
        snackwin = new snackWin();
        //��JFrame���������������������
        add(snackwin);
        //��������Ĵ�С
        this.setSize(Width, Height);
        //��������Ŀɼ���
        this.setVisible(true);
        //���������λ��
        this.setLocation(LocX, LocY);
        //snackwin.requestFocus();
    }

    public static void main(String[] args) {
        new greedySnackMain();
    }
}