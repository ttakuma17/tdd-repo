package money;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * やりたいこと
 * 通貨の異なる２つの金額を足し、通過間の為替レートに基づいて換算された金額を得る
 *
 * Todo
 * Unassigned
 *  $5 + 10 CHF = $10 (レートが2:1の場合)
 *  amount をprivateにする
 *  Money の丸め処理
 *  equals()
 *
 * Done
 *  $5 * 2 = $ 10
 *  Dollar の副作用
 *
 */
public class MoneyTest {
  @Test
  public void testMultiplication(){
    Dollar five = new Dollar(5);
    Dollar product = five.times(2);
    assertEquals(10, product.amount);
    product = five.times(3);
    assertEquals(15, product.amount);
  }
}
