package presentation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class UserFrame extends JFrame {
    private JPanel panel;
    private JPanel JPInfo;
    private JLabel lTitle;
    private JLabel lUser;
    private JLabel lPassword;
    private JLabel lUserType;
    private JLabel lUserStatus;
    private JButton bAddUser;
    private JButton bUpdate;
    private JButton bClear;
    private JTextField tUser;
    private JTextField tPassword;
    private JComboBox<Integer> cBUserType;
    private JComboBox<String> cBUserStatus;

    public UserFrame() {
        setForeground(new Color(0, 0, 0));
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 1000, 583);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        getContentPane().add(getPanel());
        setVisible(true); // Mover esta línea al final del constructor
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public JPanel getPanel() {
        if (panel == null) {
            panel = new JPanel();
            panel.setBounds(0, 0, 984, 586);
            panel.setLayout(null);
            panel.add(getJPInfo());
        }
        return panel;
    }

    public JPanel getJPInfo() {
        if (JPInfo == null) {
            JPInfo = new JPanel();
            JPInfo.setBackground(new Color(63, 37, 170));
            JPInfo.setBounds(0, 0, 984, 544);
            JPInfo.setLayout(null);

            // Labels
            JPInfo.add(getLTitle());
            JPInfo.add(getLUser());
            JPInfo.add(getLPassword());
            JPInfo.add(getLUserType());
            JPInfo.add(getLUserStatus());

            // Text fields
            JPInfo.add(getTUser());
            JPInfo.add(getTPassword());

            // Combo boxes
            JPInfo.add(getCBUserType());
            JPInfo.add(getCBUserStatus());

            // Buttons
            JPInfo.add(getBAddUser());
            JPInfo.add(getBUpdate());
            JPInfo.add(getBClear());

            // Table
            JPInfo.add(getJSPTableUsers());
        }
        return JPInfo;
    }

    public JLabel getLTitle() {
        if (lTitle == null) {
            lTitle = new JLabel("Gestión de usuarios");
            lTitle.setHorizontalAlignment(SwingConstants.CENTER);
            lTitle.setForeground(Color.WHITE);
            lTitle.setFont(new Font("Roboto", Font.PLAIN, 30));
            lTitle.setBounds(270, 11, 492, 50);
        }
        return lTitle;
    }

    public JLabel getLUser() {
        if (lUser == null) {
            lUser = new JLabel("Usuario:");
            lUser.setForeground(new Color(255, 255, 255));
            lUser.setFont(new Font("Roboto", Font.PLAIN, 16));
            lUser.setBounds(81, 100, 100, 20);
        }
        return lUser;
    }

    public JLabel getLPassword() {
        if (lPassword == null) {
            lPassword = new JLabel("Contraseña:");
            lPassword.setForeground(Color.WHITE);
            lPassword.setFont(new Font("Roboto", Font.PLAIN, 16));
            lPassword.setBounds(81, 175, 100, 20);
        }
        return lPassword;
    }

    public JLabel getLUserType() {
        if (lUserType == null) {
            lUserType = new JLabel("Tipo de usuario:");
            lUserType.setForeground(Color.WHITE);
            lUserType.setFont(new Font("Roboto", Font.PLAIN, 16));
            lUserType.setBounds(595, 100, 130, 20);
        }
        return lUserType;
    }

    public JLabel getLUserStatus() {
        if (lUserStatus == null) {
            lUserStatus = new JLabel("Estado del usuario:");
            lUserStatus.setForeground(Color.WHITE);
            lUserStatus.setFont(new Font("Roboto", Font.PLAIN, 16));
            lUserStatus.setBounds(595, 175, 135, 20);
        }
        return lUserStatus;
    }

    public JButton getBAddUser() {
        if (bAddUser == null) {
            bAddUser = new JButton("Agregar");
            bAddUser.setBackground(new Color(28, 28, 28));
            bAddUser.setForeground(new Color(255, 255, 255));
            bAddUser.setBounds(190, 230, 130, 40);
        }
        return bAddUser;
    }

    public JButton getBUpdate() {
        if (bUpdate == null) {
            bUpdate = new JButton("Modificar");
            bUpdate.setBackground(new Color(28, 28, 28));
            bUpdate.setForeground(new Color(255, 255, 255));
            bUpdate.setBounds(390, 230, 130, 40);
        }
        return bUpdate;
    }

    public JButton getBClear() {
        if (bClear == null) {
            bClear = new JButton("Eliminar");
            bClear.setBackground(new Color(28, 28, 28));
            bClear.setForeground(new Color(255, 255, 255));
            bClear.setBounds(590, 230, 130, 40);
        }
        return bClear;
    }

    public JTextField getTUser() {
        if (tUser == null) {
            tUser = new JTextField();
            tUser.setBackground(new Color(28, 28, 28));
            tUser.setForeground(new Color(255, 255, 255));
            tUser.setFont(new Font("Roboto", Font.PLAIN, 16));
			tUser.setBorder(BorderFactory.createEmptyBorder());
            tUser.setBounds(171, 100, 150, 20);
            tUser.setColumns(10);
        }
        return tUser;
    }

    public JTextField getTPassword() {
        if (tPassword == null) {
            tPassword = new JTextField();
            tPassword.setBackground(new Color(28, 28, 28));
            tPassword.setForeground(new Color(255, 255, 255));
            tPassword.setFont(new Font("Roboto", Font.PLAIN, 16));
            tPassword.setBorder(BorderFactory.createEmptyBorder());
            tPassword.setColumns(10);
            tPassword.setBounds(171, 175, 150, 20);
        }
        return tPassword;
    }

    public JComboBox<Integer> getCBUserType() {
        if (cBUserType == null) {
            cBUserType = new JComboBox<>();
            cBUserType.setBackground(new Color(28, 28, 28));
            cBUserType.setForeground(new Color(255, 255, 255));
            cBUserType.setFont(new Font("Roboto", Font.PLAIN, 16));
            cBUserType.setBorder(BorderFactory.createEmptyBorder());
            cBUserType.setBounds(735, 101, 150, 22);
            cBUserType.addItem(1);
            cBUserType.addItem(2);
        }
        return cBUserType;
    }

    public JComboBox<String> getCBUserStatus() {
        if (cBUserStatus == null) {
            cBUserStatus = new JComboBox();
            cBUserStatus.setBackground(new Color(28, 28, 28));
            cBUserStatus.setForeground(new Color(255, 255, 255));
            cBUserStatus.setFont(new Font("Roboto", Font.PLAIN, 16));
            cBUserStatus.setBorder(BorderFactory.createEmptyBorder());
            cBUserStatus.setModel(new DefaultComboBoxModel(new String[]{"Activo", "No activo"}));
            cBUserStatus.setBounds(735, 176, 150, 22);
        }
        return cBUserStatus;
    }

    public JScrollPane getJSPTableUsers() {
        JTable jTableUsers = new JTable();
        jTableUsers.setModel(new DefaultTableModel(
            new Object[][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
            },
            new String[] {
                "Usuario", "Contraseña", "Tipo de usuario", "Estado del usuario"
            }
        ));

        JScrollPane jScrollPaneUsers = new JScrollPane(jTableUsers);
        jScrollPaneUsers.setBounds(10, 300, 964, 167);

        // Asignar nombres a las columnas
        TableColumnModel columnModel = jTableUsers.getColumnModel();
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            TableColumn column = columnModel.getColumn(i);
            column.setHeaderValue(column.getHeaderValue());
        }

        return jScrollPaneUsers;
    }
}