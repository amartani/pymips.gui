package pymips.gui;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel leftPanel = null;
	private JPanel rightPanel = null;
	private JPanel stagesInfoPanel = null;
	private JPanel stagesPicturePanel = null;
	private JPanel ifStagePanel = null;
	private JPanel idStagePanel = null;
	private JPanel exStagePanel = null;
	private JPanel memStagePanel = null;
	private JPanel wbStagePanel = null;
	private JLabel stagesImageLabel = null;
	private JTextPane ifTextPane = null;
	private JTextPane idTextPane = null;
	private JTextPane exTextPane = null;
	private JTextPane memTextPane = null;
	private JTextPane wbTextPane1 = null;

	/**
	 * This is the default constructor
	 */
	public MainFrame() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(571, 398);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BoxLayout(getJContentPane(), BoxLayout.X_AXIS));
			jContentPane.add(getLeftPanel(), null);
			jContentPane.add(getRightPanel(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes leftPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getLeftPanel() {
		if (leftPanel == null) {
			leftPanel = new JPanel();
			leftPanel.setLayout(new BoxLayout(getLeftPanel(), BoxLayout.Y_AXIS));
			leftPanel.add(getStagesInfoPanel(), null);
			leftPanel.add(getStagesPicturePanel(), null);
		}
		return leftPanel;
	}

	/**
	 * This method initializes rightPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getRightPanel() {
		if (rightPanel == null) {
			rightPanel = new JPanel();
			rightPanel.setLayout(new GridBagLayout());
		}
		return rightPanel;
	}

	/**
	 * This method initializes stagesInfoPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getStagesInfoPanel() {
		if (stagesInfoPanel == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = -1;
			gridBagConstraints.gridy = -1;
			stagesInfoPanel = new JPanel();
			stagesInfoPanel.setLayout(new BoxLayout(getStagesInfoPanel(), BoxLayout.X_AXIS));
			stagesInfoPanel.add(getIfStagePanel(), null);
			stagesInfoPanel.add(getIdStagePanel(), null);
			stagesInfoPanel.add(getExStagePanel(), null);
			stagesInfoPanel.add(getMemStagePanel(), null);
			stagesInfoPanel.add(getWbStagePanel(), null);
		}
		return stagesInfoPanel;
	}

	/**
	 * This method initializes stagesPicturePanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getStagesPicturePanel() {
		if (stagesPicturePanel == null) {
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 0;
			gridBagConstraints1.anchor = GridBagConstraints.CENTER;
			gridBagConstraints1.fill = GridBagConstraints.BOTH;
			gridBagConstraints1.gridy = 0;
			stagesImageLabel = new JLabel();
			stagesImageLabel.setText("");
			stagesPicturePanel = new JPanel();
			stagesPicturePanel.setLayout(new GridBagLayout());
			stagesPicturePanel.add(stagesImageLabel, gridBagConstraints1);
		}
		return stagesPicturePanel;
	}

	/**
	 * This method initializes ifStagePanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getIfStagePanel() {
		if (ifStagePanel == null) {
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.fill = GridBagConstraints.BOTH;
			gridBagConstraints2.gridy = 0;
			gridBagConstraints2.weightx = 1.0;
			gridBagConstraints2.weighty = 1.0;
			gridBagConstraints2.gridx = 0;
			ifStagePanel = new JPanel();
			ifStagePanel.setLayout(new GridBagLayout());
			ifStagePanel.add(getIfTextPane(), gridBagConstraints2);
		}
		return ifStagePanel;
	}

	/**
	 * This method initializes idStagePanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getIdStagePanel() {
		if (idStagePanel == null) {
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.fill = GridBagConstraints.BOTH;
			gridBagConstraints3.weighty = 1.0;
			gridBagConstraints3.weightx = 1.0;
			idStagePanel = new JPanel();
			idStagePanel.setLayout(new GridBagLayout());
			idStagePanel.add(getIdTextPane(), gridBagConstraints3);
		}
		return idStagePanel;
	}

	/**
	 * This method initializes exStagePanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getExStagePanel() {
		if (exStagePanel == null) {
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.fill = GridBagConstraints.BOTH;
			gridBagConstraints4.weighty = 1.0;
			gridBagConstraints4.weightx = 1.0;
			exStagePanel = new JPanel();
			exStagePanel.setLayout(new GridBagLayout());
			exStagePanel.add(getExTextPane(), gridBagConstraints4);
		}
		return exStagePanel;
	}

	/**
	 * This method initializes memStagePanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getMemStagePanel() {
		if (memStagePanel == null) {
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.fill = GridBagConstraints.BOTH;
			gridBagConstraints5.weighty = 1.0;
			gridBagConstraints5.weightx = 1.0;
			memStagePanel = new JPanel();
			memStagePanel.setLayout(new GridBagLayout());
			memStagePanel.add(getMemTextPane(), gridBagConstraints5);
		}
		return memStagePanel;
	}

	/**
	 * This method initializes wbStagePanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getWbStagePanel() {
		if (wbStagePanel == null) {
			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			gridBagConstraints6.fill = GridBagConstraints.BOTH;
			gridBagConstraints6.weighty = 1.0;
			gridBagConstraints6.weightx = 1.0;
			wbStagePanel = new JPanel();
			wbStagePanel.setLayout(new GridBagLayout());
			wbStagePanel.add(getWbTextPane1(), gridBagConstraints6);
		}
		return wbStagePanel;
	}

	/**
	 * This method initializes ifTextPane	
	 * 	
	 * @return javax.swing.JTextPane	
	 */
	private JTextPane getIfTextPane() {
		if (ifTextPane == null) {
			ifTextPane = new JTextPane();
		}
		return ifTextPane;
	}

	/**
	 * This method initializes idTextPane	
	 * 	
	 * @return javax.swing.JTextPane	
	 */
	private JTextPane getIdTextPane() {
		if (idTextPane == null) {
			idTextPane = new JTextPane();
		}
		return idTextPane;
	}

	/**
	 * This method initializes exTextPane	
	 * 	
	 * @return javax.swing.JTextPane	
	 */
	private JTextPane getExTextPane() {
		if (exTextPane == null) {
			exTextPane = new JTextPane();
		}
		return exTextPane;
	}

	/**
	 * This method initializes memTextPane	
	 * 	
	 * @return javax.swing.JTextPane	
	 */
	private JTextPane getMemTextPane() {
		if (memTextPane == null) {
			memTextPane = new JTextPane();
		}
		return memTextPane;
	}

	/**
	 * This method initializes wbTextPane1	
	 * 	
	 * @return javax.swing.JTextPane	
	 */
	private JTextPane getWbTextPane1() {
		if (wbTextPane1 == null) {
			wbTextPane1 = new JTextPane();
		}
		return wbTextPane1;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
