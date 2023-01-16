/*homePage
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Model.User;
import controller.Sorting;
import controller.BinarySearch;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ING Skill
 */
public final class homePage extends javax.swing.JFrame {

    ArrayList<User> listAccountDetails = new ArrayList();
    User Account_details = new User();
    Sorting sorting = new Sorting();
    DefaultTableModel table_values;
    User user;
    private int id;
    private String name;
    private String address;
    private String opening_date;
    private String holder_number;
    private int current_blc;
    private String Account_type;
    private String Account_Status;
    private int keyvalue;

    // list variable Name
    private int[] ID;
    private String[] Names;
    private String[] Address;
    private String[] Date;
    private String[] Number;
    private int[] Balance;
    private String[] Acc_types;
    private String[] Acc_Status;

    public homePage() {
        initComponents();
        TablesetData();
        setTableDataToList();
        table_values = (DefaultTableModel) Account_table.getModel();
        for (User user : listAccountDetails) {
            AddData(user, table_values);
        }
    }
    //create method add a initial data  form code

    public void AddData(User user, DefaultTableModel table_values) {
        DefaultTableModel tableModel = (DefaultTableModel) Account_table.getModel();
        tableModel.addRow(new Object[]{user.getId(), user.getAcc_Name(), user.getaddress(), user.getopeningdate(), user.getAcc_holder_number(), user.getcurrentBLC(), user.getAccount_type(), user.getAccount_Status()});

    }
    //create method set a data  table form code 

    public void TablesetData() {
        addTabledata(103, "Shyam", "Sindu", "20/12/2022", "9803206312", 10000, "Current", "Active");
        addTabledata(105, "Rohan", "Karve", "13/11/2022", "9813552290", 13000, "Saving", "Inactive");
        addTabledata(104, "Sitaram", "Jhapa", "10/09/2022", "9818938427", 9000, "Current", "Active");
        addTabledata(101, "Manjil", "Morang", "2/06/2022", "982385025", 15000, "Current", "Inactive");
        addTabledata(102, "Anuza", "Dolpa", "15/05/2022", "9818479232", 2000, "Saving", "Active");

    }
    //cerate method add data in table 

    public void addTabledata(int id, String Acc_Name, String address, String opening_date, String holder_number, int current_blc, String Account_type, String Account_Status) {

        user = new User();
        user.setId(id);
        user.setAcc_Name(Acc_Name);
        user.setaddress(address);
        user.setopeningdate(opening_date);
        user.setAcc_holder_number(holder_number);
        user.setcurrentBLC(current_blc);
        user.setAccount_type(Account_type);
        user.setAccount_status(Account_Status);

        // Add the all value
        listAccountDetails.add(user);

    }

