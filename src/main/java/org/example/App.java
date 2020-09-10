package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Display display = new Display(800, 600, "3D Renderer");
        RenderContext target = display.GetFrameBuffer();
        //Star3D star3D = new Star3D(2048, 64.0f, 20.0f);

        long previousTime = System.nanoTime();
        while (true) {
            long currentTime = System.nanoTime();

            float delta = (float) ((currentTime - previousTime) / 1000000000.0);
            previousTime = currentTime;

            target.Clear((byte)0x00);

            for (int j = 100; j < 200; j++) {
                 target.DrawScanBuffer(j, 300 - j, 300 + j);
            }

            target.FillShape(100, 200);
            //star3D.UpdateAndRender(target, delta);
            display.SwapBuffers();
        }
    }
}
