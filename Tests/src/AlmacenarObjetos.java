import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class AlmacenarObjetos implements Serializable{
	private static final long serialVersionUID=1;
	private String Nombre;
	private int edad;
	private String dni;
	public AlmacenarObjetos(String nombre, int edad, String dni) {
		this.Nombre=nombre;
		this.edad=edad;
		this.dni=dni;	
	}
	public static void setEscritura() throws IOException{
		File f=new File("datos.obj");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(new AlmacenarObjetos("Pepe",20,"20"));
		oos.close();
	}
	public String getNombre() {
		return this.Nombre;
	}
	
	public static void lectura() throws ClassNotFoundException, IOException{
		ObjectInputStream ois=null;
		try {
			File f=new File("datos.obj");
			FileInputStream fis= new FileInputStream(f);
			ois= new ObjectInputStream(fis);
			while(true) {
				AlmacenarObjetos p=(AlmacenarObjetos) ois.readObject();
				System.out.println("Nombre: "+ p.getNombre());
			}
		}catch(IOException io){
			System.out.println("Fin");
		}finally {
			ois.close();
		}
		
		
	}
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		setEscritura();
		lectura();
	}

}
