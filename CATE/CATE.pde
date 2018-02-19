PImage catPic;
int x = 532;
int y = 424;
int x2 = 438;
int y2 = 497;
int acceleration = 5;
void setup(){
  size(1000,1000);
  catPic = loadImage("cat.jpg");
  catPic.resize(1000,1000);
  background(catPic);
  if(mousePressed){
    
  }
  }
void draw(){
if(mousePressed){
  println("Mouse's x-position: " + mouseX + "\n" + "Mouse's y-position: " + mouseY + "\n");}
 fill(255,0,0);
 noStroke();
  ellipse(x,y,50,50);
  ellipse(x2,y2,50,50);
  keyPressed();
  y+=2*acceleration;
  y2+=2*acceleration;

}
  
  void keyPressed() {
    x++;
    y--;
    
    x2--;
    y2++;
    
  }
 