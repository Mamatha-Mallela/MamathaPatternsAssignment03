package mamathaQuestion21;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class SerializationDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo object = new Demo(1, "Serailization Demo");
        String filename = "file.ser"; 
        try{   
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);        
            out.close();
            file.close();
            System.out.println("Object has been serialized");
        }        
        catch(IOException ex){
            System.out.println("IOException is caught");
        }
	}
}
class Demo implements Serializable{
	private static final long serialVersionUID = 1L;
	public int a;
    public String b;
    public Demo(int a, String b){
        this.a = a;
        this.b = b;
    }
}
