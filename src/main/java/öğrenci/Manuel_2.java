package öğrenci;

public class Manuel_2 {
     /*
    Release = Canliya cikmak
​
​
TEST PLAN TEMPLATE
	Ana basliklar
1- Test stratejisi ve test edilecek bilesenler
		Test edilecek moduller (modul orn. login sayfasi, cart sayfasi)
2- Giris cikis kriterleri
		is different between expected result and actual result?
3- Hata yonetimi - Jira'da track edilir.
		1. derece hatalar sistemin genel calismasini direkt etkileyen hatalar
		2. derece hatalar sistemin genel calismasini direkt etkilemeyen ama
işlevsel olarak bazı kısımların çalışmasını engelleyen hatalardır.
		3. derece hatalar sistemin çalışmasını engellemeyen, görsel yönden ortaya çıkan
hatalardır.
4- Risk yonetimi
		Olusacak her turlu risk Proje Rist Veri Tabani ile kayit altina alinir.
		YTB dokumaninda ise test faaliyetlerinin baslamasini veya tamamlanmasini
etkileyecek her turlu risk bu kisimda belirtilmelidir.
		Test faaliyetini engelleyebileek risklerdir.
		Requirement Analys geciktiginde test adimlari ve senaryolarinin yazilmasi gecikebilir.

5- Gorev ve Sorumluluklar
		Proje kapsaminda test seviyelerine gore gorev dagilimi ve sorumluluklar bu kisimda tanimlanacaktir.
	Example:	unit test - developers/may be testers
		   	integration test - testers
		   	system test test - testers
		   	acceptance test - customers/stake holders/may be sometimes testers
6- Test ortami ve Test araclari
		Test nerede yapilacak. Windows/MacOS/Linux vb. Eger mumkunse basit sema cizilir.
		Example: Integration and system testlerinde 192.168.1.254 IP adresine sahip sunucu uzerinde yurutulecektir. Sunucuya ait bilgiler sunlardir ......
FrameWorks : JUnit (Unit test icin JUnit library kullanilir),
Selenium WebDriver (system test by automation test tool),
Apache JMeter(Non Functional olmayan testler),
Jira(track tool / hatalar report edilir.)
​
​
7- Test takvimi
Test seviyelerine gore test faaliyetlerinin baslangic bitis tahmini sureleri belirtilir.
​
​
​
​
​
​
STLC, SDLC'nin bir parcasidir. STLC(alt kume) gibi dusun.
STLC yazilim veya urun kalitesinin garanti ettigi test asamasiyla sinirlidir.
SDLC eksiksiz yazilim veya urun gelistirmede cok genis ve hayati role sahip.
STLC, SDLC'nin çok önemli bir aşamasıdır ve nihai ürün veya yazılım, STLC
sürecinden geçmeden piyasaya sürülemez.
STLC, SDLC'nin cok onemli bir asamasidir. App Test edilmeden release edilemiyor.
​
STLC surum sonrasi guncelleme dongusunun bir parcasidir.
SDLC'nin bilinen kusurların giderildiği veya yazılıma yeni işlevlerin eklendiği bakım aşamasıdır.
​
​
​
​
	What is Software Testing?
Yazilimin dogrulugunu, eksizligini ve kalitesini belirlemek icin kullanilan surectir.
Basit bir ifadeyle yazilim testi expected result ile actual result arasinda fark olup olmadigini test ederiz.
​
	Why is Software Testing important?
Sistemin arizaya neden olacak hatadan arinmis olmasi gerekir
yazilim testi olmadan kaliteye ulasilamaz, musteri gereksinimleri saglanamaz.
Nihai urunun kullanici dostu oldugundan emin olmak icin gereklidir. good review vermesi icin bunlar gerekir.
STLC yapilmadan sifir hatali urun elde etmek imkansizdir.
​
	Test turleri
1) Manuel Test
2) Automation Test
​
Manuel yapilirsa daha fazla hata bulunabilir
Otomasyona dokulurse daha hizli yapilir.
​
Manuelde otomatik bir arac kullanilmadan manuel olarak yurutulur.
Otomasyon testinden once yeni gelistirilen her yazilim icin manuel test zorunludur.
Otomasyonda ozel toollar kullanilarak expected ve actual karsilastirilir.
​
Piyasada manuel yapiliyor zamanla automationa geciliyor.
​
Example: Manuelde logine bakilir. sonra otomasyonla tekrar login'e bakilir.
Yani manuel ve automation birbirinin dusmani degildir.
Ayni amac icin kullanilabilir.
​
​
Manuelde hata verirse otomasyona gecmeye gerek yok zaten o bug reportlanir.
​
Manuel otomasyondan daha kolay. Otomasyona dokulmesinin faydasi "run" tusuna basinca hizlica calisiyo.
Manuel olmazsa dezavantaj: yeni hata bulamayiz. Otomasyonda hep ayni yeri test edip durur.
​
​
	STLC Asamalari
1- Gereksinim analizi (Requirement Analysis)
2- Test plani hazirlanmasi (Test Planning)
​
3-	Test case hazirlanmasi - epic > feature > user story > Task
	(TEST CASE'LER USER STORY'LERE GORE HAZIRLANIR)
​
4- Test ortamlarinin hazirlanmasi
5- Test running - Jenkins
6- Test isleminin tamamlanmasi.
​
	User Story - Scrum master/PO olusturur. Cok nadiren Testerlardan da isteyebiliyorlar.
Son kullanici tarafindan kullanilacak bir ozelligin (feature) yine bu kullanici tarafindan en basit ve anlasilir sekilde aciklanmasidir.
Bu aciklama gerceklestirilirken asagidaki 3 soruya cevap verilir.
​
1- Talep eden kullanici kim?
2- Telao edilen ihtiyac nedir?
3- Neden bu talebe ihtiyac var?
​
​
​
	User Story bolumleri
Hikaye tanimi (Value statement) - "paketin bitmesine 1 ay kala yenileme yapmak ister misiniz" mesaji gitmesini istiyor.
​
Kabul Kriterleri (Acceptance criterias) - Paket bitimine 1 ay kala mesajin gitmesi - basarili -- Uye-musteri eslesmesi dogru olacak
- gonderimin maili izin verenlere gitmesi. - basarili.
​
Bitti Tanimi (Definition of Done) - Kod kontrol edildi (Code review) - Unit tests yapildi - Acceptence criterias karsilandi - PO accepts user story.
​
​
​
Epic cok kapsamlidir 1 sprintte bitmez.
User story 1 spint icerisinde gelistirilebilir, teslim edilebilir.
​
EPIC = Belirli bir vizyona ulasabilmek icin hedeflerdir.
Epics yapilmasi planlanan bir veya birden fazla yeni fonksiyonlarin yahut ozelliklerin gruplandirilmasidir diyebiliriz.
Epic en genel isimdir. Epicste yapilan her sey son kullaniciya sunulmayabilir.
​
FEATURE = Epics icerisinden PO tarafindan secilerek Product Backlog'a eklenen
birden fazla user story iceren birden fazla haftada tamamlanacak modulleridir.
Son kullaniciya tamamlanmis urun olarak ulasir.
​
USER STORY = User storyler'in ne kadar surede tamamlanacagi fibonacci sayilariyla belirtilir.
Aslinda yapilacak Task'ler puanlanir.
(1 point = 1 gunluk calisma)
​
Task = Cok daha detayli yapilmasi gereken bire bir islerdir.
​
​
​
​
	WHAT IS TEST CASE ? (Test durumu nedir ?)
​
Bir test senaryosu sonunda basarili bir sonuc bekliyorsak pozitif test durumu
basarisiz test senaryosu bekliyorsak negatif test durumu olur.
Mesela negatif senaryo = login sayfasina bosluk karakteriyle girilmemesi lazim. Eger boslukla girilemiyorsa test passed olur.
​
	Definition of Done (DoD) tanimi
​
Test Typleardan bahsetti. White - Black Box testleri tekrar anlatti.
​
​
​
Testin 4 asamasi
Unit Test --> Integration Test --> System Test --> Acceptance Test
unit Test - developer - White Box
integration - developer&tester - White Box + Black Box
system Testing - tester - Black Box
user acceptance testing - End user/Customer - Black Box
	Non Functional testler, system test asamasinda yapilir. once white sonra black yapilir.
​
	Acceptance'da amac hata bulmak degil sistemin release edilmeye hazir olup olmadigina bakilir.
Genelde kullanicilar tarafindan yapilir.
Mesela ;
Test senaryosu = Internet bankaciligindan X'ten Y'ye 50 tl gondermek.
Expected result = 50 TL'nin X'ten Y'ye gecmis olmasi.
​
System testi basariyla tamamlanmis olsa da acceptance testi musteri tarafindan talep edilmektedir.
Cunku yapilan test System testi kapsamina girecekleri icin tekrarlayicidir.
Musteri productta guven duysun diye yapilir. Urun pazara hazir mi? Rekabetci mi?
​
System test, Acceptance test icin demo/review diyebiliriz.
​
​
	BUG REPORT iyi bir testerin yapmasi gereken en onemli seylerden biridir.
Acik, anlasilir ve somut olmalidir.

     */
}
