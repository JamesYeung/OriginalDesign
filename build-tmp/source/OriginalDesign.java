import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int x = 250;
int y = 250;
int speed = 5;
public void setup()
{
	size(500,500);
	frameRate(40);
}
public void draw()
{
	x=x+speed;
	y=y+speed;
	background(0);
  	ellipse(x,y,50,50);
  	if(x==500 && y==500)
  	{
  		x=0;
  		y=0;
  		fill((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
  	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
