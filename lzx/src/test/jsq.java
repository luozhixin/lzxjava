package test;/**
/**
 * @program: lzx
 * @description: ������
 * @author: Zhixin.luo
 * @create: 2019-11-13 15:51
 **/
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/*��java��һ��������
?* ʵ��������С���ļӼ��˳�
?* ����ɾ���͸�λ����
?*/
public class jsq extends JFrame {
    private static final long serialVersionUID = 1L;
    private StringBuilder sBuilder = new StringBuilder();
    private Double a;//�м�������ڴ洢����ĵ�һ����
    private Double b;//�м���������ڴ洢����ĵڶ�����
    private Double double1;//���ڽ��ռ�����
    private Integer i;// i���ڱ�ʾ�Ӽ��˳�


    public jsq() {
        this.setTitle("������");
        this.setSize(318, 457);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);


// ����һ��label������ʾ�������ݺͼ����������ﲻ��textfield�����Ա����û��������bug���򻯳��򿪷�
        final JLabel label = new JLabel();
        label.setBounds(0, 0, 300, 50);
        label.setFont(new Font("dialog", 1, 30));
        label.setOpaque(true);// ����jlabelĬ��͸����ֱ�����ñ���ɫ��Ч����Ҫ�Ƚ���͸������Ϊtrue
        label.setBackground(Color.white);
        panel.add(label);


// ���尴ť���
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");
        JButton buttonadd = new JButton("+");// ��
        JButton buttonminus = new JButton("-");// ��
        JButton buttontime = new JButton("��");// ��
        JButton buttondivid = new JButton("��");// ��
        JButton buttonequal = new JButton("=");// ����
        JButton buttondecimal = new JButton(".");// С����
        JButton buttondelet = new JButton("��");// ɾ��
        JButton buttonclear = new JButton("C");// ���


// ���尴ť���λ��
        button0.setBounds(0, 50, 100, 60);
        button0.setFont(new Font("dialog", 1, 30));
        panel.add(button0);
        button1.setBounds(100, 50, 100, 60);
        button1.setFont(new Font("dialog", 1, 30));
        panel.add(button1);
        button2.setBounds(200, 50, 100, 60);
        button2.setFont(new Font("dialog", 1, 30));
        panel.add(button2);
        button3.setBounds(0, 110, 100, 60);
        button3.setFont(new Font("dialog", 1, 30));
        panel.add(button3);
        button4.setBounds(100, 110, 100, 60);
        button4.setFont(new Font("dialog", 1, 30));
        panel.add(button4);
        button5.setBounds(200, 110, 100, 60);
        button5.setFont(new Font("dialog", 1, 30));
        panel.add(button5);
        button6.setBounds(0, 170, 100, 60);
        button6.setFont(new Font("dialog", 1, 30));
        panel.add(button6);
        button7.setBounds(100, 170, 100, 60);
        button7.setFont(new Font("dialog", 1, 30));
        panel.add(button7);
        button8.setBounds(200, 170, 100, 60);
        button8.setFont(new Font("dialog", 1, 30));
        panel.add(button8);
        button9.setBounds(0, 230, 100, 60);
        button9.setFont(new Font("dialog", 1, 30));
        panel.add(button9);
        buttonadd.setBounds(100, 230, 100, 60);
        buttonadd.setFont(new Font("dialog", 1, 30));
        panel.add(buttonadd);//��
        buttonminus.setBounds(200, 230, 100, 60);
        buttonminus.setFont(new Font("dialog", 1, 30));
        panel.add(buttonminus);//��
        buttontime.setBounds(0, 290, 100, 60);
        buttontime.setFont(new Font("dialog", 1, 30));
        panel.add(buttontime);//��
        buttondivid.setBounds(100, 290, 100, 60);
        buttondivid.setFont(new Font("dialog", 1, 30));
        panel.add(buttondivid);//��
        buttonequal.setBounds(200, 290, 100, 60);
        buttonequal.setFont(new Font("dialog", 1, 30));
        panel.add(buttonequal);//����
        buttondecimal.setBounds(0, 350, 100, 60);
        buttondecimal.setFont(new Font("dialog", 1, 30));
        panel.add(buttondecimal);//С����
        buttonclear.setBounds(100, 350, 100, 60);
        buttonclear.setFont(new Font("dialog", 1, 30));
        panel.add(buttonclear);//��λ
        buttondelet.setBounds(200, 350, 100, 60);
        buttondelet.setFont(new Font("dialog", 1, 30));
        panel.add(buttondelet);//ɾ��


// ��������ť���ö���������
// ������ֵ����0~9
        button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBuilder.append("0");
                label.setText(sBuilder.toString());
            }
        });
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBuilder.append("1");
                label.setText(sBuilder.toString());
            }
        });
        button2.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                sBuilder.append("2");
                label.setText(sBuilder.toString());
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBuilder.append("3");
                label.setText(sBuilder.toString());
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBuilder.append("4");
                label.setText(sBuilder.toString());
            }
        });
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBuilder.append("5");
                label.setText(sBuilder.toString());
            }
        });
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBuilder.append("6");
                label.setText(sBuilder.toString());
            }
        });
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBuilder.append("7");
                label.setText(sBuilder.toString());
            }
        });
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBuilder.append("8");
                label.setText(sBuilder.toString());
            }
        });
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBuilder.append("9");
                label.setText(sBuilder.toString());
            }
        });


// �����������������Ҫ���ж�a�Ƿ�Ϊ0.0
        buttonadd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(sBuilder.toString());
                sBuilder = new StringBuilder();
                label.setText("+");
                i = 0;
            }
        });
        buttonminus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(sBuilder.toString());
                sBuilder = new StringBuilder();
                label.setText("-");
                i = 1;
            }
        });
        buttontime.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(sBuilder.toString());
                sBuilder = new StringBuilder();
                label.setText("��");
                i = 2;
            }
        });
        buttondivid.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(sBuilder.toString());
                sBuilder = new StringBuilder();
                label.setText("��");
                i = 3;
            }
        });
        buttonequal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
// ���ж��м�����Ƿ�Ϊ��
                if (!"".equals(sBuilder.toString()) && (!(a == 0.0))) {
                    b = Double.parseDouble(sBuilder.toString());
                    if (i == 0) {
                        double1 = a + b;
                        label.setText(double1.toString());
                        sBuilder = new StringBuilder();
                        sBuilder.append(double1);
                    } else if (i == 1) {
                        double1 = a - b;
                        label.setText(double1.toString());
                        sBuilder = new StringBuilder();
                        sBuilder.append(double1);
                    } else if (i == 2) {
                        double1 = a * b;
                        label.setText(double1.toString());
                        sBuilder = new StringBuilder();
                        sBuilder.append(double1);
                    } else if (i == 3) {
                        double1 = a / b;
                        label.setText(double1.toString());
                        sBuilder = new StringBuilder();
                        sBuilder.append(double1);
                    } else {
                        label.setText(sBuilder.toString());
                    }
                }
            }
        });
        buttondecimal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBuilder.append(".");
                label.setText(sBuilder.toString());
            }
        });
        buttonclear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBuilder = new StringBuilder();
                label.setText("");
        }
        });
        buttondelet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!"".equals(sBuilder.toString())) {
                    sBuilder.deleteCharAt(sBuilder.length() - 1);
                    label.setText(sBuilder.toString());
                }
            }
        });


        this.setVisible(true);
    }


    public static void main(String[] args) {
        new jsq();
    }
}

