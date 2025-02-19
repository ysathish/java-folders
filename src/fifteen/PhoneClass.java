package fifteen;
public class PhoneClass
{
	static String Mobile_Brand="OnePlus";
	       int Androind_Version;
	       String Security_version;
	       float Oxygen_OS;
	       String PhoneName;
	       String Screen_Resolution;
	       float Phone_Size;
	       String Back_Camera;
	       String Front_Camera;
	       int Ram;
	       int Storage;
	       public PhoneClass(int androind_Version, String security_version, float oxygen_OS, String phoneName,
				String screen_Resolution, float phone_Size, String back_Camera, String front_Camera, int ram,
				int storage) 
	       {
			
			Androind_Version = androind_Version;
			Security_version = security_version;
			Oxygen_OS = oxygen_OS;
			PhoneName = phoneName;
			Screen_Resolution = screen_Resolution;
			Phone_Size = phone_Size;
			Back_Camera = back_Camera;
			Front_Camera = front_Camera;
			Ram = ram;
			Storage = storage;
		   }
public static void main(String[] args)
 {
		PhoneClass phone=new PhoneClass(14,"nov-2024",5.4f,"Nord_3","FHD",5.5f,"50mpx","12mpx",8,128);
		System.out.println("Phone Details:\n"+PhoneClass.Mobile_Brand+"\n "+phone.Androind_Version+"\n "+phone.Back_Camera
				+" \n"+phone.Front_Camera+"\n "+phone.Oxygen_OS+"\n "+phone.Phone_Size+"\n"+phone.PhoneName+"\n "
				+phone.Security_version
				+" \n"+phone.Ram);
 }
}


