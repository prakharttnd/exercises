import java.awt.image.BufferedImage
import javax.imageio.ImageIO

def file = new File("./tempImg/image.jpg")
BufferedImage bi = ImageIO.read(file);
ImageIO.write(bi,'jpg',new File("./image.jpg"))
