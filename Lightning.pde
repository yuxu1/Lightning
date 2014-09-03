int startX=250;
int startY=0;
int endX=250;
int endY=0;
int r=int(random(0,255));
int g=int(random(0,255));
int b=int(random(0,255));
int o;

int startX2=100;
int startY2=0;
int endX2=100;
int endY2=0;

int startX3=400;
int startY3=0;
int endX3=400;
int endY3=0;

void setup()
{
	size(500,500);
	background(0);
	strokeWeight(2);
	
}
void draw()
{
	while(endY<500)
	{
		o=int(random(0,255));
		stroke(r,g,b,o);
		endX=startX+int(random(-15,15));
		endY=startY+int(random(0,20));
		line(startX,startY,endX,endY);
		startX=endX;
		startY=endY;
		
		stroke(g,b,r,o);
		endX2=startX2+int(random(-15,15));
		endY2=startY2+int(random(0,20));
		line(startX2,startY2,endX2,endY2);
		startX2=endX2;
		startY2=endY2;

		stroke(g,r,b,o);
		endX3=startX3+int(random(-15,15));
		endY3=startY3+int(random(0,20));
		line(startX3,startY3,endX3,endY3);
		startX3=endX3;
		startY3=endY3;

		r=r+int(random(-15,15));
		g=g+int(random(-15,15));
		b=b+int(random(-15,15));
	}
}
void mousePressed()//more lightning bolts
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

void keyPressed()//erase and start over
{
	if(keyPressed==true && key==' ')
	{
		background(0);
		r=int(random(0,255));
		g=int(random(0,255));
		b=int(random(0,255));
	}
}
