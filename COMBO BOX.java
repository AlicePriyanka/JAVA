CONBO BOX:
import javax.swing.*;
class ComboBox{
    public static void main(String[] args){
 JFrame f = new JFrame("JAVA");
 JMenuBar mb = new JMenuBar();
 JMenu m = new JMenu("MENU");
 JMenu sb = new JMenu("OOPS");
 JMenuItem mi1 = new JMenuItem("C");
 JMenuItem mi2 = new JMenuItem("PYTHON");
 JMenuItem mi4 = new JMenuItem("C++");
 JMenuItem mi5 = new JMenuItem("JAVA");
 m.add(mi1);
 m.add(mi2);
 sb.add(mi4);
 sb.add(mi5);
 m.add(sb);
 mb.add(m);
 f.setJMenuBar(mb);
 f.setSize(600,300);
 f.setLayout(null);
 f.setVisible(true);
}
}