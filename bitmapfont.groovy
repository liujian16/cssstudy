import java.awt.image.*;
import java.awt.*;
import javax.imageio.*;
import javax.imageio.stream.*;
image = new BufferedImage(16,16,BufferedImage.TYPE_INT_RGB)
s = '¡ı'
g = image.getGraphics()
font = new Font("ÀŒÃÂ",Font.PLAIN,16)
g.setFont(font)
g.drawString(s,0,15)
f = new FileImageOutputStream(new File('c:\\¡ı.png'))
ImageIO.write(image,"png",f)
f.close()
print """<!DOCTPYE html>
</html>
<head>
<style>



div.black_cell{
//float:left;
width:20px;
height:20px;
background-color:blue;
display:inline-block;
margin:0px;
}
div.white_cell{
//float:left;
width:20px;
height:20px;
background-color:black;
display:inline-block;
margin:0px;
}
div.row{
//clear:both;
padding:0px;
}
</style>
</head>
<body>
"""
16.times{x->
    print """<div class="row">"""
    i = 0 ;
    16.times{y->
       // println(x+" "+y)
        rgb = image.getRGB(y,x) 
        color = new Color(rgb)      
        isWhite = color.equals(Color.white)
        i = i | (1<<y)           
        print(
            """<div class="${isWhite?"white_cell":"black_cell"}"></div>"""
        )
    }
//    println i
    print("</div>")

}
print """</body>
</html>
"""
    