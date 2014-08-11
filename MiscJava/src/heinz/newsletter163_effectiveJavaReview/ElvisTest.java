package heinz.newsletter163_effectiveJavaReview;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ElvisTest {
	private static Elvis ELVIS = Elvis.getInstance();
	private static Elvis2 ELVIS2 = Elvis2.getInstance();
	private static ElvisEnum ELVIS_ENUM = ElvisEnum.INSTANCE;
	private static ElvisType ELVIS_TYPE = ELVIS_ENUM;
	
	
	public static void main(String[] args) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			for (int i = 0; i<2 ; i++){
				ObjectOutputStream ous = new ObjectOutputStream(baos);				
				ous.writeObject(ELVIS_TYPE);
				
				byte[] serializedElvis = baos.toByteArray();
				ByteArrayInputStream bios = new ByteArrayInputStream(serializedElvis);
				ObjectInputStream ois = new ObjectInputStream(bios);
				
				ElvisType elvisRebborn = (ElvisType)ois.readObject();
				System.out.println(elvisRebborn);
			}
			
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
