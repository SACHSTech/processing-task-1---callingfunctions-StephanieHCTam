/*
-------------------------------------------------------------------------
Processing Task 1 - Calling Functions

Author: Stephanie Tam

Date: 22/02/2022
-------------------------------------------------------------------------
*/

import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  // Background color: blue
  public void setup() {
    background(173, 230, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Foreground
    fill(7, 179, 10);
    rect(0, 350, 400, 60);
    
    fill(61, 2, 2);
    rect(0, 380, 400, 40);
    
    
    
	  
	// sample code, delete this stuff
    stroke(128);
    line(150, 25, 270, 350);  

    stroke(255);
    line(50, 125, 70, 50);  
  }
  
  // define other methods down here.
}