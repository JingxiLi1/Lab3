/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import static java.awt.Color.black;
import static java.awt.Color.red;
import java.awt.HeadlessException;
import java.awt.Image;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.User;

/**
 *
 * @author Farid
 */
public class FormPanel extends javax.swing.JPanel {

    /**
     * Creates new form FormPanel
     */
    User user = new User();
    private JPanel bottomPanel;
    public FormPanel(JPanel bottomPanel) {
        initComponents();
        this.bottomPanel = bottomPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        titleLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        preferNotToSayRadio = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        submitButton = new javax.swing.JButton();
        photoLabel = new javax.swing.JLabel();
        uploadButton = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageTextArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(249, 225, 225));
        setEnabled(false);

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Patient Registration Form");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameLabel.setText("First Name: ");

        firstNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                firstNameTextFieldKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Last Name: ");

        ageLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ageLabel.setText("Age: ");

        emailLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailLabel.setText("Email: ");

        genderLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        genderLabel.setText("Gender: ");

        genderGroup.add(maleRadio);
        maleRadio.setText("Male");
        maleRadio.setActionCommand("Male User");
        maleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioActionPerformed(evt);
            }
        });

        genderGroup.add(femaleRadio);
        femaleRadio.setText("Female");
        femaleRadio.setActionCommand("Female User");
        femaleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioActionPerformed(evt);
            }
        });

        genderGroup.add(preferNotToSayRadio);
        preferNotToSayRadio.setText("Prefer Not to Say");
        preferNotToSayRadio.setActionCommand("Prefer Not to Say User");
        preferNotToSayRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preferNotToSayRadioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Patient Type: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Emergency" }));

        submitButton.setFont(new java.awt.Font("隶书", 1, 18)); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        photoLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        photoLabel.setText("Photo: ");

        uploadButton.setText("Upload");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        messageLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        messageLabel.setText("Message: ");

        messageTextArea.setColumns(20);
        messageTextArea.setRows(5);
        jScrollPane1.setViewportView(messageTextArea);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(144, 144, 144))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(ageLabel)
                            .addComponent(genderLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(firstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(ageTextField)
                                    .addComponent(maleRadio))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(emailLabel)
                                    .addComponent(jLabel2)
                                    .addComponent(photoLabel)))
                            .addComponent(femaleRadio)
                            .addComponent(preferNotToSayRadio))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lastNameTextField)
                                .addComponent(emailTextField)
                                .addComponent(jComboBox1, 0, 123, Short.MAX_VALUE))
                            .addComponent(uploadButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(messageLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(maleRadio)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(femaleRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preferNotToSayRadio)
                    .addComponent(photoLabel)
                    .addComponent(uploadButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(messageLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        
        user.setFirstName(firstNameTextField.getText());
        user.setLastName(lastNameTextField.getText());
        user.setAge(ageTextField.getText());
        user.setEmail(emailTextField.getText());
        user.setMessage(messageTextArea.getText());
        user.setType(jComboBox1.getSelectedItem().toString());
        //gender , type
        try{
            String gender = genderGroup.getSelection().getActionCommand();
            user.setGender(gender);
        }
        catch(Exception e){  
            user.setGender("");
        }
        
        //Check Validation:
        String output = "";
        boolean flag = false;
        if(!isValidName(user.getFirstName())){
            output = output + "FirstName" ;
            flag = true;
        }
        if(!isValidName(user.getLastName())){
            output = output + "," + "LastName" ;
            flag = true;
        }
        if(!isValidAge(user.getAge())){
            output = output + "," + "Age" ;
            flag = true;
        }
        if(!isValidEmail(user.getEmail())){
            output = output + "," + "Email" ;
            flag = true;
        }
        if(isValidMessage(user.getMessage())){
            output = output + "," + "Message" ;
            flag = true;
        }
        if(user.getSelectedFile() == null){
            output = output + "," + "Image" ;
            flag = true;   
        }
        //gender and type
        if(user.getGender()== null || user.getGender().isEmpty()){
            output = output + "," + "Gender" ;
            flag = true;  
        }
        if(user.getType() == null || user.getType().isEmpty()){
            output = output + "," + "Patient Type" ;
            flag = true;  
        }
        
        //Pop_Up for Invalid or Submition:
        if(flag == true){
            String outputMessage = output + " Invalid/empty ... \nPlease check and submit again!!";
            JOptionPane.showMessageDialog(this, outputMessage, "Invalid Input", HEIGHT);
        }
        else{
            try{
                ImageIcon imageIcon = new ImageIcon(user.getSelectedFile().getAbsolutePath());
                Image scaledImage = imageIcon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
                ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
                
                String outputMessage = "User: "+user.getFirstName() + " " + user.getLastName() + "\nregister form submitted.";
                JOptionPane.showMessageDialog(this, outputMessage, "Confirm of Registeration", HEIGHT, scaledImageIcon);
                user.setImg(scaledImageIcon);
                //give them on view if true
                ViewPanel viewPanel = new ViewPanel(user);
                bottomPanel.add(viewPanel);
                CardLayout layout = (CardLayout)bottomPanel.getLayout();
                layout.next(bottomPanel);
            }
            catch(HeadlessException e){
                JOptionPane.showMessageDialog(this, "Wrong Image File!", "Invalid Input", HEIGHT);
            }

        }
        

    }//GEN-LAST:event_submitButtonActionPerformed

    
    //UPLOAD Button for Upload Image and Validation of Image:
    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            user.setSelectedFile(fileChooser.getSelectedFile());
                    // Handle the selected file here, e.g., display it in an image component
                    // You can also save the file path to use it later.
            System.out.println("Selected file: " + user.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void maleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioActionPerformed

    private void preferNotToSayRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preferNotToSayRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preferNotToSayRadioActionPerformed

    private void femaleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleRadioActionPerformed

    private void firstNameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameTextFieldKeyPressed
//        for (char c : firstNameTextField.getText().toCharArray()) {
//            if (!Character.isLetter(c)) {
//                firstNameTextField.setForeground(red);
//            }
//        }
//        if (firstNameTextField.getText().length() >= 2 && firstNameTextField.getText().length() <= 50){
//            firstNameTextField.setForeground(black);
//        }
//        else{
//            firstNameTextField.setForeground(red);
//        }
    }//GEN-LAST:event_firstNameTextFieldKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextArea messageTextArea;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JRadioButton preferNotToSayRadio;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
    
    //validation:
    public boolean isValidName(String name) {
        if (name == null || name.isEmpty()) {
            return false;
        }

        for (char c : name.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return name.length() >= 2 && name.length() <= 50;
    }

    public boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false; 
        }
        String[] parts = email.split("@");
        if (parts.length != 2) {
            return false;
        }
        String localPart = parts[0];
        String domainPart = parts[1];
        if (localPart.isEmpty()) {
            return false; 
        }
        if (domainPart.isEmpty()) {
            return false; 
        }
        return true;
    }
    public boolean isValidAge(String ageStr) {
        try {
            int age = Integer.parseInt(ageStr);
            return age >= 0;
        } catch (NumberFormatException e) {
            return false; 
        }
    }
    public boolean isValidMessage(String message){
        if (message.isEmpty()) {
            return true; 
        } 
        return false;
    }
}
