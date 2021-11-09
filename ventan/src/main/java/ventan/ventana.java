package ventan;
import javax.swing.JFrame;//paqueteria para poder crear las ventanas 
import javax.swing.JPanel;//para poder crear un panel
import java.awt.Color;//para poder dar color a el panel
import java.awt.Font;//PODER DARLE FORMATO A EL TEXTO 
import java.awt.Image;//PARA LA ETIQUETA CON IMAGEN 
import javax.swing.ImageIcon;//libreria para poder poner una etiqueta con imagen 
import javax.swing.JLabel;//libreria para poder generar las etiquetass
import javax.swing.SwingConstants;//para poder centrar las etiquetas 
public class ventana extends JFrame {
     public ventana(){
       // this.setSize(800,500); poder definir el tamaño de la vetana 
        setTitle("Metodo simplex");//titulo para que no aparezca en blanco 
        //setLocation(350,100);  para poder centrar el programa
        setBounds(350,100,800,500);//para poder definir el tamaño y la posicion de la vetana 
       // setLocationRelativeTo(null); para que quede centrado la ventana 
       componentes();//mandamos a llamar el metodo del panel 
        setDefaultCloseOperation(EXIT_ON_CLOSE);//para que el programa pueda cerrar automaticamente 
    }
     
     private void componentes(){
    JPanel panel= new JPanel();// para que se pueda crear un panel
    panel.setBackground(Color.ORANGE);// establecemos el color 
    panel.setLayout(null);//desactive el sieño 
    this.getContentPane().add(panel);// agregamos el panel de la ventana 
    
    JLabel l = new JLabel("Solucion del metodo simplex",SwingConstants.CENTER);// podemos crear una etiqueta 
  //  l.setText("Solucion del metodo simplex "); // poder ingresar el texto a la etiqueta 
   l.setBounds(250,1,300,20);// para poder centrar el texto de la etiqueta y tambien darle el tamaño 
   l.setForeground(Color.orange);//para poder cambiar el color del texto 
   l.setOpaque(true);//para que se pueda poner el fondo de la etiqueta 
   l.setBackground(Color.BLUE);
   l.setFont(new Font("arial",Font.BOLD,20)); /* establecemos la fuente del texto pidiendo como parametros 
  el tipo de letra ,si lo quieres en negritas o normal , el tamaño de la letra */
    

    //etiqueta con imagen 
    ImageIcon imagen= new ImageIcon("deku-ura.jpg");
    JLabel etiqueta2= new JLabel();//creamos el constructor para la imagen 
    etiqueta2.setBounds(/*horizontal --*/250,/*vertcial |*/50,/*ancho*/300,/*largo */300);// aqui define el tamaño y posicion de la imagen 
    etiqueta2.setIcon(new ImageIcon(
            imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)) );/*
    PARA PODER PONER EN ESCALA LA IMAGENE QUE QUEREMOS USAR EN LA ETIQUETA */
    panel.add(etiqueta2);// esto sirve para poder poner una etiqueta con imagen  
    panel.add(l);//con este podemos agregar la etiqueta a el panel 
    
    
}
}
