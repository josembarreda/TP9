import java.io.*;
import java.util.*;
import java.text.*;
	
import javafx.application.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.event.*;
import javafx.stage.*;

public class supermarket extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception{

		Person per=new Person();
		Producto p=new Producto();
		Compra c=new Compra();
		Image image = new Image(new FileInputStream("carro.png"));
		ImageView imag = new ImageView(image); 
		imag.setX(450); 
        imag.setY(0);
        imag.setFitHeight(80); 
        imag.setFitWidth(80); 
		Rectangle rect= new Rectangle();
		rect.setX(0);
		rect.setY(0);
		rect.setWidth(1000);
		rect.setHeight(80);
		rect.setFill(Color.web("#78ED36"));
		rect.setStroke(Color.BLACK);
		rect.setStrokeType(StrokeType.OUTSIDE);
		Rectangle rect1= new Rectangle();
		rect1.setX(0);
		rect1.setY(81);
		rect1.setWidth(80);
		rect1.setHeight(350);
		rect1.setFill(Color.web("#78ED36"));
		rect1.setStroke(Color.BLACK);
		rect1.setStrokeType(StrokeType.OUTSIDE);
		Rectangle rect2= new Rectangle();
		rect2.setX(520);
		rect2.setY(81);
		rect2.setWidth(80);
		rect2.setHeight(350);
		rect2.setFill(Color.web("#78ED36"));
		rect2.setStroke(Color.BLACK);
		rect2.setStrokeType(StrokeType.OUTSIDE);
		Label lb= new Label("SUPERMARKET");
		lb.setLayoutX(10);
		lb.setLayoutY(7);
		lb.setTextFill(Color.BLACK);
		lb.setStyle(
			"-fx-font-size: 40px;"
			);
        Label opc=new Label("Que deseas hacer?");
        opc.setLayoutX(130);
        opc.setLayoutY(150);
        opc.setTextFill(Color.BLACK);
        opc.setStyle(
        	"-fx-font-size:40px;"
        	);
  		Button comprar=new Button("Comprar");
		comprar.setStyle(
			"-fx-border-color:white;"+
			"-fx-background-color:#78ED36;"+
			"-fx-font-size: 18px;"
			);
		comprar.setLayoutX(100);
    	comprar.setLayoutY(300);
		  
        Button consultar=new Button("Consultar");
		consultar.setStyle(
			"-fx-border-color:white;"+
			"-fx-background-color:#78ED36;"+
			"-fx-font-size: 18px;"
			);
		consultar.setLayoutX(250);
    	consultar.setLayoutY(300);

        Button salir=new Button("Salir");
		salir.setStyle(
			"-fx-border-color:white;"+
			"-fx-background-color:#78ED36;"+
			"-fx-font-size: 18px;"
			);
		salir.setLayoutX(400);
    	salir.setLayoutY(300);