    //create method get the data  form textfield 
    private void getTextFieldsData() {
        id = Integer.parseInt(IDTextField.getText());
        name = NameTextField.getText();
        address = AdressTextField.getText();
        opening_date = open_datejTextField.getText();
        holder_number = (H_numberjTextField.getText());
        current_blc = Integer.parseInt(blcTextField.getText());
        Account_type = Acc_typejComboBox.getSelectedItem().toString();
        Account_Status = Acc_stjComboBox.getSelectedItem().toString();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        NameTextField = new javax.swing.JTextField();
        AdressTextField = new javax.swing.JTextField();
        open_datejTextField = new javax.swing.JTextField();
        H_numberjTextField = new javax.swing.JTextField();
        Acc_stjComboBox = new javax.swing.JComboBox<>();
        Acc_typejComboBox = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Account_table = new javax.swing.JTable();
        ClearjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        blcTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        SortblcjButton = new javax.swing.JButton();
        sortjComboBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        SortIdjButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        searchjComboBox = new javax.swing.JComboBox<>();
        inputTextField = new javax.swing.JTextField();
        BinarySearchButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        IntgerMessageTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        StringMessageTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(93, 138, 168));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1062));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Account General Details ");

        IDTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        IDTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IDTextFieldKeyPressed(evt);
            }
        });

        NameTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        NameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NameTextFieldKeyPressed(evt);
            }
        });

        AdressTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        AdressTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AdressTextFieldKeyPressed(evt);
            }
        });

        open_datejTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        open_datejTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                open_datejTextFieldKeyPressed(evt);
            }
        });

        H_numberjTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        H_numberjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                H_numberjTextFieldKeyPressed(evt);
            }
        });

        Acc_stjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));
        Acc_stjComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        Acc_typejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "savings account", "current account", "fixed desposit account" }));
        Acc_typejComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        Account_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Account Name ", "Address", "opening date", "Account holder number", "current balance ", "Account type", "Account status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Account_table.setGridColor(new java.awt.Color(102, 255, 255));
        Account_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Account_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Account_table);
        if (Account_table.getColumnModel().getColumnCount() > 0) {
            Account_table.getColumnModel().getColumn(1).setResizable(false);
        }

        ClearjButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ClearjButton.setText("Clear");
        ClearjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearjButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Account Name:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Account ID:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Address:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Current balance:");

        blcTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        blcTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                blcTextFieldKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Opening Date:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Number:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Account Type:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Account Type:");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        SortblcjButton.setText("Sort by balance");
        SortblcjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortblcjButtonActionPerformed(evt);
            }
        });

        sortjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", "Descending" }));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Sorting");

        SortIdjButton.setText("Sort by ID");
        SortIdjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortIdjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SortIdjButton)
                .addGap(26, 26, 26)
                .addComponent(SortblcjButton)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sortjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(sortjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SortblcjButton)
                    .addComponent(SortIdjButton))
                .addGap(35, 35, 35))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        searchjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Name", "Account Type", "Account Status" }));

        inputTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter a input"));

        BinarySearchButton.setText("Serach");
        BinarySearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BinarySearchButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Binary  Serach");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(inputTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BinarySearchButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(searchjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(searchjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(BinarySearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        IntgerMessageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntgerMessageTextFieldActionPerformed(evt);
            }
        });

        jLabel12.setText("Intger values validation Text field");

        jLabel13.setText("Strings values validation Text field");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AdressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(open_datejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(blcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ClearjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(IntgerMessageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(StringMessageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Acc_typejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(H_numberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Acc_stjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(109, 109, 109)))))))
                .addGap(0, 50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(H_numberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel8))
                            .addComponent(Acc_typejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AdressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(Acc_stjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(open_datejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IntgerMessageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StringMessageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(blcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ClearjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1293, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) Account_table.getModel();
        if (Account_table.getSelectedRowCount() == 1) {
            int row = Account_table.getSelectedRow();
            Account_Status = Account_table.getValueAt(row, 7).toString();

            if (Account_Status.equals("Inactive")) {
                tableModel.removeRow(Account_table.getSelectedRow());
                IDTextField.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(jPanel1, "Active account is not deleted!!");
            }
        } else {
            if (Account_table.getRowCount() == 0) {
                JOptionPane.showMessageDialog(jPanel1, " Table is empty??.");
            } else {
                JOptionPane.showMessageDialog(jPanel1, " please selecte single row for delete  ?.");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try {
            getTextFieldsData();

            if (!isDuplicateId(id)) {
                DefaultTableModel tableModel = (DefaultTableModel) Account_table.getModel();
                tableModel.addRow(new Object[]{id, name, address, opening_date, holder_number, current_blc, Account_type, Account_Status});
                Account_details.setId(id);
                IDTextField.setEnabled(true);
                Account_details.setAcc_Name(name);
                Account_details.setaddress(address);
                Account_details.setopeningdate(opening_date);
                Account_details.setAcc_holder_number(holder_number);
                Account_details.setcurrentBLC(current_blc);
                Account_details.setAccount_type(Account_type);
                Account_details.setAccount_status(Account_Status);
                listAccountDetails.add(Account_details);
                JOptionPane.showConfirmDialog(this, "Account details is  Successfully Added");
            } else {
                JOptionPane.showConfirmDialog(this, "Account ID already exists!");
            }
        } catch (NumberFormatException aa) {
            JOptionPane.showMessageDialog(jPanel1, " Text fields is empty Please enter Add  value!!.");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        try {
            int currentRow = Account_table.getSelectedRow();
            getTextFieldsData();
            Account_table.setValueAt(id, currentRow, 0);
            Account_table.setValueAt(name, currentRow, 1);
            Account_table.setValueAt(address, currentRow, 2);
            Account_table.setValueAt(opening_date, currentRow, 3);
            Account_table.setValueAt(holder_number, currentRow, 4);
            Account_table.setValueAt(current_blc, currentRow, 5);
            Account_table.setValueAt(Account_type, currentRow, 6);
            Account_table.setValueAt(Account_Status, currentRow, 7);

        } catch (NumberFormatException ee) {
            JOptionPane.showMessageDialog(rootPane, " Doesn't select the table row please  select table row and  enter uapted value!!.");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void Account_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Account_tableMouseClicked
        int currentRow = Account_table.getSelectedRow();
        //when key press the table then row's values are show the textfields
        IDTextField.setText(Account_table.getValueAt(currentRow, 0).toString());
        NameTextField.setText(Account_table.getValueAt(currentRow, 1).toString());
        AdressTextField.setText(Account_table.getValueAt(currentRow, 2).toString());
        open_datejTextField.setText(Account_table.getValueAt(currentRow, 3).toString());
        H_numberjTextField.setText(Account_table.getValueAt(currentRow, 4).toString());
        blcTextField.setText(Account_table.getValueAt(currentRow, 5).toString());

        IDTextField.setEnabled(false);
    }//GEN-LAST:event_Account_tableMouseClicked

    private void SortblcjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortblcjButtonActionPerformed

        try {
            int values = 0;
            int variable = sortjComboBox.getSelectedIndex();
            if (variable == 1) {
                values = 1;
            } else {
                values = 0;
            }

            int tableSize = Account_table.getRowCount();
            ID = new int[tableSize];
            Names = new String[tableSize];
            Address = new String[tableSize];
            Date = new String[tableSize];
            Number = new String[tableSize];
            Balance = new int[tableSize];
            Acc_types = new String[tableSize];
            Acc_Status = new String[tableSize];

            for (int i = 0; i < tableSize; i++) {
                ID[i] = (int) Account_table.getValueAt(i, 0);
                Names[i] = (String) Account_table.getValueAt(i, 1);
                Address[i] = (String) Account_table.getValueAt(i, 2);
                Date[i] = (String) Account_table.getValueAt(i, 3);
                Number[i] = (String) Account_table.getValueAt(i, 4);
                Balance[i] = (int) Account_table.getValueAt(i, 5);
                Acc_types[i] = (String) Account_table.getValueAt(i, 6);
                Acc_Status[i] = (String) Account_table.getValueAt(i, 7);
            }

            sorting.SelectionSortBalance(ID, Names, Address, Date, Number, Balance, Acc_types, Acc_Status, values);

            for (int i = 0; i < tableSize; i++) {
                Account_table.setValueAt(ID[i], i, 0);
                Account_table.setValueAt(Names[i], i, 1);
                Account_table.setValueAt(Address[i], i, 2);
                Account_table.setValueAt(Date[i], i, 3);
                Account_table.setValueAt(Number[i], i, 4);
                Account_table.setValueAt(Balance[i], i, 5);
                Account_table.setValueAt(Acc_types[i], i, 6);
                Account_table.setValueAt(Acc_Status[i], i, 7);

            }
        } catch (Exception aa) {
            JOptionPane.showMessageDialog(rootPane, " already click!!.");
        }

    }//GEN-LAST:event_SortblcjButtonActionPerformed

    private void IDTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDTextFieldKeyPressed

        int key = evt.getKeyCode();
        if (key <= 64 || 90 <= key) {
            IDTextField.setEditable(true);
            IntgerMessageTextField.setText("Your  Account holder  Id is right !");
            IntgerMessageTextField.setForeground(Color.black);

        } else {
            IntgerMessageTextField.setText("Enter the integer values !");
            IntgerMessageTextField.setForeground(Color.red);
            IDTextField.setText("");
        }
    }//GEN-LAST:event_IDTextFieldKeyPressed

    private void NameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameTextFieldKeyPressed

        int key = evt.getKeyCode();
        if (key <= 48 || 57 <= key) {
            NameTextField.setEditable(true);
            StringMessageTextField.setText("Your Account Account holder name is right  !");
            StringMessageTextField.setForeground(Color.black);

        } else {
//            JOptionPane.showMessageDialog(rootPane, "Enter the String  values!");
            StringMessageTextField.setText("Enter the Account Account holder name String  input!");
            NameTextField.setText("");
            StringMessageTextField.setForeground(Color.red);
        }
    }//GEN-LAST:event_NameTextFieldKeyPressed

    private void AdressTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AdressTextFieldKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key <= 48 || 57 <= key) {
            AdressTextField.setEditable(true);
            StringMessageTextField.setText("Right the Address String  values!");
            StringMessageTextField.setForeground(Color.black);

        } else {
            StringMessageTextField.setText("Enter the Address String  values!");
            AdressTextField.setText("");
            StringMessageTextField.setForeground(Color.red);
        }

    }//GEN-LAST:event_AdressTextFieldKeyPressed

    private void blcTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_blcTextFieldKeyPressed

        int key = evt.getKeyCode();
        if (key <= 64 || 90 <= key) {
            IntgerMessageTextField.setText("Your current balance is data type int so,right input!");
            blcTextField.setEditable(true);
            IntgerMessageTextField.setForeground(Color.black);

        } else {

            IntgerMessageTextField.setText("Your current balance  incorret is data type int so,wrong input input!");
            IntgerMessageTextField.setForeground(Color.red);
            blcTextField.setText("");
        }

    }//GEN-LAST:event_blcTextFieldKeyPressed

    private void H_numberjTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_H_numberjTextFieldKeyPressed

        keyvalue = evt.getKeyCode();
        int numberCount = H_numberjTextField.getText().length();
        String numbers = H_numberjTextField.getText();
        int key = evt.getKeyCode();
        int lengthofnum;
        if (key <= 64 || 90 <= key) {
            H_numberjTextField.setEditable(true);
            if (keyvalue == 8 && numberCount < 10) {

            }

            if (numberCount < 10) {

                IntgerMessageTextField.setEditable(true);
                lengthofnum = numberCount + 1;
                if (H_numberjTextField.getText().startsWith("98") || numbers.startsWith("97")) {
                    IntgerMessageTextField.setText("Phone numbers is valid.total digits is " + lengthofnum);
                    IntgerMessageTextField.setForeground(Color.black);
                }
                
            }else {
                H_numberjTextField.setEditable(false);            
            }

        } else {
            IntgerMessageTextField.setText("Enter the  Intger values start with 98 an 97 values!");
            H_numberjTextField.setText("");
            IntgerMessageTextField.setForeground(Color.red);
        }
    }//GEN-LAST:event_H_numberjTextFieldKeyPressed


    private void BinarySearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinarySearchButtonActionPerformed

        String searchBy = searchjComboBox.getSelectedItem().toString().toUpperCase();
        String searchValue = inputTextField.getText();
        int result;
        try {
            //called this class getTableData method
            getTableData();
            System.out.println("Lingth Id: " + ID.length);
            BinarySearch bs = new BinarySearch();
            // by using the switch statement ans searching by binary search
            switch (searchBy) {
                case "ID" -> {
                    // searching by ID
                    result = bs.searchByID(ID, 0, ID.length, Integer.parseInt(searchValue));
                    System.out.println("Search Result: " + result);
                    JOptionPane.showMessageDialog(rootPane, "Id: " + searchValue + "\nName: " + Names[result] + "\nAddress: " + Address[result] + "\nNumbers: " + Number[result] + "\nBalances: " + Balance[result] + "\nDates: " + Date[result] + "\nStatus: " + Acc_Status[result] + "\nAccoutn type: " + Acc_types[result]);
                }

                case "NAME" -> {
                    // searching by Name
                    result = bs.searchStringValuse(Names, 0, Names.length, searchValue);
                    JOptionPane.showMessageDialog(rootPane, "Id: " + ID[result] + "\nName: " + searchValue + "\nAddress: " + Address[result] + "\nNumbers: " + Number[result] + "\nBalances: " + Balance[result] + "\nDates: " + Date[result] + "\nStatus: " + Acc_Status[result] + "\nnAccoutn type: " + Acc_types[result]);
                }

                case "ACCOUNT STATUS" -> {
                    //Binary searching by account Status
                    result = bs.searchStringValuse(Acc_Status, 0, Acc_Status.length, searchValue);
                    JOptionPane.showMessageDialog(rootPane, "Id: " + ID[0] + "\nName: " + Names[0] + "\nAddress: " + Address[0] + "\nNumbers: " + Number[0] + "\nBalances: " + Balance[result] + "\nDates: " + Date[result] + "\nStatus: " + Acc_Status[result] + "\nAccoutn type: " + searchValue);
                }

                case "ACCOUNT TYPE" -> {
                    //  Binary searching by account Type
                    result = bs.searchStringValuse(Acc_types, 0, Acc_types.length, searchValue);
                    JOptionPane.showMessageDialog(rootPane, "Id: " + ID[result] + "\nName: " + Names[result] + "\nAddress: " + Address[result] + "\nNumbers: " + Number[result] + "\nBalances: " + Balance[result] + "\nDates: " + Date[result] + "\nStatus: " + searchValue + "\nAccoutn type: " + Acc_Status[result]);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "\nSorry !! \n" + searchValue + " is not " + searchBy);
        }

    }//GEN-LAST:event_BinarySearchButtonActionPerformed

    private void ClearjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearjButtonActionPerformed

        IDTextField.setText("");
        NameTextField.setText("");
        AdressTextField.setText("");
        open_datejTextField.setText("");
        blcTextField.setText("");
        H_numberjTextField.setText("");

    }//GEN-LAST:event_ClearjButtonActionPerformed

    private void SortIdjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortIdjButtonActionPerformed
        //Create Sort by Actionperformed method in this below.
        try {
            int values = 0;
            int variable = sortjComboBox.getSelectedIndex();
            if (variable == 1) {
                values = 1;
            } else {
                values = 0;
            }

            int tableSize = Account_table.getRowCount();
            ID = new int[tableSize];
            Names = new String[tableSize];
            Address = new String[tableSize];
            Date = new String[tableSize];
            Number = new String[tableSize];
            Balance = new int[tableSize];
            Acc_types = new String[tableSize];
            Acc_Status = new String[tableSize];

            for (int i = 0; i < tableSize; i++) {
                ID[i] = (int) Account_table.getValueAt(i, 0);
                Names[i] = (String) Account_table.getValueAt(i, 1);
                Address[i] = (String) Account_table.getValueAt(i, 2);
                Date[i] = (String) Account_table.getValueAt(i, 3);
                Number[i] = (String) Account_table.getValueAt(i, 4);
                Balance[i] = (int) Account_table.getValueAt(i, 5);
                Acc_types[i] = (String) Account_table.getValueAt(i, 6);
                Acc_Status[i] = (String) Account_table.getValueAt(i, 7);

            }

            sorting.SelectionSortID(ID, Names, Address, Date, Number, Balance, Acc_types, Acc_Status, values);

            for (int i = 0; i < tableSize; i++) {
                Account_table.setValueAt(ID[i], i, 0);
                Account_table.setValueAt(Names[i], i, 1);
                Account_table.setValueAt(Address[i], i, 2);
                Account_table.setValueAt(Date[i], i, 3);
                Account_table.setValueAt(Number[i], i, 4);
                Account_table.setValueAt(Balance[i], i, 5);
                Account_table.setValueAt(Acc_types[i], i, 6);
                Account_table.setValueAt(Acc_Status[i], i, 7);

            }
        } catch (Exception aa) {
            JOptionPane.showMessageDialog(rootPane, " already click!!.");
        }

    }//GEN-LAST:event_SortIdjButtonActionPerformed

    private void IntgerMessageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntgerMessageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IntgerMessageTextFieldActionPerformed

    private void open_datejTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_open_datejTextFieldKeyPressed
        keyvalue = evt.getKeyCode();
        if (!(keyvalue >= 48 && keyvalue >= 57 || keyvalue == 109)) {
            StringMessageTextField.setForeground(Color.black);
            StringMessageTextField.setText("Your date is right. (DD-MM-YYYY)");
        } else {
            StringMessageTextField.setText("The day in wrong .(DD-MM-YYYY)");
            StringMessageTextField.setForeground(Color.red);

        }
    }//GEN-LAST:event_open_datejTextFieldKeyPressed
