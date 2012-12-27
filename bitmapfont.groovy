import java.awt.image.*;
import java.awt.*;
import javax.imageio.*;
import javax.imageio.stream.*;
image = new BufferedImage(16,16,BufferedImage.TYPE_INT_RGB)
s = 'Îº'
g = image.getGraphics()
font = new Font("ËÎÌå",Font.PLAIN,16)
g.setFont(font)
g.drawString(s,0,15)
f = new FileImageOutputStream(new File('c:\\Áõ.png'))
ImageIO.write(image,"png",f)
f.close()
i =0
16.times{x->
       
    if(x%2==0)
        i = 0 ;
    16.times{y->
       // println(x+" "+y)
        rgb = image.getRGB(y,x) 
        color = new Color(rgb)      
        isWhite = color.equals(Color.white)
        if(isWhite)
            i = i | (1<<(31-(x%2)*16-y))           

    }
    if(x%2==1){
        printf("%d, ",i)
    //    printf("%x, ",i)
        }
}
 