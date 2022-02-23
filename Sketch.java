/*
-------------------------------------------------------------------------
Processing Task 1 - Calling Functions

Author: Stephanie Tam

Date: 22/02/2022
-------------------------------------------------------------------------
*/

import processing.core.PApplet;

public class Sketch extends PApplet {
  
  public void settings() {
	// size call 
    size(400, 400);
  }
  
  // Blue Background
  public void setup() {
    background(173, 230, 255);
  }

  public void draw() {

    // Grass Foreground
    fill(7, 179, 10);
    rect(0, 350, 400, 60);
    
    fill(61, 2, 2);
    rect(0, 380, 400, 40);

    // Bird
    fill(242, 22, 84);
    ellipse(200, 200, 260, 230);

    fill(173, 122, 245);
    ellipse(200, 265, 160, 100);

    // Wings
    fill(92, 0, 222);
    triangle(320, 190, 320, 240, 385, 190);
    
    fill(92, 0, 222);
    triangle(80, 190, 80, 240, 15, 190);

    // Beak
    fill(255, 233, 38);
    triangle(170, 180, 200, 230, 230, 180);

    // Eyes
    fill(24, 0, 102);
    ellipse(185, 170, 20, 30);

    fill(24, 0, 102);
    ellipse(215, 170, 20, 30);

    // Legs
    fill(15, 0, 0);
    rect(180, 315, 5, 35);

    fill(15, 0, 0);
    rect(220, 315, 5, 35);

  }
}