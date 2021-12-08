
package boundries;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class Dashboard extends javax.swing.JFrame {
    
    protected String username, access = "";
    JButton button = new JButton();
    private Contact contact;

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        welcomePage.setVisible(true);
        addListingsP.setVisible(false);
        listingsP.setVisible(false);
        loginP.setVisible(false);
        editListingsP.setVisible(false);
        restrictionP.setVisible(false);
        summaryReportP.setVisible(false);
        notificationsP.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        listingsB = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addListingsB = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LoginB = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        editListingB = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        summaryReportB = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        notificationsB = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        summaryReportP = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        periodMonthS = new javax.swing.JComboBox<>();
        sRFB = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        f2 = new javax.swing.JLabel();
        f1 = new javax.swing.JLabel();
        f3 = new javax.swing.JLabel();
        periodYearS = new javax.swing.JComboBox<>();
        welcomePage = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        restrictionP = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        listingsP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        typeDD = new javax.swing.JComboBox<>();
        furnishedDD = new javax.swing.JComboBox<>();
        statusDD = new javax.swing.JComboBox<>();
        bedroomsDD = new javax.swing.JSpinner();
        bathroomsDD = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        quadrantDD = new javax.swing.JComboBox<>();
        filterListingsB = new javax.swing.JButton();
        notificationsP = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        typeDD1 = new javax.swing.JComboBox<>();
        furnishedDD1 = new javax.swing.JComboBox<>();
        statusDD1 = new javax.swing.JComboBox<>();
        bedroomsDD1 = new javax.swing.JSpinner();
        bathroomsDD1 = new javax.swing.JSpinner();
        jLabel38 = new javax.swing.JLabel();
        quadrantDD1 = new javax.swing.JComboBox<>();
        deletePrefrencesB = new javax.swing.JButton();
        setprefrenceB = new javax.swing.JButton();
        addListingsP = new javax.swing.JPanel();
        editListingsHeader = new javax.swing.JLabel();
        typeL = new javax.swing.JLabel();
        bedroomNL = new javax.swing.JLabel();
        addressL = new javax.swing.JLabel();
        bathroomNL = new javax.swing.JLabel();
        statusL = new javax.swing.JLabel();
        furnishedL = new javax.swing.JLabel();
        addressI = new javax.swing.JTextField();
        statusI = new javax.swing.JComboBox<>();
        furnishedI = new javax.swing.JComboBox<>();
        addListingSubmit = new javax.swing.JButton();
        bedroomI = new javax.swing.JSpinner();
        bathroomI = new javax.swing.JSpinner();
        typeI = new javax.swing.JComboBox<>();
        feeCheck = new javax.swing.JCheckBox();
        furnishedL1 = new javax.swing.JLabel();
        quadrantI = new javax.swing.JComboBox<>();
        addListingsError = new javax.swing.JLabel();
        feeField = new javax.swing.JLabel();
        furnishedL2 = new javax.swing.JLabel();
        periodI = new javax.swing.JComboBox<>();
        addListingQuoteB = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        loginP = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        usernameI = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        loginSubmitB = new javax.swing.JButton();
        accessI = new javax.swing.JComboBox<>();
        passwordI = new javax.swing.JPasswordField();
        loginError = new javax.swing.JLabel();
        editListingsP = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        statusS = new javax.swing.JComboBox<>();
        changeS = new javax.swing.JButton();
        editPeriodI = new javax.swing.JComboBox<>();
        editFeeI = new javax.swing.JSpinner();
        changeFeeB = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        statusChangeMessage = new javax.swing.JLabel();
        feeMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Property Rental Managment System");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(10, 43, 94));

        listingsB.setBackground(new java.awt.Color(10, 43, 94));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listings");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout listingsBLayout = new javax.swing.GroupLayout(listingsB);
        listingsB.setLayout(listingsBLayout);
        listingsBLayout.setHorizontalGroup(
            listingsBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        listingsBLayout.setVerticalGroup(
            listingsBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        addListingsB.setBackground(new java.awt.Color(10, 43, 94));
        addListingsB.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Listings");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addListingsBLayout = new javax.swing.GroupLayout(addListingsB);
        addListingsB.setLayout(addListingsBLayout);
        addListingsBLayout.setHorizontalGroup(
            addListingsBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addListingsBLayout.setVerticalGroup(
            addListingsBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        LoginB.setBackground(new java.awt.Color(10, 43, 94));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LoginBLayout = new javax.swing.GroupLayout(LoginB);
        LoginB.setLayout(LoginBLayout);
        LoginBLayout.setHorizontalGroup(
            LoginBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
            .addGroup(LoginBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LoginBLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        LoginBLayout.setVerticalGroup(
            LoginBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(LoginBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
        );

        logo.setFont(new java.awt.Font("SimSun-ExtB", 1, 36)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setText("PRMS");

        editListingB.setBackground(new java.awt.Color(10, 43, 94));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Edit Listings");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout editListingBLayout = new javax.swing.GroupLayout(editListingB);
        editListingB.setLayout(editListingBLayout);
        editListingBLayout.setHorizontalGroup(
            editListingBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        editListingBLayout.setVerticalGroup(
            editListingBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        summaryReportB.setBackground(new java.awt.Color(10, 43, 94));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Summary Report");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout summaryReportBLayout = new javax.swing.GroupLayout(summaryReportB);
        summaryReportB.setLayout(summaryReportBLayout);
        summaryReportBLayout.setHorizontalGroup(
            summaryReportBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        summaryReportBLayout.setVerticalGroup(
            summaryReportBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        notificationsB.setBackground(new java.awt.Color(10, 43, 94));

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Notifications");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout notificationsBLayout = new javax.swing.GroupLayout(notificationsB);
        notificationsB.setLayout(notificationsBLayout);
        notificationsBLayout.setHorizontalGroup(
            notificationsBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        notificationsBLayout.setVerticalGroup(
            notificationsBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listingsB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addListingsB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LoginB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(editListingB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(summaryReportB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(notificationsB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(listingsB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(addListingsB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(editListingB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(summaryReportB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(notificationsB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(LoginB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(774, 505));

        summaryReportP.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Summary Report");

        jLabel25.setForeground(new java.awt.Color(153, 153, 153));
        jLabel25.setText("Let's check out a periodic status of all the listings");

        periodMonthS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        sRFB.setBackground(new java.awt.Color(0, 0, 0));
        sRFB.setForeground(new java.awt.Color(255, 255, 255));
        sRFB.setText("Filter");
        sRFB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sRFBMouseClicked(evt);
            }
        });
        sRFB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sRFBActionPerformed(evt);
            }
        });

        jTable3.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "House ID", "lanlord Name", "Address"
            }
        ));
        jTable3.setFocusable(false);
        jTable3.setGridColor(new java.awt.Color(0, 0, 0));
        jTable3.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable3.setRowHeight(25);
        jTable3.setSelectionBackground(new java.awt.Color(102, 102, 255));
        jTable3.setShowHorizontalLines(false);
        jTable3.setShowVerticalLines(false);
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable3);

        jLabel21.setFont(new java.awt.Font("SimSun", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("Filter by date");

        jLabel26.setFont(new java.awt.Font("SimSun", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 153, 153));
        jLabel26.setText("Listings");

        jLabel27.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel27.setText("Total Listings");

        jLabel28.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel28.setText("Houses Rented");

        jLabel29.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel29.setText("Active Listings");

        f2.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        f2.setText("0");

        f1.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        f1.setText("0");

        f3.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        f3.setText("0");

        periodYearS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018", "2019", "2020", "2021", "2022" }));

        javax.swing.GroupLayout summaryReportPLayout = new javax.swing.GroupLayout(summaryReportP);
        summaryReportP.setLayout(summaryReportPLayout);
        summaryReportPLayout.setHorizontalGroup(
            summaryReportPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(summaryReportPLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, summaryReportPLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(summaryReportPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, summaryReportPLayout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, summaryReportPLayout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel29)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, summaryReportPLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(summaryReportPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(summaryReportPLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(periodMonthS, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(periodYearS, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(summaryReportPLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(sRFB, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(summaryReportPLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addGap(63, 63, 63))))
        );
        summaryReportPLayout.setVerticalGroup(
            summaryReportPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, summaryReportPLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel25)
                .addGap(88, 88, 88)
                .addGroup(summaryReportPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(summaryReportPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f2)
                    .addComponent(f3)
                    .addComponent(f1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(summaryReportPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(summaryReportPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(summaryReportPLayout.createSequentialGroup()
                        .addGroup(summaryReportPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(periodMonthS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(periodYearS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sRFB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        welcomePage.setBackground(new java.awt.Color(255, 255, 255));
        welcomePage.setPreferredSize(new java.awt.Dimension(774, 505));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Welcome!!!");

        javax.swing.GroupLayout welcomePageLayout = new javax.swing.GroupLayout(welcomePage);
        welcomePage.setLayout(welcomePageLayout);
        welcomePageLayout.setHorizontalGroup(
            welcomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
        );
        welcomePageLayout.setVerticalGroup(
            welcomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePageLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        restrictionP.setBackground(new java.awt.Color(255, 255, 255));
        restrictionP.setPreferredSize(new java.awt.Dimension(774, 505));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 51, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("404: The page you are trying to access is unavailable for your account type.");

        javax.swing.GroupLayout restrictionPLayout = new javax.swing.GroupLayout(restrictionP);
        restrictionP.setLayout(restrictionPLayout);
        restrictionPLayout.setHorizontalGroup(
            restrictionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        restrictionPLayout.setVerticalGroup(
            restrictionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restrictionPLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        listingsP.setBackground(new java.awt.Color(255, 255, 255));
        listingsP.setPreferredSize(new java.awt.Dimension(774, 505));

        jTable1.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Address", "Type", "Bedrooms", "Bathrooms", "Status", "Furnished", "Quadrant", "Contact"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(102, 102, 255));
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Address");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Type");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Bedrooms");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Bathrooms");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Status");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Furnished");
            jTable1.getColumnModel().getColumn(6).setHeaderValue("Quadrant");
            jTable1.getColumnModel().getColumn(7).setHeaderValue("Contact");
        }

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Listings");

        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("We can't wait for you to browse through our collection!");

        jLabel15.setText("Type");

        jLabel16.setText("Bedrooms");

        jLabel17.setText("Bathrooms");

        jLabel18.setText("Furnished");

        jLabel19.setText("Status");

        typeDD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Attached", "Detached", "Apartment", "Townhouse" }));

        furnishedDD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        statusDD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rented", "Available" }));

        jLabel20.setText("Quadrant");

        quadrantDD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SW", "SE", "NW", "NE" }));

        filterListingsB.setBackground(new java.awt.Color(0, 0, 0));
        filterListingsB.setForeground(new java.awt.Color(255, 255, 255));
        filterListingsB.setText("Filter");
        filterListingsB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filterListingsBMouseClicked(evt);
            }
        });
        filterListingsB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterListingsBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listingsPLayout = new javax.swing.GroupLayout(listingsP);
        listingsP.setLayout(listingsPLayout);
        listingsPLayout.setHorizontalGroup(
            listingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listingsPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
            .addGroup(listingsPLayout.createSequentialGroup()
                .addGroup(listingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listingsPLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(listingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeDD, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(listingsPLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(listingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bedroomsDD, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(listingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(listingsPLayout.createSequentialGroup()
                                .addComponent(bathroomsDD, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(furnishedDD, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(listingsPLayout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(listingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(listingsPLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(listingsPLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(statusDD, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(quadrantDD, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(listingsPLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(listingsPLayout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(filterListingsB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        listingsPLayout.setVerticalGroup(
            listingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listingsPLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel14)
                .addGap(37, 37, 37)
                .addGroup(listingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(furnishedDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bedroomsDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bathroomsDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quadrantDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(filterListingsB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        notificationsP.setBackground(new java.awt.Color(255, 255, 255));
        notificationsP.setPreferredSize(new java.awt.Dimension(774, 505));

        jTable4.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Address", "Type", "Bedrooms", "Bathrooms", "Status", "Furnished", "Quadrant", "Contact"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setFocusable(false);
        jTable4.setGridColor(new java.awt.Color(0, 0, 0));
        jTable4.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable4.setRowHeight(25);
        jTable4.setSelectionBackground(new java.awt.Color(102, 102, 255));
        jTable4.setShowHorizontalLines(false);
        jTable4.setShowVerticalLines(false);
        jTable4.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setHeaderValue("Address");
            jTable4.getColumnModel().getColumn(1).setHeaderValue("Type");
            jTable4.getColumnModel().getColumn(2).setHeaderValue("Bedrooms");
            jTable4.getColumnModel().getColumn(3).setHeaderValue("Bathrooms");
            jTable4.getColumnModel().getColumn(4).setHeaderValue("Status");
            jTable4.getColumnModel().getColumn(5).setHeaderValue("Furnished");
            jTable4.getColumnModel().getColumn(6).setHeaderValue("Quadrant");
            jTable4.getColumnModel().getColumn(7).setHeaderValue("Contact");
        }

        jLabel30.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Notifications");

        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("We can't wait for you to find exactly what you want!");

        jLabel32.setText("Type");

        jLabel34.setText("Bedrooms");

        jLabel35.setText("Bathrooms");

        jLabel36.setText("Furnished");

        jLabel37.setText("Status");

        typeDD1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Attached", "Detached", "Apartment", "Townhouse" }));

        furnishedDD1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        statusDD1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rented", "Available" }));

        jLabel38.setText("Quadrant");

        quadrantDD1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SW", "SE", "NW", "NE" }));

        deletePrefrencesB.setBackground(new java.awt.Color(0, 0, 0));
        deletePrefrencesB.setForeground(new java.awt.Color(255, 255, 255));
        deletePrefrencesB.setText("Delete Prefrences");
        deletePrefrencesB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletePrefrencesBMouseClicked(evt);
            }
        });
        deletePrefrencesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePrefrencesBActionPerformed(evt);
            }
        });

        setprefrenceB.setBackground(new java.awt.Color(0, 0, 0));
        setprefrenceB.setForeground(new java.awt.Color(255, 255, 255));
        setprefrenceB.setText("Set Prefrences");
        setprefrenceB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setprefrenceBMouseClicked(evt);
            }
        });
        setprefrenceB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setprefrenceBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout notificationsPLayout = new javax.swing.GroupLayout(notificationsP);
        notificationsP.setLayout(notificationsPLayout);
        notificationsPLayout.setHorizontalGroup(
            notificationsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(notificationsPLayout.createSequentialGroup()
                .addGroup(notificationsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(notificationsPLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(notificationsPLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(notificationsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeDD1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(notificationsPLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(notificationsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(notificationsPLayout.createSequentialGroup()
                                .addComponent(setprefrenceB)
                                .addGap(18, 18, 18)
                                .addComponent(deletePrefrencesB))
                            .addGroup(notificationsPLayout.createSequentialGroup()
                                .addGroup(notificationsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bedroomsDD1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(notificationsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(notificationsPLayout.createSequentialGroup()
                                        .addComponent(bathroomsDD1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(furnishedDD1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(notificationsPLayout.createSequentialGroup()
                                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(notificationsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(notificationsPLayout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(notificationsPLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(statusDD1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(quadrantDD1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, notificationsPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );
        notificationsPLayout.setVerticalGroup(
            notificationsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notificationsPLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel30)
                .addGap(0, 0, 0)
                .addComponent(jLabel31)
                .addGap(37, 37, 37)
                .addGroup(notificationsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(notificationsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeDD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(furnishedDD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusDD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bedroomsDD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bathroomsDD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quadrantDD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(notificationsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletePrefrencesB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setprefrenceB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        addListingsP.setBackground(new java.awt.Color(255, 255, 255));
        addListingsP.setPreferredSize(new java.awt.Dimension(774, 505));

        editListingsHeader.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        editListingsHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editListingsHeader.setText("Add Listings");

        typeL.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        typeL.setText("House Type");

        bedroomNL.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        bedroomNL.setText("Bedrooms");

        addressL.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        addressL.setText("Address ");

        bathroomNL.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        bathroomNL.setText("Bathrooms");

        statusL.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        statusL.setText("House Status");

        furnishedL.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        furnishedL.setText("Furnished");

        addressI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressIActionPerformed(evt);
            }
        });

        statusI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Rented" }));

        furnishedI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        addListingSubmit.setBackground(new java.awt.Color(0, 0, 0));
        addListingSubmit.setForeground(new java.awt.Color(255, 255, 255));
        addListingSubmit.setText("Add");
        addListingSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addListingSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addListingSubmitMouseClicked(evt);
            }
        });

        typeI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Detached", "Attached", "Townhouse", "Appartment" }));

        feeCheck.setBackground(new java.awt.Color(255, 255, 255));
        feeCheck.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        feeCheck.setText("By clicking this box, you agree to pay a fee of: ");
        feeCheck.setAlignmentY(0.0F);
        feeCheck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        feeCheck.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        feeCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feeCheckActionPerformed(evt);
            }
        });

        furnishedL1.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        furnishedL1.setText("Period");

        quadrantI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SW", "SE", "NW", "NE" }));

        addListingsError.setForeground(new java.awt.Color(255, 255, 255));
        addListingsError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addListingsError.setText("heloooooo");

        feeField.setForeground(new java.awt.Color(255, 0, 0));

        furnishedL2.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        furnishedL2.setText("Quadrant");

        periodI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30", "60", "90" }));

        addListingQuoteB.setBackground(new java.awt.Color(0, 0, 0));
        addListingQuoteB.setForeground(new java.awt.Color(255, 255, 255));
        addListingQuoteB.setText("Get Quote");
        addListingQuoteB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addListingQuoteB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addListingQuoteBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addListingsPLayout = new javax.swing.GroupLayout(addListingsP);
        addListingsP.setLayout(addListingsPLayout);
        addListingsPLayout.setHorizontalGroup(
            addListingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editListingsHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(addListingsPLayout.createSequentialGroup()
                .addGroup(addListingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addListingsPLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(addListingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addressL, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressI, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(addListingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addListingsPLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(typeL)
                                .addGap(27, 27, 27)
                                .addComponent(bathroomNL, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bedroomNL, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusL, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addListingsPLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(typeI, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bathroomI, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bedroomI, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addGroup(addListingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addListingsPLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(furnishedL, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(furnishedL2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(furnishedL1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addListingsPLayout.createSequentialGroup()
                                .addComponent(furnishedI, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quadrantI, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(periodI, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(addListingsPLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addGroup(addListingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addListingsPLayout.createSequentialGroup()
                                .addComponent(feeCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(feeField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addListingsError, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addListingsPLayout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(addListingSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addListingsPLayout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(addListingQuoteB, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(addListingsPLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        addListingsPLayout.setVerticalGroup(
            addListingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addListingsPLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(editListingsHeader)
                .addGap(29, 29, 29)
                .addGroup(addListingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addListingsPLayout.createSequentialGroup()
                        .addGroup(addListingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(furnishedL1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(furnishedL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(furnishedL2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addListingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(furnishedI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quadrantI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(periodI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addListingsPLayout.createSequentialGroup()
                        .addGroup(addListingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bathroomNL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bedroomNL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addListingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addListingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(statusI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bathroomI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bedroomI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(typeI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(108, 108, 108)
                .addComponent(addListingQuoteB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(addListingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(feeCheck)
                    .addComponent(feeField, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addListingSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(addListingsError, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        addListingSubmit.getAccessibleContext().setAccessibleName("Submit");

        loginP.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Hello, Welcome Back");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Login to rent, manage, and much more!");

        jLabel7.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel7.setText("Username");

        jLabel8.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel8.setText("Password");

        jLabel9.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("User ");

        loginSubmitB.setBackground(new java.awt.Color(0, 0, 0));
        loginSubmitB.setForeground(new java.awt.Color(255, 255, 255));
        loginSubmitB.setText("Submit");
        loginSubmitB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginSubmitBMouseClicked(evt);
            }
        });
        loginSubmitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginSubmitBActionPerformed(evt);
            }
        });

        accessI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Renter", "Manager", "Landlord" }));

        loginError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout loginPLayout = new javax.swing.GroupLayout(loginP);
        loginP.setLayout(loginPLayout);
        loginPLayout.setHorizontalGroup(
            loginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginPLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addGroup(loginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(loginPLayout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addGroup(loginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(loginPLayout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addGroup(loginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, loginPLayout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(passwordI, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(loginPLayout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(usernameI, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPLayout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(accessI, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(loginPLayout.createSequentialGroup()
                            .addGap(112, 112, 112)
                            .addComponent(loginSubmitB, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPLayout.createSequentialGroup()
                        .addComponent(loginError, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        loginPLayout.setVerticalGroup(
            loginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(58, 58, 58)
                .addGroup(loginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(passwordI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accessI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(68, 68, 68)
                .addComponent(loginSubmitB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(loginError, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        editListingsP.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Edit Listings");

        jLabel23.setForeground(new java.awt.Color(153, 153, 153));
        jLabel23.setText("Don't like the status of a listing? Dont like the fees for a period?");

        statusS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Rented" }));

        changeS.setBackground(new java.awt.Color(0, 0, 0));
        changeS.setForeground(new java.awt.Color(255, 255, 255));
        changeS.setText("Change Status");
        changeS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeSMouseClicked(evt);
            }
        });
        changeS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeSActionPerformed(evt);
            }
        });

        editPeriodI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30", "60", "90" }));

        changeFeeB.setBackground(new java.awt.Color(0, 0, 0));
        changeFeeB.setForeground(new java.awt.Color(255, 255, 255));
        changeFeeB.setText("Change Fee");
        changeFeeB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeFeeBMouseClicked(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Address", "Type", "Bedrooms", "Bathrooms", "Status", "Furnished", "Quadrant"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setFocusable(false);
        jTable2.setGridColor(new java.awt.Color(0, 0, 0));
        jTable2.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable2.setRowHeight(25);
        jTable2.setSelectionBackground(new java.awt.Color(102, 102, 255));
        jTable2.setShowHorizontalLines(false);
        jTable2.setShowVerticalLines(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setHeaderValue("Address");
            jTable2.getColumnModel().getColumn(1).setHeaderValue("Type");
            jTable2.getColumnModel().getColumn(2).setHeaderValue("Bedrooms");
            jTable2.getColumnModel().getColumn(3).setHeaderValue("Bathrooms");
            jTable2.getColumnModel().getColumn(4).setHeaderValue("Status");
            jTable2.getColumnModel().getColumn(5).setHeaderValue("Furnished");
            jTable2.getColumnModel().getColumn(6).setHeaderValue("Quadrant");
        }

        statusChangeMessage.setForeground(new java.awt.Color(0, 255, 0));

        feeMessage.setForeground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout editListingsPLayout = new javax.swing.GroupLayout(editListingsP);
        editListingsP.setLayout(editListingsPLayout);
        editListingsPLayout.setHorizontalGroup(
            editListingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editListingsPLayout.createSequentialGroup()
                .addGap(0, 110, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(editListingsPLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(editPeriodI, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editFeeI, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(changeFeeB, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(feeMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editListingsPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(editListingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editListingsPLayout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editListingsPLayout.createSequentialGroup()
                        .addComponent(statusS, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(changeS)
                        .addGap(87, 87, 87)
                        .addComponent(statusChangeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editListingsPLayout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180))))
        );
        editListingsPLayout.setVerticalGroup(
            editListingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editListingsPLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addGap(33, 33, 33)
                .addGroup(editListingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editPeriodI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editFeeI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeFeeB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feeMessage))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editListingsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeS, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusChangeMessage))
                .addGap(77, 77, 77)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(summaryReportP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(listingsP, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(loginP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(welcomePage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(editListingsP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(addListingsP, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(restrictionP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(notificationsP, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(summaryReportP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(listingsP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(loginP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(welcomePage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(editListingsP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(512, 512, 512)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(addListingsP, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 181, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(restrictionP, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 255, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(notificationsP, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 242, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

class ButtonRenderer extends JButton implements TableCellRenderer {
    public ButtonRenderer() { setOpaque(true); }
    public Component getTableCellRendererComponent(JTable table, Object value,
                                                       boolean isSelected, boolean hasFocus, int row, int column) {
      setText((value == null) ? "Contact" : value.toString());
      return this;
    }
  }
  class ButtonEditor extends DefaultCellEditor 
  {
    private String label;
    
    public ButtonEditor(JCheckBox checkBox) { super(checkBox); }
    public Component getTableCellEditorComponent(JTable table, Object value,
                                                    boolean isSelected, int row, int column) {
      label = (value == null) ? "Contact" : value.toString();
      button.setText(label);
      return button;
    }
    public Object getCellEditorValue() { return new String(label); }
  }
  
  private String[][] fetchData(){
        //NOTE: this is where we should recieve the 2D array and replace data  with it
        String[][] data = {
                            {"123 15", "Apartment", "3", "1", "Available", "Yes", "NE"},
                            {"456 15", "Townhouse", "2", "5", "Available", "No", "SW"},
                          };
        return data;
    }
  
    private void populateTable(JTable table){
        //get listings from database and populate table
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        //remove previous rows
        int rowCount = model.getRowCount();
        for(int i=0; i!=rowCount; rowCount--){ model.removeRow(i); }
        
        String[][] data = fetchData();
        for(int i=0; i<data.length; i++){
            String[] row = new String[data[i].length];
            for(int j=0; j< data[i].length; j++){
                row[j] = data[i][j];
            }
            model.addRow(row);
        }
    }

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        populateTable(jTable1); // Table for listing
        jTable1.getColumn("Contact").setCellRenderer(new ButtonRenderer());
        jTable1.getColumn("Contact").setCellEditor(new ButtonEditor(new JCheckBox()));
        
        button.addActionListener( new ActionListener() {
          public void actionPerformed(ActionEvent event)
          {
            contact = new Contact();
            contact.setVisible(true);
          }
        });
        
        listingsP.setVisible(true);
        addListingsP.setVisible(false);
        loginP.setVisible(false);
        welcomePage.setVisible(false);
        restrictionP.setVisible(false);
        editListingsP.setVisible(false);
        summaryReportP.setVisible(false);
        notificationsP.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if(access.equals("Landlord")){
            addListingsP.setVisible(true);
            summaryReportP.setVisible(false);
            addListingsError.setVisible(false);
            listingsP.setVisible(false);
            loginP.setVisible(false);
            welcomePage.setVisible(false);
            restrictionP.setVisible(false);
            editListingsP.setVisible(false);
            feeCheck.setVisible(false);
            addListingSubmit.setVisible(false);
            feeField.setVisible(false);
            notificationsP.setVisible(false);
        }else{
            summaryReportP.setVisible(false);
            addListingsP.setVisible(false);
            addListingsError.setVisible(false);
            listingsP.setVisible(false);
            loginP.setVisible(false);
            notificationsP.setVisible(false);
            editListingsP.setVisible(false);
            welcomePage.setVisible(false);
            restrictionP.setVisible(true);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void addressIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressIActionPerformed

    private void feeCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feeCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feeCheckActionPerformed

    private void loginSubmitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginSubmitBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginSubmitBActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        loginP.setVisible(true);
        loginError.setVisible(false);
        addListingsP.setVisible(false);
        listingsP.setVisible(false);
        welcomePage.setVisible(false);
        restrictionP.setVisible(false);
        editListingsP.setVisible(false);
        summaryReportP.setVisible(false);
        notificationsP.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void filterListingsBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterListingsBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filterListingsBActionPerformed

  
    private void filterListingsBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterListingsBMouseClicked
        //fetch inputs from user (to be used in notifications)
        // table for Filtering
        String type = typeDD.getSelectedItem().toString();
        String bedrooms = bedroomsDD.getValue().toString();
        String bathrooms = bathroomsDD.getValue().toString();
        String furnished = furnishedDD.getSelectedItem().toString();
        String status = statusDD.getSelectedItem().toString();
        String quadrant = quadrantDD.getSelectedItem().toString();
        
        
        //NOTE: Call method here to retrieve the filtered data//
        
        
        //reset table
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int rowCount = model.getRowCount();
        for(int i=0; i!=rowCount; rowCount--){ model.removeRow(i); }
        
        //filtering and displaying process
        String[][] data = fetchData();
        String[] toFilter = {type, bedrooms, bathrooms, status, furnished, quadrant};
        for(int i=0; i<data.length; i++){
            String[] temp = new String[data[i].length-1];
            System.arraycopy(data[i],1,temp,0,data[i].length-1);
            if(Arrays.equals(toFilter,temp)){
                model.addRow(data[i]);
            }else {
                continue;
            }
        }
        
        
    }//GEN-LAST:event_filterListingsBMouseClicked

    private void addListingSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addListingSubmitMouseClicked
        String address = addressI.getText();
        String type = typeI.getSelectedItem().toString();
        String bathrooms = bathroomI.getValue().toString();
        String bedrooms = bedroomI.getValue().toString();
        String status = statusI.getSelectedItem().toString();
        String furnished = furnishedI.getSelectedItem().toString();
        
        if(addressI.getText().length()==0 || Integer.valueOf(bathroomI.getValue().toString())==0
                || Integer.valueOf(bathroomI.getValue().toString())==0 || feeCheck.isSelected() == false){
            addListingsError.setForeground(Color.RED);
            addListingsError.setText("1 or more of the fields are empty, property not listed!");
        }else {
            addListingsError.setForeground(Color.GREEN);
            addListingsError.setText("Property succesfully listed!");
            
            //NOTE: here you send the above to the class to add property
        }
        
        addListingsError.setVisible(true);
    }//GEN-LAST:event_addListingSubmitMouseClicked

    private void loginSubmitBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginSubmitBMouseClicked
        username = usernameI.getText();
        access = accessI.getSelectedItem().toString();
        String password = String.valueOf(passwordI.getPassword());
        
        //NOTE: send all info here to backend and return if authorized to a variable to use in if
        
        if(username.length()==0 || password.length()==0){
            loginError.setForeground(Color.RED);
            loginError.setText("1 or more invalid fields, login failed");
        }else {
            loginError.setForeground(Color.GREEN);
            loginError.setText("Successfully logged in!");
        }
        
        loginError.setVisible(true);
        usernameI.setText("");
        passwordI.setText("");
    }//GEN-LAST:event_loginSubmitBMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if(access.equals("Manager")){
        editListingsP.setVisible(true);
        feeMessage.setText("");
        statusChangeMessage.setText("");
        populateTable(jTable2); //
        addListingsP.setVisible(false);
        listingsP.setVisible(false);
        loginP.setVisible(false);
        welcomePage.setVisible(false);
        restrictionP.setVisible(false);
        summaryReportP.setVisible(false);
        notificationsP.setVisible(false);

        }else{
            summaryReportP.setVisible(false);
            addListingsP.setVisible(false);
            addListingsError.setVisible(false);
            listingsP.setVisible(false);
            loginP.setVisible(false);
            editListingsP.setVisible(false);
            welcomePage.setVisible(false);
            restrictionP.setVisible(true);
            notificationsP.setVisible(false);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void changeSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeSActionPerformed

    private void changeSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeSMouseClicked
        int listingS = jTable2.getSelectedRow();
        String status = statusS.getSelectedItem().toString();
        //NOTE: send status to change it in the database and link it to 
        
        statusChangeMessage.setText("listing's status changed");

    }//GEN-LAST:event_changeSMouseClicked

    private void addListingQuoteBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addListingQuoteBMouseClicked
        //get quote
        String period = periodI.getSelectedItem().toString();
        //NOTE: call class to retrieve fee from inputed period and set fee in feeField right below
        
        feeField.setText("$30");
        feeCheck.setVisible(true);
        feeField.setVisible(true);
        addListingSubmit.setVisible(true);
        
    }//GEN-LAST:event_addListingQuoteBMouseClicked

    private void changeFeeBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeFeeBMouseClicked
        String period = editPeriodI.getSelectedItem().toString();
        String fee = editFeeI.getValue().toString();
        
        //NOTE: Here send to the class responsible for changing
        feeMessage.setText("Fee for period changed");
    }//GEN-LAST:event_changeFeeBMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        if(access.equals("Manager")){
            populateTable(jTable3);
            f1.setText("14");
            f2.setText("25");
            f3.setText("11");
            summaryReportP.setVisible(true);
            editListingsP.setVisible(false);
            addListingsP.setVisible(false);
            listingsP.setVisible(false);
            loginP.setVisible(false);
            welcomePage.setVisible(false);
            restrictionP.setVisible(false);
            notificationsP.setVisible(false);
        }else{
            addListingsP.setVisible(false);
            addListingsError.setVisible(false);
            listingsP.setVisible(false);
            loginP.setVisible(false);
            editListingsP.setVisible(false);
            welcomePage.setVisible(false);
            restrictionP.setVisible(true);
            notificationsP.setVisible(false);
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void sRFBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sRFBMouseClicked
        String periodMonth = periodMonthS.getSelectedItem().toString();
        String periodYear = periodYearS.getSelectedItem().toString();
        
        //reset table
        DefaultTableModel model = (DefaultTableModel)jTable3.getModel();
        int rowCount = model.getRowCount();
        for(int i=0; i!=rowCount; rowCount--){ model.removeRow(i); }
        
        String[][] data = fetchData();
         for(int i=0; i< data.length; i++){
            String[] postedDate = data[i][data[i].length-1].split("-");
            if(Integer.parseInt(postedDate[2]) == Integer.parseInt(periodMonth) &&
                    Integer.parseInt(postedDate[0]) == Integer.parseInt(periodYear)){
                model.addRow(data[i]);
            }
         }
    }//GEN-LAST:event_sRFBMouseClicked

    private void sRFBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sRFBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sRFBActionPerformed

    private void deletePrefrencesBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePrefrencesBMouseClicked
        DefaultTableModel model = (DefaultTableModel)jTable4.getModel();
        int rowCount = model.getRowCount();
        for(int i=0; i!=rowCount; rowCount--){ model.removeRow(i); }

        
    }//GEN-LAST:event_deletePrefrencesBMouseClicked

    private void deletePrefrencesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePrefrencesBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletePrefrencesBActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        if(access.equals("Renter")){
            populateTable(jTable4);
            notificationsP.setVisible(true);
            summaryReportP.setVisible(false);
            editListingsP.setVisible(false);
            addListingsP.setVisible(false);
            listingsP.setVisible(false);
            loginP.setVisible(false);
            welcomePage.setVisible(false);
            restrictionP.setVisible(false);
        }else{
            notificationsP.setVisible(false);
            addListingsP.setVisible(false);
            addListingsError.setVisible(false);
            listingsP.setVisible(false);
            loginP.setVisible(false);
            editListingsP.setVisible(false);
            welcomePage.setVisible(false);
            restrictionP.setVisible(true);
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void setprefrenceBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setprefrenceBMouseClicked
        String type = typeDD1.getSelectedItem().toString();
        String bedrooms = bedroomsDD1.getValue().toString();
        String bathrooms = bathroomsDD1.getValue().toString();
        String furnished = furnishedDD1.getSelectedItem().toString();
        String status = statusDD1.getSelectedItem().toString();
        String quadrant = quadrantDD1.getSelectedItem().toString();
        
        
    }//GEN-LAST:event_setprefrenceBMouseClicked

    private void setprefrenceBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setprefrenceBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setprefrenceBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginB;
    private javax.swing.JComboBox<String> accessI;
    private javax.swing.JButton addListingQuoteB;
    private javax.swing.JButton addListingSubmit;
    private javax.swing.JPanel addListingsB;
    private javax.swing.JLabel addListingsError;
    private javax.swing.JPanel addListingsP;
    private javax.swing.JTextField addressI;
    private javax.swing.JLabel addressL;
    private javax.swing.JSpinner bathroomI;
    private javax.swing.JLabel bathroomNL;
    private javax.swing.JSpinner bathroomsDD;
    private javax.swing.JSpinner bathroomsDD1;
    private javax.swing.JSpinner bedroomI;
    private javax.swing.JLabel bedroomNL;
    private javax.swing.JSpinner bedroomsDD;
    private javax.swing.JSpinner bedroomsDD1;
    private javax.swing.JButton changeFeeB;
    private javax.swing.JButton changeS;
    private javax.swing.JButton deletePrefrencesB;
    private javax.swing.JSpinner editFeeI;
    private javax.swing.JPanel editListingB;
    private javax.swing.JLabel editListingsHeader;
    private javax.swing.JPanel editListingsP;
    private javax.swing.JComboBox<String> editPeriodI;
    private javax.swing.JLabel f1;
    private javax.swing.JLabel f2;
    private javax.swing.JLabel f3;
    private javax.swing.JCheckBox feeCheck;
    private javax.swing.JLabel feeField;
    private javax.swing.JLabel feeMessage;
    private javax.swing.JButton filterListingsB;
    private javax.swing.JComboBox<String> furnishedDD;
    private javax.swing.JComboBox<String> furnishedDD1;
    private javax.swing.JComboBox<String> furnishedI;
    private javax.swing.JLabel furnishedL;
    private javax.swing.JLabel furnishedL1;
    private javax.swing.JLabel furnishedL2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JPanel listingsB;
    private javax.swing.JPanel listingsP;
    private javax.swing.JLabel loginError;
    private javax.swing.JPanel loginP;
    private javax.swing.JButton loginSubmitB;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel notificationsB;
    private javax.swing.JPanel notificationsP;
    private javax.swing.JPasswordField passwordI;
    private javax.swing.JComboBox<String> periodI;
    private javax.swing.JComboBox<String> periodMonthS;
    private javax.swing.JComboBox<String> periodYearS;
    private javax.swing.JComboBox<String> quadrantDD;
    private javax.swing.JComboBox<String> quadrantDD1;
    private javax.swing.JComboBox<String> quadrantI;
    private javax.swing.JPanel restrictionP;
    private javax.swing.JButton sRFB;
    private javax.swing.JButton setprefrenceB;
    private javax.swing.JLabel statusChangeMessage;
    private javax.swing.JComboBox<String> statusDD;
    private javax.swing.JComboBox<String> statusDD1;
    private javax.swing.JComboBox<String> statusI;
    private javax.swing.JLabel statusL;
    private javax.swing.JComboBox<String> statusS;
    private javax.swing.JPanel summaryReportB;
    private javax.swing.JPanel summaryReportP;
    private javax.swing.JComboBox<String> typeDD;
    private javax.swing.JComboBox<String> typeDD1;
    private javax.swing.JComboBox<String> typeI;
    private javax.swing.JLabel typeL;
    private javax.swing.JTextField usernameI;
    private javax.swing.JPanel welcomePage;
    // End of variables declaration//GEN-END:variables
}
