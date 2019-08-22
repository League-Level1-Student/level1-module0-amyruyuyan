PImage recordimage;
void setup () {
size(600, 600); 
recordimage = loadImage("record.png");
recordimage.resize(600, 600);
}
void draw () {
image (recordimage, 300, 300); 
int imageangle = 0;
if (mousePressed){
rotateImage();
immageangle + 1;
}
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
