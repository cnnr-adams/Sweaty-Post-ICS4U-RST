/*
 * UpMovementButtonReleased.java
 * stops running the code in upmovementbuttonpressed
 * Connor Adams || Matthew Edwards || Grayden Hibbert || Marcus Kubilius
 * June 2018
 */
package input;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import backend.input.MovementFromInputs;

public class UpMovementReleased extends AbstractAction
{
	/**
	 * Pre: Is called via a keypress of the associated button
	 * During: Set the UpPressed boolean to false
	 * Post: 
	 */
	@Override
	public void actionPerformed( ActionEvent tf )
	{
		MovementFromInputs.UpPressed = false;
	} 
}