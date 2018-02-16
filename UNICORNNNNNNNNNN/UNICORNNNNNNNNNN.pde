PImage rainbow;
PImage unicorn;
void setup(){
  size(1024,685);
  rainbow=loadImage("uni.png");
  unicorn=loadImage("rainbow.png");
  background(rainbow);
}
void draw (){
  background(rainbow);
  if(mousePressed){
    background(rainbow);
    image(unicorn,mouseX,mouseY);
  }
}