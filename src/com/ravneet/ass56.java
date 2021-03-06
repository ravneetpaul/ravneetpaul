package com.ravneet;

       import javax.swing.*;

public class ass56 {

    public static void main(String... args)
    {
        JTextField user_Name = new JTextField(10);
        JTextField password = new JTextField(10);
        JTextField f_Name = new JTextField(10);
        JTextField l_Name = new JTextField(10);
        JTextField hours = new JTextField(10);
        JTextField days = new JTextField(10);
        JTextField boxes = new JTextField(10);
        JTextField packages = new JTextField(10);
        JTextField option_Size = new JTextField(10);
        JTextField box_Size = new JTextField(10);

        String uname="right";
        String pword="right12345";

        int attempt=0;
        int attemptLeft=3;
        Object[] detail = {
                "Username: ", user_Name,
                "Password: ", password
        };



        while(attempt<2)
        {
            JOptionPane.showMessageDialog(null, detail, "Login", JOptionPane.PLAIN_MESSAGE);
            if (user_Name.getText().equals(uname) && password.getText().equals(pword)) {
                JOptionPane.showMessageDialog(null, "Hello Will, you have logged in successfully", "Login", JOptionPane.PLAIN_MESSAGE);

                break;
            }
            else
            {
                user_Name.setText("");
                password.setText("");
                attempt++;
                attemptLeft--;
                if (attemptLeft != 0){
                    JOptionPane.showMessageDialog(null, "You have only" + attemptLeft + " left", "Warning", JOptionPane.PLAIN_MESSAGE);
                }
            }
        }
        if (attempt == 3) {
            JOptionPane.showMessageDialog(null, "You have exceeds maximum attempts for login, please try later after some time", "oopsss!!!", JOptionPane.PLAIN_MESSAGE);
        }

        Object[] userDetails = {
                "First Name: ",f_Name,
                "Last Name: ",l_Name,
                "Hours: ",hours,
                "Days: ",days,
                "No. of boxes: ",boxes,
                "Package (A or B): ",packages,
                "Option Size (Small or large): ",option_Size,
                "Box Size(Small or large): ",box_Size
        };

        JOptionPane.showMessageDialog(null, userDetails, "Login", JOptionPane.PLAIN_MESSAGE);
        String objf_Name=f_Name.getText();
        String objl_Name=l_Name.getText();
        int objhours=Integer.parseInt(hours.getText());
        int objdays=Integer.parseInt(days.getText());
        int objboxes=Integer.parseInt(boxes.getText());
        String objpackages=packages.getText();
        String objoption_Size=option_Size.getText();
        String objbox_Size=box_Size.getText();
        call objsample=new call(objf_Name,objl_Name,objhours,objdays,objboxes,objpackages,objoption_Size,objbox_Size);
        objsample.show_Service_Cost();
        objsample.show_Option_Cost();
        objsample.show_Item_Cost();
        objsample.show_Total_Cost();
        JOptionPane.showMessageDialog(null, objf_Name+", ***Thanks***");
    }
}