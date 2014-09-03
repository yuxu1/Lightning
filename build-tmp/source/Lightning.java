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

public class Lightning extends PApplet {

int startX=250;
int startY=0;
int endX=250;
int endY=0;
int r=PApplet.parseInt(random(0,255));
int g=PApplet.parseInt(random(0,255));
int b=PApplet.parseInt(random(0,255));
int o;

int startX2=100;
int startY2=0;
int endX2=100;
int endY2=0;

int startX3=400;
int startY3=0;
int endX3=400;
int endY3=0;

public void setup()
{
	size(500,500);
	background(0);
	strokeWeight(2);
	
}
public void draw()
{
	while(endY<500)
	{
		o=PApplet.parseInt(random(0,255));
		stroke(r,g,b,o);
		endX=startX+PApplet.parseInt(random(-15,15));
		endY=startY+PApplet.parseInt(random(0,20));
		line(startX,startY,endX,endY);
		startX=endX;
		startY=endY;
		
		stroke(g,b,r,o);
		endX2=startX2+PApplet.parseInt(random(-15,15));
		endY2=startY2+PApplet.parseInt(random(0,20));
		line(startX2,startY2,endX2,endY2);
		startX2=endX2;
		startY2=endY2;

		stroke(g,r,b,o);
		endX3=startX3+PApplet.parseInt(random(-15,15));
		endY3=startY3+PApplet.parseInt(random(0,20));
		line(startX3,startY3,endX3,endY3);
		startX3=endX3;
		startY3=endY3;

		r=r+PApplet.parseInt(random(-15,15));
		g=g+PApplet.parseInt(random(-15,15));
		b=b+PApplet.parseInt(random(-15,15));
	}
}
public void mousePressed()//more lightning bolts
{
	if(mousePressed=true)
	{
		startX=250;
		startY=0;
		endX=250;
		endY=0;

		startX2=100;
		startY2=0;
		endX2=100;
		endY2=0;

		startX3=400;
		startY3=0;
		endX3=400;
		endY3=0;

	}
}

public void keyPressed()//erase and start over
{
	if(keyPressed==true && key==' ')
	{
		background(0);
		r=PApplet.parseInt(random(0,255));
		g=PApplet.parseInt(random(0,255));
		b=PApplet.parseInt(random(0,255));
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
