package gui.view;

import gui.controller.GUIAppController;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIPanel extends JPanel
{
	private GUIAppController appController;
	private JButton firstButton;
	private SpringLayout baseLayout;
	public GUIPanel(GUIAppController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Click for color");
		baseLayout = new SpringLayout();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	/**
	 * Used to install all components to the subclass of JPanel
	 * This installs them into the panel so they are seen in the GUI
	 */
	private void setupPanel()
	{
		this.setBackground(Color.black);
		this.setLayout(baseLayout);
		this.add(firstButton);
		//calls add method of the super class to add firstButton, firstButton was made in the constructor
	}
	private void setupLayout()
	{
		//anything that starts with baseLayout.
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -250, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -190, SpringLayout.EAST, this);
	}
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click) 
			{
				changeBackgroundColor();
			}
		});
	}
	private void changeBackgroundColor()
	{
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		this.setBackground(new Color(red, green, blue));
	}
}
