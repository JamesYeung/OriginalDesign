int x = 250;
int y = 250;
int speed = 5;
void setup()
{
	size(500,500);
	frameRate(40);
}
void draw()
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