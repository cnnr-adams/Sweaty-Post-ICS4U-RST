/*
 * LeftMovementButtonReleased.java
 * stops running the code in leftmovementbuttonpressed
 * Connor Adams || Matthew Edwards || Grayden Hibbert || Marcus Kubilius
 * June 2018
 */
package input;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import backend.input.MovementFromInputs;

public class LeftMovementReleased extends AbstractAction
{
	/**
	 * Pre: Is called via a keypress of the associated button
	 * During: Set the LeftPressed boolean to false
	 * Post: 
	 */
	@Override
	public void actionPerformed( ActionEvent tf )
	{
		MovementFromInputs.LeftPressed = false;
	} 
}