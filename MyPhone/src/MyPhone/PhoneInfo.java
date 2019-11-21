package MyPhone;

public class PhoneInfo {
//phoneName(),phoneMieiNum(),Camera(),storage(),osName()
	private void phoneName() {
		System.out.println("Phone name is Oppo");
	}
	private void phoneImeiNum() {
		System.out.println("Phone imei is 123");
	}
	private void Camera() {
		System.out.println("Camera is 12 MP");
	}
	private void storage() {
		System.out.println("Storage is 64gb");
	}
	private void osName() {
		System.out.println("Color os");
	}
	public static void main(String[] args) {
		PhoneInfo p = new PhoneInfo();
		p.phoneName();
		p.phoneImeiNum();
		p.Camera();
		p.storage();
		p.osName();
	}
}
