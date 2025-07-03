# Hazelcast-EX-03: Java ile Hazelcast Map Uygulaması

##  Proje Tanımı

Bu projede, Hazelcast'in Java API'si kullanılarak dağıtık bir `IMap` yapısı oluşturulmuştur. Proje kapsamında `Person` sınıfı tanımlanmış ve bu sınıftan üretilen 154 nesne Hazelcast veri yapısına eklenmiştir. Uygulama, bir Google Cloud VM (Debian) üzerinde çalıştırılmıştır.

---

##  Kullanılan Teknolojiler

-  **Google Cloud Platform** – Compute Engine VM
-  **Java 17+**
-  **Hazelcast 5.3.6**
-  **Hazelcast IMap API**

---

##  Proje Yapısı
hazelcast-ex-03/
├── HazelcastApp.java       # Hazelcast uygulamasını çalıştıran ana sınıf
├── Person.java             # Kişi nesnesi tanımı
├── hazelcast-5.3.6.jar     # Hazelcast kütüphanesi
└── README.md               # Açıklama dosyası

---

##  Kurulum ve Çalıştırma

1.  Gerekli kütüphaneyi indir:

```bash
wget https://repo1.maven.org/maven2/com/hazelcast/hazelcast/5.3.6/hazelcast-5.3.6.jar
```
2.	👨‍💻 Kaynak kodları derle:
```bash
   javac -cp .:hazelcast-5.3.6.jar HazelcastApp.java Person.java
```
3.	▶️ Uygulamayı çalıştır:
```bash
   java -cp .:hazelcast-5.3.6.jar HazelcastApp
```


