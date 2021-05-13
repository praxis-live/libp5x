
module P5XJava2D {
    
    requires java.desktop;
    
    requires org.praxislive.libp5x.core;

    provides processing.core.PApplet.GraphicsFactory with
            processing.awt.PGraphicsJava2D.GraphicsFactory;
    
}
