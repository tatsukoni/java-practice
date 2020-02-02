import java.io.*;

class Main {
    static String taxRate;
    static String amount;
    static int money;
    static int upperMoney;

    public static void main(String[] args) throws IOException {
        // 税率を入力させる
        System.out.println("税率を入力し[Enter/return]を押してください");
        taxRate = input();
        // 税抜き価格を入力させる
        System.out.println("税抜き価格を入力し[Enter/return]を押してください");
        amount = input();

        // 税込価格に変換する
        try {
            upperMoney = getUpperMoney(
                Integer.parseInt(taxRate),
                Integer.parseInt(amount)
            );
        } catch(Exception e) {
            System.out.println("適切でない値が入力されました。");
            upperMoney = 0;
        }

        // 税込価格を表示する
        System.out.println("税込価格は " + upperMoney + " 円です。");
    }

    // 読み込み処理
    public static String input() throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        return br.readLine();
    }

    public static int getUpperMoney(int tax, int value) throws Exception {
        return ((tax + 100) * value) / 100;
    }
}
