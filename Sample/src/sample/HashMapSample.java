package sample;


import java.util.HashMap;
import java.util.Map;

public class HashMapSample {
    

    public static void main(String[] args) {
        Map<String, String> members = new HashMap<>();
        
        // HashMapにキーと値を追加
        members.put("GK", "楢崎正剛");
        members.put("DF", "中澤佑二");
        members.put("MF", "中田英寿");
        members.put("FW", "中山雅史");
        
        //要素の取得
        String fw = members.get("FW");
        System.out.println("FWは: " + fw);
        
        //要素の変更
        members.put("FW", "三浦知良"); //FW要素を置換
        System.out.println("1番目の要素　(置換後) : " +members.get("FW"));
        
        //要素の削除
        System.out.println("GKの要素　(削除前)　:" + members.get("GK"));
        members.remove("GK");//GK要素を削除
        System.out.println("GKの要素 (削除後) :" + members.get("GK"));
        
        //拡張forループによる取得:entrySet
        for (Map.Entry<String, String> entry : members.entrySet()) {
            System.out.println("entrySet キー: " + entry.getKey() +", 値: " + entry.getValue());
            
        }
        
        //拡張forループによる取得:keySet
        for (String key : members.keySet()) {
            System.out.println("keySet キー : " + key + ", 値: " +members.get(key));
            
        }
        
        //拡張forループによる取得:values
        for (String value : members.values()) {
            System.out.println("values 値: " + value);
            
        }
        //サイズの取得 
        int size = members.size();// Mapのサイズを取得
        System.out.println("Mapのサイズ (クリア前) :" +size);
        members.clear();//Mapの内容をクリア
        System.out.println("Mapのサイズ　(クリア後) :" +members.size());
        
    
    }

}
