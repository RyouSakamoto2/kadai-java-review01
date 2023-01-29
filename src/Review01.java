
public class Review01 {

    public static void main(String[] args) {
        // 変数に本体価格の9999を代入
        int price = 9999;
        // 変数に税率（％）の10を代入
        int tax_rate = 10;
        // 変数を定義
        int result;
        // resultにtax_methoodの結果を代入(戻り値）
        result = tax_method(price, tax_rate);
        // 文章生成
        System.out.println(price + "円の商品の税込価格は" + (price + result) + "円（消費税は" + result + "円）です。");
    }
    
    public static int tax_method(int price, int tax_rate) {
        // 税額計算
        int result =  (int) (price * tax_rate / 100);
        return result;
       
    }
        
        
}
