package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WorkWriteAndReadFile {
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	WRObject();
		
}
public static void WRObject() throws FileNotFoundException, IOException, ClassNotFoundException {
	int [] arrInt = {1,34,323,1,3,34};
	ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("arrInt.obj"));
	os.writeObject(arrInt);
	ObjectInputStream is = new ObjectInputStream(new FileInputStream("arrInt.obj"));
	int[] b = new int[arrInt.length];
	b = (int[]) is.readObject();
	for(int so:b) {
		System.out.print(so+" ");
	}
}
}
