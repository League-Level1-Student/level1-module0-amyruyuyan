PImage backgroundImage;
import ddf.minim.*;
Minim minim;
AudioSample sound;
int BallX = 0;
int width = 0;
int height = 0;
void setup (){
size (500, 500);
background (#030000);
minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);
backgroundImage = loadImage("pong.png");
}

void draw (){
fill (#00FFF0);  
stroke (#00FFF0);
ellipse (BallX++, 250, 10, 10 );
background (#030000);
ellipse (BallX++, 250, 10, 10 );
sound.trigger();
image(backgroundImage, 0, 0);
image(backgroundImage, 0, 0, width, height);
fill (#C18F21);
rect (450, 450, 30, 30);
}
