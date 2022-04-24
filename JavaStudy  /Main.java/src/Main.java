import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		{
//      問① 下記の配列はString型しか格納できないように修正してください。
//		   現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
	       List<String> array = new ArrayList<>();
//	    <以下記述>
	       array.add("buz");
	       array.add("bar");
	       array.add("foo");
//      問② 前から二つ目の要素を"bar"にしましょう。
//	　<以下記述>
//      問③ fooが格納されているインデックスを出力してください。
//	　<以下記述>
	       System.out.println(array.get(2));
		}

		{
//      問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
		Map<String, Object> map = new HashMap<>();
//	　<以下記述>
		map.put("address", "/////");
        map.put("name", "Kosuke");
        map.put("age", "29");
//      問⑤上記で格納したキーを繰り返し文で出力しましょう。
//	    <以下記述>
        
        
        
        
        for (Entry<String, Object> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
        }
	}
		
//      問⑦ 配列arrayDateに今の年・月・日を入れてください。
          String[] arrayDate= {"2022-04-23"};

           Calendar cal = Calendar.getInstance();
           cal.add(Calendar.MONTH, 7);
           
           //	    <以下記述>
//      問⑧ 配列arrayDateをList型に変更しましょう。
//	    <以下記述>
           List<String> arrayDate1 = new ArrayList<String>();
           arrayDate1.add("2022");
           arrayDate1.add("4");
           arrayDate1.add("23");
//      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
//	    <以下記述>
           for (int i = 0; i < arrayDate1.size(); i++) {
               System.out.println(arrayDate1.get(i));
			}
		}
}

