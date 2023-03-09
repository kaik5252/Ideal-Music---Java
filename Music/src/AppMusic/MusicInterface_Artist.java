package AppMusic;

import Control.Config;
import Model.Database;
import Model.Users;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class MusicInterface_Artist extends javax.swing.JFrame {

    private Database dbModel = new Database();
    boolean muted = false;
    int som = 0;

    public MusicInterface_Artist(Users user) {
        initComponents();
        setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage("src/resources/icons/logo_icon.png"));

        tableMusic.getTableHeader().setPreferredSize(new Dimension(100, 26));
        DefaultTableCellRenderer tableHeader = (DefaultTableCellRenderer) tableMusic.getTableHeader().getDefaultRenderer();
        tableHeader.setHorizontalAlignment(SwingConstants.CENTER);
        DefaultTableCellRenderer tableCell = new DefaultTableCellRenderer();
        tableCell.setHorizontalAlignment(SwingConstants.CENTER);
        for (int colInit = 0; colInit < tableMusic.getColumnModel().getColumnCount(); colInit++) {
            tableMusic.getColumnModel().getColumn(colInit).setCellRenderer(tableCell);
        }

        tableAlbum.getTableHeader().setPreferredSize(new Dimension(100, 26));
        tableHeader = (DefaultTableCellRenderer) tableAlbum.getTableHeader().getDefaultRenderer();
        tableHeader.setHorizontalAlignment(SwingConstants.CENTER);
        tableCell = new DefaultTableCellRenderer();
        tableCell.setHorizontalAlignment(SwingConstants.CENTER);
        for (int colInit = 0; colInit < tableAlbum.getColumnModel().getColumnCount(); colInit++) {
            tableAlbum.getColumnModel().getColumn(colInit).setCellRenderer(tableCell);
        }
        
        labelMenuArtist.setText(user.getUlogin());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelMusic = new javax.swing.JPanel();
        scrollMusic = new javax.swing.JScrollPane();
        tableMusic = new javax.swing.JTable();
        panelAlbum = new javax.swing.JPanel();
        scrollAlbum = new javax.swing.JScrollPane();
        tableAlbum = new javax.swing.JTable();
        panelPlayer = new javax.swing.JPanel();
        labelPLayerMusic = new javax.swing.JLabel();
        panelPlayerC = new javax.swing.JPanel();
        labelPlayerTimeDuraction = new javax.swing.JLabel();
        labelPlayerTime = new javax.swing.JLabel();
        sliderPlayerMusic = new javax.swing.JSlider();
        btnPlayerVolume = new javax.swing.JButton();
        btnPlayerNext = new javax.swing.JButton();
        btnPlayerControl = new javax.swing.JButton();
        btnPlayerBack = new javax.swing.JButton();
        panelPlayer2 = new javax.swing.JPanel();
        sliderPlayerVolume = new javax.swing.JSlider();
        panelMenu = new javax.swing.JPanel();
        labelMenuArtist = new javax.swing.JLabel();
        btnMenuAlbum = new javax.swing.JButton();
        btnMenuMusic = new javax.swing.JButton();
        panelMenuLogo = new javax.swing.JPanel();
        labelMenuLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ideal Music");
        setMinimumSize(new java.awt.Dimension(1280, 640));
        setName("frame"); // NOI18N

        panelMain.setLayout(new java.awt.CardLayout());

        panelMusic.setBackground(new java.awt.Color(173, 216, 230));
        panelMusic.setAlignmentY(0.0F);
        panelMusic.setMinimumSize(new java.awt.Dimension(980, 489));
        panelMusic.setPreferredSize(new java.awt.Dimension(980, 489));

        tableMusic.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tableMusic.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name Música"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMusic.setAlignmentX(0.0F);
        tableMusic.setAlignmentY(0.0F);
        tableMusic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableMusic.setRowHeight(24);
        tableMusic.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tableMusic.getTableHeader().setResizingAllowed(false);
        tableMusic.getTableHeader().setReorderingAllowed(false);
        scrollMusic.setViewportView(tableMusic);

        javax.swing.GroupLayout panelMusicLayout = new javax.swing.GroupLayout(panelMusic);
        panelMusic.setLayout(panelMusicLayout);
        panelMusicLayout.setHorizontalGroup(
            panelMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMusicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollMusic, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMusicLayout.setVerticalGroup(
            panelMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMusicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollMusic, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMain.add(panelMusic, "panelMusic");

        panelAlbum.setBackground(new java.awt.Color(173, 216, 230));
        panelAlbum.setAlignmentY(0.0F);
        panelAlbum.setMinimumSize(new java.awt.Dimension(980, 489));

        tableAlbum.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tableAlbum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name Albúm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAlbum.setAlignmentX(0.0F);
        tableAlbum.setAlignmentY(0.0F);
        tableAlbum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableAlbum.setRowHeight(24);
        tableAlbum.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableAlbum.getTableHeader().setResizingAllowed(false);
        tableAlbum.getTableHeader().setReorderingAllowed(false);
        tableAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAlbumMouseClicked(evt);
            }
        });
        scrollAlbum.setViewportView(tableAlbum);

        javax.swing.GroupLayout panelAlbumLayout = new javax.swing.GroupLayout(panelAlbum);
        panelAlbum.setLayout(panelAlbumLayout);
        panelAlbumLayout.setHorizontalGroup(
            panelAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlbumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAlbumLayout.setVerticalGroup(
            panelAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlbumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMain.add(panelAlbum, "panelAlbum");

        panelPlayer.setBackground(new java.awt.Color(179, 7, 83));
        panelPlayer.setMaximumSize(new java.awt.Dimension(32767, 250));
        panelPlayer.setMinimumSize(new java.awt.Dimension(900, 150));
        panelPlayer.setPreferredSize(new java.awt.Dimension(991, 150));

        labelPLayerMusic.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        labelPLayerMusic.setForeground(new java.awt.Color(255, 255, 255));
        labelPLayerMusic.setText("Nome da música");

        panelPlayerC.setBackground(new java.awt.Color(179, 7, 83));

        labelPlayerTimeDuraction.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        labelPlayerTimeDuraction.setForeground(new java.awt.Color(255, 255, 255));
        labelPlayerTimeDuraction.setText("00:00");

        labelPlayerTime.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        labelPlayerTime.setForeground(new java.awt.Color(255, 255, 255));
        labelPlayerTime.setText("00:00");

        sliderPlayerMusic.setBackground(new java.awt.Color(179, 7, 83));
        sliderPlayerMusic.setForeground(new java.awt.Color(255, 255, 255));
        sliderPlayerMusic.setValue(0);
        sliderPlayerMusic.setAlignmentX(0.0F);
        sliderPlayerMusic.setAlignmentY(0.0F);
        sliderPlayerMusic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sliderPlayerMusic.setFocusable(false);
        sliderPlayerMusic.setMaximumSize(new java.awt.Dimension(32767, 18));
        sliderPlayerMusic.setMinimumSize(new java.awt.Dimension(400, 18));
        sliderPlayerMusic.setPreferredSize(new java.awt.Dimension(400, 18));

        btnPlayerVolume.setBackground(new java.awt.Color(179, 7, 83));
        btnPlayerVolume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/som.png"))); // NOI18N
        btnPlayerVolume.setAlignmentY(0.0F);
        btnPlayerVolume.setBorder(null);
        btnPlayerVolume.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlayerVolume.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnPlayerVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayerVolumeActionPerformed(evt);
            }
        });

        btnPlayerNext.setBackground(new java.awt.Color(179, 7, 83));
        btnPlayerNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/next.png"))); // NOI18N
        btnPlayerNext.setAlignmentY(0.0F);
        btnPlayerNext.setBorder(null);
        btnPlayerNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlayerNext.setMargin(new java.awt.Insets(0, 0, 0, 0));

        btnPlayerControl.setBackground(new java.awt.Color(179, 7, 83));
        btnPlayerControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/play.png"))); // NOI18N
        btnPlayerControl.setAlignmentY(0.0F);
        btnPlayerControl.setBorder(null);
        btnPlayerControl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlayerControl.setMargin(new java.awt.Insets(0, 0, 0, 0));

        btnPlayerBack.setBackground(new java.awt.Color(179, 7, 83));
        btnPlayerBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/back.png"))); // NOI18N
        btnPlayerBack.setAlignmentY(0.0F);
        btnPlayerBack.setBorder(null);
        btnPlayerBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlayerBack.setMargin(new java.awt.Insets(0, 0, 0, 0));

        javax.swing.GroupLayout panelPlayerCLayout = new javax.swing.GroupLayout(panelPlayerC);
        panelPlayerC.setLayout(panelPlayerCLayout);
        panelPlayerCLayout.setHorizontalGroup(
            panelPlayerCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlayerCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPlayerCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPlayerCLayout.createSequentialGroup()
                        .addComponent(labelPlayerTimeDuraction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sliderPlayerMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPlayerTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelPlayerCLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPlayerBack)
                        .addGap(18, 18, 18)
                        .addComponent(btnPlayerControl)
                        .addGap(18, 18, 18)
                        .addComponent(btnPlayerNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPlayerVolume)))
                .addContainerGap())
        );
        panelPlayerCLayout.setVerticalGroup(
            panelPlayerCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlayerCLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(panelPlayerCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(sliderPlayerMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPlayerTimeDuraction, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPlayerTime, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPlayerCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPlayerControl)
                    .addComponent(btnPlayerNext)
                    .addComponent(btnPlayerBack)
                    .addComponent(btnPlayerVolume))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panelPlayer2.setBackground(new java.awt.Color(179, 7, 83));

        sliderPlayerVolume.setBackground(new java.awt.Color(179, 7, 83));
        sliderPlayerVolume.setForeground(new java.awt.Color(179, 7, 83));
        sliderPlayerVolume.setMaximum(0);
        sliderPlayerVolume.setMinimum(-80);
        sliderPlayerVolume.setOrientation(javax.swing.JSlider.VERTICAL);
        sliderPlayerVolume.setAlignmentX(0.0F);
        sliderPlayerVolume.setAlignmentY(0.0F);
        sliderPlayerVolume.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sliderPlayerVolume.setMinimumSize(new java.awt.Dimension(20, 130));
        sliderPlayerVolume.setPreferredSize(new java.awt.Dimension(20, 130));

        javax.swing.GroupLayout panelPlayer2Layout = new javax.swing.GroupLayout(panelPlayer2);
        panelPlayer2.setLayout(panelPlayer2Layout);
        panelPlayer2Layout.setHorizontalGroup(
            panelPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlayer2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sliderPlayerVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPlayer2Layout.setVerticalGroup(
            panelPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlayer2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sliderPlayerVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelPlayerLayout = new javax.swing.GroupLayout(panelPlayer);
        panelPlayer.setLayout(panelPlayerLayout);
        panelPlayerLayout.setHorizontalGroup(
            panelPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlayerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelPLayerMusic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelPlayerC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPlayerLayout.setVerticalGroup(
            panelPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlayerLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(panelPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPlayerC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPLayerMusic))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlayerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelMenu.setBackground(new java.awt.Color(0, 0, 0));
        panelMenu.setAlignmentX(0.0F);
        panelMenu.setAlignmentY(0.0F);
        panelMenu.setMinimumSize(new java.awt.Dimension(300, 640));
        panelMenu.setPreferredSize(new java.awt.Dimension(300, 640));

        labelMenuArtist.setFont(new java.awt.Font("Cambria", 0, 30)); // NOI18N
        labelMenuArtist.setForeground(new java.awt.Color(173, 216, 230));
        labelMenuArtist.setText("Nome Artista");

        btnMenuAlbum.setBackground(new java.awt.Color(0, 0, 0));
        btnMenuAlbum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/textAlbuns.png"))); // NOI18N
        btnMenuAlbum.setAlignmentY(0.0F);
        btnMenuAlbum.setBorder(null);
        btnMenuAlbum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuAlbum.setFocusable(false);
        btnMenuAlbum.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnMenuAlbum.setMaximumSize(new java.awt.Dimension(300, 100));
        btnMenuAlbum.setMinimumSize(new java.awt.Dimension(300, 100));
        btnMenuAlbum.setPreferredSize(new java.awt.Dimension(300, 100));
        btnMenuAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuAlbumActionPerformed(evt);
            }
        });

        btnMenuMusic.setBackground(new java.awt.Color(0, 0, 0));
        btnMenuMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/textMusica.png"))); // NOI18N
        btnMenuMusic.setAlignmentY(0.0F);
        btnMenuMusic.setBorder(null);
        btnMenuMusic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuMusic.setFocusable(false);
        btnMenuMusic.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnMenuMusic.setMaximumSize(new java.awt.Dimension(300, 100));
        btnMenuMusic.setMinimumSize(new java.awt.Dimension(300, 100));
        btnMenuMusic.setPreferredSize(new java.awt.Dimension(300, 100));
        btnMenuMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuMusicActionPerformed(evt);
            }
        });

        panelMenuLogo.setBackground(new java.awt.Color(179, 7, 83));

        labelMenuLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/logo_grande.png"))); // NOI18N
        labelMenuLogo.setAlignmentY(0.0F);
        labelMenuLogo.setMaximumSize(new java.awt.Dimension(300, 240));
        labelMenuLogo.setMinimumSize(new java.awt.Dimension(300, 180));
        labelMenuLogo.setPreferredSize(new java.awt.Dimension(300, 180));

        javax.swing.GroupLayout panelMenuLogoLayout = new javax.swing.GroupLayout(panelMenuLogo);
        panelMenuLogo.setLayout(panelMenuLogoLayout);
        panelMenuLogoLayout.setHorizontalGroup(
            panelMenuLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panelMenuLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelMenuLogoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(labelMenuLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelMenuLogoLayout.setVerticalGroup(
            panelMenuLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(panelMenuLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelMenuLogoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(labelMenuLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelMenuLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMenuAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMenuMusic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelMenuArtist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(panelMenuLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnMenuAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnMenuMusic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMenuArtist)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, 1014, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(panelPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuMusicActionPerformed
        // Abre o apinel correspodente a ação
        Config.openCard(panelMain, "panelMusic");
    }//GEN-LAST:event_btnMenuMusicActionPerformed

    private void btnMenuAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuAlbumActionPerformed
        // Abre o painel correspodente a ação
        Config.openCard(panelMain, "panelAlbum");
    }//GEN-LAST:event_btnMenuAlbumActionPerformed

    private void btnPlayerVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayerVolumeActionPerformed
        // Resumindo deixa a música no mudo ou restaura o som
        muted = !muted;
        if (muted) {
            btnPlayerVolume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/mute.png")));
            sliderPlayerVolume.setVisible(false);
            som = sliderPlayerVolume.getValue();
            sliderPlayerVolume.setValue(-80);

        } else {
            btnPlayerVolume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/som.png")));
            sliderPlayerVolume.setVisible(true);
            sliderPlayerVolume.setValue(som);
            som = 0;
        }
    }//GEN-LAST:event_btnPlayerVolumeActionPerformed

    private void tableAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAlbumMouseClicked
        if (evt.getClickCount() == 2) {
            // código a ser executado quando ocorre um duplo clique
            System.out.println("Você clicou duas vezes no botão!");
        }
    }//GEN-LAST:event_tableAlbumMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenuAlbum;
    private javax.swing.JButton btnMenuMusic;
    private javax.swing.JButton btnPlayerBack;
    private javax.swing.JButton btnPlayerControl;
    private javax.swing.JButton btnPlayerNext;
    private javax.swing.JButton btnPlayerVolume;
    private javax.swing.JLabel labelMenuArtist;
    private javax.swing.JLabel labelMenuLogo;
    private javax.swing.JLabel labelPLayerMusic;
    private javax.swing.JLabel labelPlayerTime;
    private javax.swing.JLabel labelPlayerTimeDuraction;
    private javax.swing.JPanel panelAlbum;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMenuLogo;
    private javax.swing.JPanel panelMusic;
    private javax.swing.JPanel panelPlayer;
    private javax.swing.JPanel panelPlayer2;
    private javax.swing.JPanel panelPlayerC;
    private javax.swing.JScrollPane scrollAlbum;
    private javax.swing.JScrollPane scrollMusic;
    private javax.swing.JSlider sliderPlayerMusic;
    private javax.swing.JSlider sliderPlayerVolume;
    private javax.swing.JTable tableAlbum;
    private javax.swing.JTable tableMusic;
    // End of variables declaration//GEN-END:variables
}
