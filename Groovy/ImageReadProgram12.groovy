import java.awt.image.BufferedImage
import javax.imageio.ImageIO

def file = new File("/home/prakhar/Desktop/Exercise/Groovy/tempDir/image.jpg")
BufferedImage bi = ImageIO.read(file);
ImageIO.write(bi,'jpg',new File("/home/prakhar/Desktop/Exercise/Groovy/image.jpg"))