//Christopher Clark - Button Background Color change project
//Sept 30, 2015

//Setup
void setup() {
  size(640, 480);
  reset();
}

//Setup Scenes
void draw() {
  scene1 ();
  mouseClicked ();
}

void reset () {
  background(0, 255, 0);
  fill(0);
  textSize(15);
  text("System Operational", 335, 255);
  text("Ready For Use", 355, 270);
  //Button
  fill(255, 0, 0);
  strokeWeight(4);
  rect(350, 193, 105, 45);
  fill(0);
  text("Do Not Press", 356, 222);
}
//Draw Scenes
void scene1 () {
  background(0, 255, 0);
  fill(0);
  textSize(15);
  text("System Operational", 335, 255);
  text("Ready For Use", 355, 270);
  //Button
  fill(255, 0, 0);
  strokeWeight(4);
  rect(350, 193, 105, 45);
  fill(0);
  text("Do Not Press", 356, 222);
}

void mouseClicked() {
  if (mouseX>=350 & mouseX<=455 & mouseY>=193 & mouseY<=238) {
    background(255,0,0);
    fill(0);
    textSize(15);
    text("System Malfuntion", 337, 255);
    text("Error Error Error", 346, 270);
    //Button
    fill(0, 255, 0);
    strokeWeight(4);
    rect(350, 193, 105, 45);
    fill(0);
    text("I told you not to press the button...", 285, 185);
    text("Pressed", 375, 222);
  }
}

//Handlers
void keyPressed() {
  if (key == 'q') exit();
  if (key == 'r') reset();
}
