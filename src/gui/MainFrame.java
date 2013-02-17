package gui;

/**
 *
 * @author Felix
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileMenuNew = new javax.swing.JMenuItem();
        fileMenuExit = new javax.swing.JMenuItem();
        gameMenu = new javax.swing.JMenu();
        gameMenuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AntGame 1.01");

        fileMenu.setText("File");

        fileMenuNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        fileMenuNew.setText("New game");
        fileMenuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuNewActionPerformed(evt);
            }
        });
        fileMenu.add(fileMenuNew);

        fileMenuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        fileMenuExit.setText("Exit");
        fileMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuExitActionPerformed(evt);
            }
        });
        fileMenu.add(fileMenuExit);

        menu.add(fileMenu);

        gameMenu.setText("Game");

        gameMenuAbout.setText("About");
        gameMenuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameMenuAboutActionPerformed(evt);
            }
        });
        gameMenu.add(gameMenuAbout);

        menu.add(gameMenu);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_fileMenuExitActionPerformed

    private void fileMenuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileMenuNewActionPerformed

    private void gameMenuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameMenuAboutActionPerformed
        AboutDialog dialog = new AboutDialog(this, false);
    }//GEN-LAST:event_gameMenuAboutActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem fileMenuExit;
    private javax.swing.JMenuItem fileMenuNew;
    private javax.swing.JMenu gameMenu;
    private javax.swing.JMenuItem gameMenuAbout;
    private javax.swing.JMenuBar menu;
    // End of variables declaration//GEN-END:variables
}