//cretae get Tabledata method

    public void getTableData() {

        int tableSize = Account_table.getRowCount();
        ID = new int[tableSize];
        Names = new String[tableSize];
        Address = new String[tableSize];
        Date = new String[tableSize];
        Number = new String[tableSize];
        Balance = new int[tableSize];
        Acc_types = new String[tableSize];
        Acc_Status = new String[tableSize];

        for (int i = 0; i < tableSize; i++) {
            ID[i] = (int) Account_table.getValueAt(i, 0);
            Names[i] = (String) Account_table.getValueAt(i, 1);
            Address[i] = (String) Account_table.getValueAt(i, 2);
            Date[i] = (String) Account_table.getValueAt(i, 3);
            Number[i] = (String) Account_table.getValueAt(i, 4);
            Balance[i] = (int) Account_table.getValueAt(i, 5);
            Acc_types[i] = (String) Account_table.getValueAt(i, 6);
            Acc_Status[i] = (String) Account_table.getValueAt(i, 7);

        }
    }

    //isDuplicated method  
    public boolean isDuplicateId(int key) {
        int rowCount = Account_table.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            int tableId = Integer.parseInt(Account_table.getValueAt(i, 0).toString());
            if (key == tableId) {
                return true;
            }
        }
        return false;
    }

    //cerate method Settable data to list.   
    public void setTableDataToList() {
        int row = Account_table.getRowCount();
        for (int i = 0; i < row; i++) {

            Account_details.setId(Integer.parseInt(Account_table.getValueAt(i, 0).toString()));
            Account_details.setAcc_Name(Account_table.getValueAt(i, 1).toString());
            Account_details.setaddress(Account_table.getValueAt(i, 2).toString());
            Account_details.setopeningdate(Account_table.getValueAt(i, 3).toString());
            Account_details.setAcc_holder_number(Account_table.getValueAt(i, 4).toString());
            Account_details.setcurrentBLC(Integer.parseInt(Account_table.getValueAt(i, 5).toString()));
            Account_details.setAccount_type(Account_table.getValueAt(i, 6).toString());
            Account_details.setAccount_status(Account_table.getValueAt(i, 7).toString());
            listAccountDetails.add(Account_details);
        }
    }

    /*
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Acc_stjComboBox;
    private javax.swing.JComboBox<String> Acc_typejComboBox;
    private javax.swing.JTable Account_table;
    private javax.swing.JTextField AdressTextField;
    private javax.swing.JButton BinarySearchButton;
    private javax.swing.JButton ClearjButton;
    private javax.swing.JTextField H_numberjTextField;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JTextField IntgerMessageTextField;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JButton SortIdjButton;
    private javax.swing.JButton SortblcjButton;
    private javax.swing.JTextField StringMessageTextField;
    private javax.swing.JTextField blcTextField;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField inputTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField open_datejTextField;
    private javax.swing.JComboBox<String> searchjComboBox;
    private javax.swing.JComboBox<String> sortjComboBox;
    // End of variables declaration//GEN-END:variables
}
