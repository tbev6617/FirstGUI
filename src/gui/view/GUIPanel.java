package gui.view;

import gui.controller.GUIAppController;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.Color;

public class GUIPanel extends JPanel
{
	private GUIAppController appController;
	private JButton firstButton;
	private SpringLayout baseLayout;
	public GUIPanel(GUIAppController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("WOW a button");
		baseLayout = new SpringLayout();
		setupPanel();
	}
	/**
	 * Used to install all components to the subclass of JPanel
	 * This installs
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		//calls add method of the super class to add firstButton
	}
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		
	}
}
