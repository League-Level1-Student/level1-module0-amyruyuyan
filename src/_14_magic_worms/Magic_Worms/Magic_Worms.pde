int WormX;
int WormY;
int i;
int Max = 300;
void setup (){
size (500, 500);  
background (#000000);
}  


void draw (){
makeMagical();
for (int worm  = 0; worm < Max; worm++){
fill (frameCount, i, 255);  
ellipse (getWormX(worm), getWormY(worm), 7, 7);
random (500);
}
if (mousePressed){
Max++;
fill (frameCount, i, 255);  
ellipse (WormX, WormY, 7, 7);
random (500);  
}
}

float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
fill( 0, 0, 0, 10 );
rect(0, 0, width, height);
noStroke();
}

float getWormX(int i) {
return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
