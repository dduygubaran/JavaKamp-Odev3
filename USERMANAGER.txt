package ödevÜç;

public class UserManager {
	

	public void login(User user) {
		System.out.println(user.getId()+ " numarasına sahip kişi sisteme giriş yapmıştır.");
	}

	public void exit(User user) {
		System.out.println(user.getId() + " numarasına sahip kişi sistemden çıkış yapmıştır.");
	}
}
