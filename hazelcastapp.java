import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

public class HazelcastApp {
    public static void main(String[] args) {
        // Hazelcast örneği başlat
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();

        // Dağıtık bir Map oluştur
        IMap<Integer, Person> map = hz.getMap("people");

        // 0–153 arası 154 tane Person nesnesi ekle
        for (int i = 0; i <= 153; i++) {
            Person person = new Person("Person" + i, i % 100);  // Yaşı 0–99 arası döndür
            map.put(i, person);
        }

        // Map içeriğini yazdır
        for (int i = 0; i <= 153; i++) {
            System.out.println(map.get(i));
        }

        // (İsteğe bağlı) Hazelcast'i durdurmak için:
        // hz.shutdown();
    }
}
