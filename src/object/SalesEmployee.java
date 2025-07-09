package object;

public class SalesEmployee {

	/**
	 * 会社名(static)
	 */
	static final String COMPANY_NAME = "株式会社〇〇";

	/**
	 * 作成したインスタンス数(static) クラス共通の変数
	 */
	static int instanceCnt = 0;

	/**
	 * 名前
	 */
	String name;

	/**
	 * 売上合計金額
	 */
	int salesAmt;

	/**
	 * コンストラクター 
	 * 名前、売上合計金額の初期化
	 * @param name 名前初期化
	 * @param salesAmt 売上合計の初期化
	 */
	SalesEmployee(String name, int salesAmt) {
		this.name = name;
		this.salesAmt = salesAmt;
		instanceCnt++; //作成したインスタンス数
		System.out.println("\nコンストラクタ内");
		System.out.println("インスタンス数" + instanceCnt);
	}

	/**
	 * 会社名の表示 (static)
	 */
	static void displayCompany() {
		System.out.println("会社名：" + COMPANY_NAME);
	}

	/**
	 * 売上合計金額
	 * @param amt　売上金額
	 * @return 　　処理後の売上合計金額
	 */
	int sell(int amt) {
		return salesAmt += amt;
	}

	/**
	 * 返品を受け付ける
	 * @param amt  返品金額
	 * @return　　　処理後の売上合計金額
	 */
	int refund(int amt) {
		return salesAmt -= amt;
	}

	/**
	 * 情報表示
	 */
	void displayInfo() {
		System.out.println("名前:" + name);
		System.out.println("売上:" + salesAmt + "円");
	}

}
