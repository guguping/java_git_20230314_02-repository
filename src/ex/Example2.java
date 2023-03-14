package ex;

public class Example2 {

	public void numberTable() {
		System.out.println("구구단 출력");
		for (int i = 2; i <= 9; i++) {
			for (int a = 1; a <= 9; a++) {
				System.out.println(i + "*" + a + "=" + (a * i));
			}
			System.out.println();
		}
	}

}
