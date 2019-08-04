import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saving {
    private  JFrame jFrame;
    private Button submit;
    private  JPanel jPanel;
    public Saving() {
        jFrame = new JFrame();
        submit = new Button("Submit");
        jPanel = new JPanel();
        jFrame.add(jPanel);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setBackground(Color.gray);

    }
    public void getSavingForm(Market market){
        TextArea name_area = new TextArea();
        TextField textField = new TextField("Fill text area with name of file to save (example : file.bin)");
        textField.setEditable(false);

//        jFrame.add(Component.)
        jPanel.add(textField);
        jPanel.add(name_area);
        name_area.setBounds(50,50, 50,30);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                market.writeEmployeesIntoFile(name_area.getText());
            }
        });
        jPanel.add(submit);
        jPanel.setBounds(0,70, jFrame.getWidth(), jFrame.getHeight()-70);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setSize(dimension.width/2, dimension.height/3);
        jFrame.setVisible(true);


    }




}
