import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConvert extends JFrame implements  ActionListener{
    private Container pane;
    private JLabel j;
    private JComboBox t;

    public TemperatureConvert() {
	this.setTitle("Temperature Converter");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();

	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	JButton b = new JButton("Celsius to Farenheit");
	b.addActionListener(this);
	b.setActionCommand("Celsius to Farenheit");
	JButton b2 = new JButton("Farenheit to Celsius");
	b2.addActionListener(this);
	b2.setActionCommand("Farenheit to Celsius");
	t = new JTextField(10);
	j = new JLabel("");
	
	pane.add(t);
	pane.add(b);
	pane.add(b2);
	pane.add(j);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("Celsius to Farenheit")){
	    double s = Double.parseDouble(t.getText());
	    String x = "";
	    x = x + Temperature.CToF(s);
	    j.setText(x);
	}
	if(event.equals("Farenheit to Celsius")){
	    double s = Double.parseDouble(t.getText());
	    String x = "";
	    x = x + Temperature.FToC(s);
	    j.setText(x);
	}
	
    }
    public static void main(String[]args){
	TemperatureConvert g = new TemperatureConvert();
	g.setVisible(true);
    }
}