        Group g=new Group(rect,rect1,rect2,lb,comprar,consultar,salir,opc,imag);    
        Scene scene=new Scene(g,600,400,Color.web("#B9EEA5"));
        comprar.setOnAction(new EventHandler<ActionEvent>() {  
              
        @Override  
        public void handle(ActionEvent args) {  
			Rectangle rect= new Rectangle();
			rect.setX(0);
			rect.setY(0);
			rect.setWidth(1000);
			rect.setHeight(80);
			rect.setFill(Color.web("#78ED36"));
			rect.setStroke(Color.BLACK);
			rect.setStrokeType(StrokeType.OUTSIDE);
			Rectangle rect1= new Rectangle();
			rect1.setX(0);
			rect1.setY(81);
			rect1.setWidth(80);
			rect1.setHeight(350);
			rect1.setFill(Color.web("#78ED36"));
			rect1.setStroke(Color.BLACK);
			rect1.setStrokeType(StrokeType.OUTSIDE);
			Rectangle rect2= new Rectangle();
			rect2.setX(520);
			rect2.setY(81);
			rect2.setWidth(80);
			rect2.setHeight(350);
			rect2.setFill(Color.web("#78ED36"));
			rect2.setStroke(Color.BLACK);
			rect2.setStrokeType(StrokeType.OUTSIDE);
			Label lb= new Label("SUPERMARKET");
			lb.setLayoutX(10);
			lb.setLayoutY(7);
			lb.setTextFill(Color.BLACK);
			lb.setStyle(
				"-fx-font-size: 40px;"
				); 
			Label label = new Label("Nombre: ");
			label.setLayoutX(90);
			label.setLayoutY(88);
			label.setStyle(
				"-fx-font-size: 20px;"
			);
        	TextField b1=new TextField();
        	b1.setLayoutY(85);
        	b1.setLayoutX(300);

        	Label label2 = new Label("Producto: ");
			label2.setLayoutX(90);
			label2.setLayoutY(135);
			label2.setStyle(
				"-fx-font-size: 20px;"
			);
        	TextField b2=new TextField();
        	b2.setLayoutY(135);
        	b2.setLayoutX(300);

        	Label label3 = new Label("Tipo del producto: ");
			label3.setLayoutX(90);
			label3.setLayoutY(185);
			label3.setStyle(
				"-fx-font-size: 20px;"
			);
        	TextField b3=new TextField();
        	b3.setLayoutY(185);
        	b3.setLayoutX(300);

        	Label label4 = new Label("Cantidad en kg: ");
			label4.setLayoutX(90);
			label4.setLayoutY(235);
			label4.setStyle(
				"-fx-font-size: 20px;"
			);
			final Spinner<Integer> spinner = new Spinner<Integer>();
        	SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 50,0);
        	spinner.setValueFactory(valueFactory);
        	spinner.setLayoutY(235);
        	spinner.setLayoutX(300);

        	Label label5 = new Label("Precio por kg/euros: ");
			label5.setLayoutX(90);
			label5.setLayoutY(285);
			label5.setStyle(
				"-fx-font-size: 20px;"
			);
        	TextField b5=new TextField();
        	b5.setLayoutY(285);
        	b5.setLayoutX(300);

        	Label label6 = new Label("Introduzca su ID: ");
			label6.setLayoutX(90);
			label6.setLayoutY(330);
			label6.setStyle(
				"-fx-font-size: 20px;"
			);
        	TextField b6=new TextField();
        	b6.setLayoutY(330);
        	b6.setLayoutX(300);

        	Button r=new Button("Realizar compra");
			r.setStyle(
				"-fx-border-color:white;"+
				"-fx-background-color:#78ED36;"+
				"-fx-font-size: 18px;"
				);
			r.setLayoutX(150);
    		r.setLayoutY(375);
    		System.out.println("Nombre | Producto | Precio Total | Fecha");
        	System.out.println("----------------------------------------");

			r.setOnAction(new EventHandler<ActionEvent>() {  
        	@Override  
        	public void handle(ActionEvent args) {
        		Date date = new Date();
        		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        		try{
        		FileWriter fichero = new FileWriter("datos.txt",true);
        		BufferedWriter bw= new BufferedWriter(new PrintWriter(fichero));
        		Double d=Double.parseDouble(b5.getText());
        		String st=Integer.toString(spinner.getValue());
        		Double d1=Double.parseDouble(st);
        		per.setName(b1.getText());
        		p.setPrecio(d);
        		p.setProd(b2.getText());
        		c.setCant(d1);
        		c.setPer(b1.getText());
        		c.setAp(p);
        		System.out.println(c.getPer().getName() +" | "+c.getAp().getProd()+" | "+c.getCant()*c.getAp().getPrecio()+" euros"+" | "+dateFormat.format(date));  
        		bw.write(b6.getText()+","+c.getPer().getName() +","+c.getAp().getProd()+","+c.getCant()*c.getAp().getPrecio()+","+dateFormat.format(date)+"\n");
        		bw.close();

        		}
        		catch(Exception ex){
    				ex.printStackTrace();
    			}
        		}
        	});
        	
        	Button a=new Button("Atras");
			a.setStyle(
				"-fx-border-color:white;"+
				"-fx-background-color:#78ED36;"+
				"-fx-font-size: 18px;"
				);
			a.setLayoutX(350);
    		a.setLayoutY(375);
			a.setOnAction(new EventHandler<ActionEvent>() {        
        	@Override  
        	public void handle(ActionEvent args) { 
 				primaryStage.setTitle("Realizando tp9"); 
        		primaryStage.setScene(scene); 
        		primaryStage.show();  
            	}  
        	});

			Group g2=new Group(rect,rect1,rect2,imag,lb,label,b1,label2,b2,label3,b3,label4,spinner,label5,b5,label6,b6,r,a);    
        	Scene scene2=new Scene(g2,600,430,Color.web("#B9EEA5")); 
        	primaryStage.setTitle("Realizando tp9"); 
        	primaryStage.setScene(scene2); 
        	primaryStage.show();

            }  
        });
        consultar.setOnAction(new EventHandler<ActionEvent>() {  
              
        @Override  
        public void handle(ActionEvent args) {  
            Rectangle rect= new Rectangle();
			rect.setX(0);
			rect.setY(0);
			rect.setWidth(1000);
			rect.setHeight(80);
			rect.setFill(Color.web("#78ED36"));
			rect.setStroke(Color.BLACK);
			rect.setStrokeType(StrokeType.OUTSIDE);
			Rectangle rect1= new Rectangle();
			rect1.setX(0);
			rect1.setY(81);
			rect1.setWidth(80);
			rect1.setHeight(350);
			rect1.setFill(Color.web("#78ED36"));
			rect1.setStroke(Color.BLACK);
			rect1.setStrokeType(StrokeType.OUTSIDE);
			Rectangle rect2= new Rectangle();
			rect2.setX(520);
			rect2.setY(81);
			rect2.setWidth(80);
			rect2.setHeight(350);
			rect2.setFill(Color.web("#78ED36"));
			rect2.setStroke(Color.BLACK);
			rect2.setStrokeType(StrokeType.OUTSIDE);
			Label lb= new Label("SUPERMARKET");
			lb.setLayoutX(10);
			lb.setLayoutY(7);
			lb.setTextFill(Color.BLACK);
			lb.setStyle(
				"-fx-font-size: 40px;"
				); 
			Label id = new Label("Introduce tu ID: ");
			id.setLayoutX(90);
			id.setLayoutY(88);
			id.setStyle(
				"-fx-font-size: 20px;"
			);
        	TextField bid=new TextField();
        	bid.setLayoutY(85);
        	bid.setLayoutX(300); 
        	Button aceptar=new Button("Aceptar");
			aceptar.setStyle(
			"-fx-border-color:white;"+
			"-fx-background-color:#78ED36;"+
			"-fx-font-size: 18px;"
			);
			aceptar.setLayoutX(150);
    		aceptar.setLayoutY(375);
    		System.out.println("");
    		System.out.println("Nombre | Producto | Precio Total | Fecha");
        	System.out.println("-------------------------------------");
        	aceptar.setOnAction(new EventHandler<ActionEvent>() {        
        	@Override  
        	public void handle(ActionEvent args) {  
            	try(Scanner scan=new Scanner(new FileReader("datos.txt"))){
            		String line=null;
            		while(scan.hasNext()){
              			line=scan.nextLine();
              			String[] parts= line.split(",");
              			if(parts[0].equals(bid.getText())){
        					System.out.println(parts[1] +" | "+parts[2]+" | "+parts[3]+" euros"+" | "+parts[4]); 
            			}
              		}
  				} 
  	    		catch(Exception ex){
    				ex.printStackTrace();
    			}
            	}  
        	});
        	Button a2=new Button("Atras");
			a2.setStyle(
				"-fx-border-color:white;"+
				"-fx-background-color:#78ED36;"+
				"-fx-font-size: 18px;"
				);
			a2.setLayoutX(350);
    		a2.setLayoutY(375);
			a2.setOnAction(new EventHandler<ActionEvent>() {        
        	@Override  
        	public void handle(ActionEvent args) { 
 				primaryStage.setTitle("Realizando tp9"); 
        		primaryStage.setScene(scene); 
        		primaryStage.show();  
            	}  
        	});
        	Group g3=new Group(rect,rect1,rect2,imag,lb,bid,id,aceptar,a2);    
        	Scene scene3=new Scene(g3,600,430,Color.web("#B9EEA5")); 
        	primaryStage.setTitle("Realizando tp9"); 
        	primaryStage.setScene(scene3); 
        	primaryStage.show();
            }  
        }); 
        salir.setOnAction(new EventHandler<ActionEvent>() {        
        @Override  
        public void handle(ActionEvent args) {
        	System.out.println("Vuelva pronto.");  
            System.exit(0);  
            }  
        });
        primaryStage.setTitle("Realizando tp9"); 
        primaryStage.setScene(scene); 
        primaryStage.show();  

	}

	public static void main(String[] args) {
		launch(args);
	}
}
