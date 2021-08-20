import java.awt.*;
import java.awt.event.*;
public class ListExample2 implements ItemListener
{
public static void main(String... ar)
{
Frame f= new Frame();  
        List l1=new List();
        Label label1, label2;
       l1.setBounds(100,100, 75,75); 
        l1.add("Cricket");  
        l1.add("Football");  
        l1.add("Hockey"); 
        l1.add("Tennis"); 
        l1.add("Chess");
        l1.add("Carroms");
        l1.add("Vollyball");
label1 = new Label("Please select your favorite sport", Label.CENTER);
label2 = new Label();

        f.add(l1);  
        f.add(label1);
        f.add(label2);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  

l1.addItemListener(this);
f.setLayout(new FlowLayout());
f.setSize(280,240);
f.setVisible(true);
}
public void itemStateChanged(ItemEvent e)
{
List l = (List)e.getSource();
label2.setText("You have selected "+ l.getSelectedItem());
f.setVisible(true);
}


}

}