package object;

public class DriverArray {

	public static void main(String[] args) {
		//		会社名表示
		System.out.println();
		SalesEmployee.displayCompany();

		//配列要素の初期化(インスタンス化・参照値設定)
		SalesEmployee[] se = {
				new SalesEmployee("山田太郎", 200000),
				new SalesEmployee("鈴木次郎", 500000),
				new SalesEmployee("田中三郎"),
				new SalesEmployee("佐藤二朗", 120000)
		};

		int total = 0;
		for (int i = 0; i < se.length; i++) {
			System.out.println();
			se[i].displayInfo();
			total += se[i].salesAmt;
		}

		System.out.println();
		System.out.println("合計：" + total + "円");
		System.out.println("平均：" + total / se.length + "円");

	}

}
