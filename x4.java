//Christopher Clark - Random Color change project
//Sept 30, 2015

//Setup
void setup() {
  size(640, 480);
}
//Background
void draw() {
  background(0, 255, 0);
  fill(0);
  text("System Operational", 350, 250);
  text("Ready For Use", 365, 265);
  //Button
  fill(255, 0, 0);
  rect(350, 193, 105, 45);
  fill(0);
  text("Do Not Press", 368, 222);
}

//Handlers
void keyPressed() {
  if (key == 'q') exit();
}
void mousePressed() {
 if () {
 rect(350, 193, 105, 45);
 then()
  background(255,0,0);
  }
}
