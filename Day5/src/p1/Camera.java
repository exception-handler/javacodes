package p1;

import java.io.Serializable;

public class Camera {

private int megaPixel;

public Camera(int megaPixel) {
	super();
	this.megaPixel = megaPixel;
}

@Override
public String toString() {
	return "Camera [megaPixel=" + megaPixel + "]";
}

public int getMegaPixel() {
	return megaPixel;
}

public void setMegaPixel(int megaPixel) {
	this.megaPixel = megaPixel;
}



}
