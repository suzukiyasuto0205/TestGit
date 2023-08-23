package JUnit;

public class Discount {
	public double sexCheck(String sex) {
		if (sex == "f") {
			//女性なら2割引
			return 0.2;
		} else {
			//男性なら1割引
			return 0.1;
		}
	}

	public boolean priceCheck(int price) {
		if (price >= 50000) {
			//購入額が0000円以上なら割引対象となる
			return true;
		} else {
			return false;
		}
	}

	public int ageCheck(int age) {
		if (age < 20) {
			//5000円引き
			return 5000;
		} else {
			//1000円引き
			return 1000;
		}
	}

}
