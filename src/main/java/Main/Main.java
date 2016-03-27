package Main;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Main {

  public static void createDisplay() {
    try {
      Display.setDisplayMode(new DisplayMode(1280, 720));
      Display.setTitle("cs32 Game");
      Display.create();
    } catch (LWJGLException e) {
      e.printStackTrace();
    }
  }

  public static void gameLoop() {
    while (!Display.isCloseRequested()) {
      Display.update();
      Display.sync(60);
    }
  }

  public static void quit() {
    Display.destroy();
    System.exit(0);
  }

  public static void main(String[] args) {
    createDisplay();
    gameLoop();
    quit();
  }
}
