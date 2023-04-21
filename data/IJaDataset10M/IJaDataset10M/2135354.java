package chasedoomserver;

import com.chasedoom.ConnectionThread;
import com.chasedoom.PlayerThread;
import com.chasedoom.RequestInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author  duo
 */
public class VisualChaseDoomServer extends javax.swing.JFrame implements RequestInterface {

    protected ConnectionThread connectionThread;

    protected ArrayList<PlayerThread> players;

    protected Logger logger;

    protected FileHandler handler;

    /** Creates new form VisualChaseDoomServer */
    public VisualChaseDoomServer() {
        initComponents();
        this.setPlayers(new ArrayList<PlayerThread>());
        connectionThread = new ConnectionThread(this);
        connectionThread.setDaemon(true);
        connectionThread.start();
        this.setLogger(Logger.getLogger(this.getClass().getName()));
        try {
            handler = new FileHandler("./textChaseDoomServer%g.log", 100000, 4);
            this.getLogger().addHandler(handler);
        } catch (IOException ex) {
            Logger.getLogger(VisualChaseDoomServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(VisualChaseDoomServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.addMessage("Chase Doom Server is up.");
        Logger.getLogger(this.getClass().getName()).warning("Chase Doom Server is up.");
    }

    /**
     * Get the value of players
     *
     * @return the value of players
     */
    public ArrayList<PlayerThread> getPlayers() {
        return players;
    }

    /**
     * Set the value of players
     *
     * @param players new value of players
     */
    public void setPlayers(ArrayList<PlayerThread> players) {
        this.players = players;
    }

    public void addPlayer(PlayerThread player) {
        this.players.add(player);
        player.setDaemon(true);
        player.start();
        addMessage("Listening to player " + player.getPlayerId());
    }

    public void removePlayer(PlayerThread player) {
        if (this.players.contains(player)) {
            String playerId = player.getPlayerId();
            this.players.remove(player);
            this.logMessage(playerId + " removed!!!");
            this.addMessage(playerId + " removed!!!");
        }
    }

    public void removePlayer(String playerId) {
        PlayerThread player;
        for (int i = 0; i < this.players.size(); i++) {
            player = this.players.get(i);
            if (playerId.equalsIgnoreCase(player.getPlayerId())) {
                removePlayer(player);
                break;
            }
        }
    }

    public boolean playerExists(String playerId) {
        PlayerThread player;
        for (int i = 0; i < this.players.size(); i++) {
            player = this.players.get(i);
            if (playerId.equalsIgnoreCase(player.getPlayerId())) {
                return true;
            }
        }
        return false;
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public void logMessage(String message) {
        this.getLogger().warning(message);
    }

    public void addMessage(String messsage) {
        this.serverMessagesTextArea.insert(messsage + "\n", 0);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        serverMessagesTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        serverMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitServerMenuItem = new javax.swing.JMenuItem();
        aboutMenu = new javax.swing.JMenu();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        serverMessagesTextArea.setColumns(20);
        serverMessagesTextArea.setEditable(false);
        serverMessagesTextArea.setRows(5);
        jScrollPane1.setViewportView(serverMessagesTextArea);
        jLabel1.setText("Messages");
        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(mainPanelLayout.createSequentialGroup().addContainerGap().addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE).addComponent(jLabel1)).addContainerGap()));
        mainPanelLayout.setVerticalGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup().addContainerGap(56, Short.MAX_VALUE).addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(22, 22, 22)));
        fileMenu.setText("File");
        exitServerMenuItem.setText("Exit");
        exitServerMenuItem.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitServerMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitServerMenuItem);
        serverMenuBar.add(fileMenu);
        aboutMenu.setText("About");
        serverMenuBar.add(aboutMenu);
        setJMenuBar(serverMenuBar);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        pack();
    }

    private void exitServerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        for (PlayerThread c : players) {
        }
        System.exit(0);
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VisualChaseDoomServer().setVisible(true);
            }
        });
    }

    private javax.swing.JMenu aboutMenu;

    private javax.swing.JMenuItem exitServerMenuItem;

    private javax.swing.JMenu fileMenu;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JPanel mainPanel;

    private javax.swing.JMenuBar serverMenuBar;

    private javax.swing.JTextArea serverMessagesTextArea;
}