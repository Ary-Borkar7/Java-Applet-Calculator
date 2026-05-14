import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;
/*
<applet code="Calculator1.class" width="1000" height="1000">
</applet>
*/
public class Calculator1 extends Applet implements ActionListener
{
Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,w1,w2,w3,w4,w5;
TextField x;
double a1,b1,c1;
char op;
public void init()
{
setLayout(null);
u=new Button("ABS");
v=new Button("BackSpace");
w=new Button("Clear");
a=new Button("7");
b=new Button("8");
c=new Button("9");
d=new Button("+");
e=new Button("%");
f=new Button("4");
g=new Button("5");
h=new Button("6");
i=new Button("-");
j=new Button("=");
k=new Button("1");
l=new Button("2");
m=new Button("3");
n=new Button("*");
o=new Button("SQRT");
p=new Button("0");
q=new Button(".");
r=new Button("+/-");
s=new Button("/");
t=new Button("1/X");
w1=new Button("sin");
w2=new Button("cos");
w3=new Button("tan");
w4=new Button("asin");
w5=new Button("acos");
x=new TextField();
 

add(u);
add(v);
add(w);
add(a);
add(b);
add(c);
add(d);
add(e);
add(f);
add(g);
add(h);
add(i);
add(j);
add(k);
add(l);
add(m);
add(n);
add(o);
add(p);
add(q);
add(r);
add(s);
add(t);
add(w1);
add(w2);
add(w3);
add(w4);
add(w5);
add(x);

u.setBounds(315,300,150,50);
v.setBounds(505,300,150,50);
w.setBounds(695,300,150,50);
a.setBounds(300,400,90,50);
b.setBounds(420,400,90,50);
c.setBounds(540,400,90,50);
d.setBounds(660,400,90,50);
e.setBounds(780,400,90,50);
f.setBounds(300,500,90,50);
g.setBounds(420,500,90,50);
h.setBounds(540,500,90,50);
i.setBounds(660,500,90,50);
j.setBounds(780,500,90,50);
k.setBounds(300,600,90,50);
l.setBounds(420,600,90,50);
m.setBounds(540,600,90,50);
n.setBounds(660,600,90,50);
o.setBounds(780,600,90,50);
p.setBounds(300,700,90,50);
q.setBounds(420,700,90,50);
r.setBounds(540,700,90,50);
s.setBounds(660,700,90,50);
t.setBounds(780,700,90,50);
w1.setBounds(300,800,90,50);
w2.setBounds(420,800,90,50);
w3.setBounds(540,800,90,50);
w4.setBounds(660,800,90,50);
w5.setBounds(780,800,90,50);
x.setBounds(310,160,550,40);


u.addActionListener(this);
v.addActionListener(this);
w.addActionListener(this);
a.addActionListener(this);
b.addActionListener(this);
c.addActionListener(this);
d.addActionListener(this);
e.addActionListener(this);
f.addActionListener(this);
g.addActionListener(this);
h.addActionListener(this);
i.addActionListener(this);
j.addActionListener(this);
k.addActionListener(this);
l.addActionListener(this);
m.addActionListener(this);
n.addActionListener(this);
o.addActionListener(this);
p.addActionListener(this);
q.addActionListener(this);
r.addActionListener(this);
s.addActionListener(this);
t.addActionListener(this);
w1.addActionListener(this);
w2.addActionListener(this);
w3.addActionListener(this);
w4.addActionListener(this);
w5.addActionListener(this);
}

public void actionPerformed(ActionEvent e1)
{
String s1=e1.getActionCommand();
if(s1.equals("1"))
{
String s2=x.getText().concat("1");
x.setText(s2);
}
if(s1.equals("2"))
{
String s3=x.getText().concat("2");
x.setText(s3);
}
if(s1.equals("3"))
{
String s4=x.getText().concat("3");
x.setText(s4);
}
if(s1.equals("4"))
{
String s5=x.getText().concat("4");
x.setText(s5);
}
if(s1.equals("5"))
{
String s6=x.getText().concat("5");
x.setText(s6);
}
if(s1.equals("6"))
{
String s7=x.getText().concat("6");
x.setText(s7);
}
if(s1.equals("7"))
{
String s8=x.getText().concat("7");
x.setText(s8);
}
if(s1.equals("8"))
{
String s9=x.getText().concat("8");
x.setText(s9);
}
if(s1.equals("9"))
{
String s10=x.getText().concat("9");
x.setText(s10);
}
if(s1.equals("0"))
{
String s11=x.getText().concat("0");
x.setText(s11);
}
if(s1.equals("."))
{
String s12=x.getText().concat(".");
x.setText(s12);
}
if(s1.equals("Clear"))
{
x.setText("");
}
if(s1.equals("1/X"))
{
a1=Double.parseDouble(x.getText());
b1=1.0/a1;
x.setText(""+b1);	
}
if(s1.equals("SQRT"))
{
a1=Double.parseDouble(x.getText());
b1=Math.sqrt(a1);
x.setText(""+b1);
}
if(s1.equals("ABS"))
{
a1=Double.parseDouble(x.getText());
b1=Math.abs(a1);
x.setText(""+b1);
}
if(s1.equals("+/-"))
{
a1=Double.parseDouble(x.getText());
b1=-1.0*a1;
x.setText(""+b1);
}
if(s1.equals("+"))
{
a1=Double.parseDouble(x.getText());
x.setText("");
op='+';
}
if(s1.equals("-"))
{
a1=Double.parseDouble(x.getText());
x.setText("");
op='-';
}
if(s1.equals("*"))
{
a1=Double.parseDouble(x.getText());
x.setText("");
op='*';
}
if(s1.equals("/"))
{
a1=Double.parseDouble(x.getText());
x.setText("");
op='/';
}
if(s1.equals("%"))
{
a1=Double.parseDouble(x.getText());
x.setText("");
op='%';
}
if(s1.equals("="))
{
b1=Double.parseDouble(x.getText());
x.setText("");

switch(op)
{
case '+':
c1=a1+b1;
x.setText(""+c1);
break;

case '-':
c1=a1-b1;
x.setText(""+c1);
break;

case '*':
c1=a1*b1;
x.setText(""+c1);
break;

case '/':
c1=a1/b1;
x.setText(""+c1);
break;

case '%':
c1=a1%b1;
x.setText(""+c1);
break;
}
}
if(s1.equals("BackSpace"))
{
int a1=Integer.parseInt(x.getText());
int b1=a1/10;;
x.setText(""+b1);
}
if(s1.equals("sin"))
{
a1=Double.parseDouble(x.getText());
b1=Math.sin((a1*Math.PI)/180.0);
x.setText(""+b1);
}
if(s1.equals("cos"))
{
a1=Double.parseDouble(x.getText());
b1=Math.cos((a1*Math.PI)/180.0);
x.setText(""+b1);
}
if(s1.equals("tan"))
{
a1=Double.parseDouble(x.getText());
b1=Math.tan((a1*Math.PI)/180.0);
x.setText(""+b1);
}
if(s1.equals("asin"))
{
a1=Double.parseDouble(x.getText());
b1=Math.asin(a1);
x.setText(""+((b1*180.0)/Math.PI));
}
if(s1.equals("acos"))
{
a1=Double.parseDouble(x.getText());
b1=Math.acos(a1);
x.setText(""+((b1*180.0)/Math.PI));
}

}

public void paint(Graphics g)
{
g.drawRoundRect(300,150,570,100,30,30);
g.drawRoundRect(230,80,710,830,30,30);
}
}