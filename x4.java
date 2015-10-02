//Christopher Clark - Button Background Color change project
//Sept 30, 2015

//Setup
void setup() {
  size(640, 480);
}

//Setup Scenes
void draw() {
  scene1 ();
  //scene2 ();
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

/*
void scene2 () {
 mouseClicked() {
 if (rect(350, 193, 105, 45));
 }
 else
 (background(255,0,0);
 fill(0);
  text("System Malfuntion", 350, 250);
  text("Error Error Error", 365, 265);
  //Button
  fill(0, 255, 0);
  rect(350, 193, 105, 45);
  fill(0);
  text("I told you not to press the button...", 368, 222); ) {
  background(255,0,0);
  fill(0);
  text("System Malfuntion", 350, 250);
  text("Error Error Error", 365, 265);
  }
 */
//Handlers
void keyPressed() {
  if (key == 'q') exit();
}
