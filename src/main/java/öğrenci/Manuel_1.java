package öğrenci;

public class Manuel_1 {
    /*
      Bug tracking tool - Jira
    Bug can also be an issue, error, fault, failiure.
    Developer mistake yaptığı zaman bug ortaya çıkar.
    Developer error terimini kullanır. Error sonucunda
bug veya defect kavramı çıkar.
    Defect = App Geliştirme aşamasında ortaya çıkan kusurlardır.
    Bug = App tamamlandıktan sonra ortaya çıkan kusurlardır.
    Failiure = Hatanın ortaya çıkardığı sonuçtur.
Yani son kullanıcı tarafından hata bulunmuşsa failiure olur.
    Bug gördüğümüzde bug'dan emin olmak için
test lead'e, developar'a sorup emin olmak lazım.
    Sonra Bug Defect (Hata Düzeltme) sürecini takip etmek lazım.
    Biz "hata yoktur" demeden app live'e çıkmaz.
        BUG BULDUĞUMUZDA NE YAPMAYILIZ (Bunu sorarlar, dedi)
1-  Öncelikle bunun bir bug olduğundan emin olmak lazım.
Bunun için testi tekrarlamalı ve gerekirse başka tester var ise onun fikri alınır.
Test Lead'e haber verilir.
2-  Farklı web browser'larda denemeler yapılır.
3-  Dev ile aynı ortamda çalışıyorsak dev durumdan haberdar edilir.
Dev bunun bug olmadığını ya da bug olsa bile önemsiz olduğunu ifade edebilir.
4-  Dev dönüşüne göre hareket edilir.
        (Buraya kadar henüz bug kesinleşmediğinden bug ticket açmadık)
        BUG/DEFECT LIFE CYCLE
New = Hata ilk kez yayınlandığında Jira üzerinde "new" olur.
Assing = Hata Jira'ya gönderilince test lead/project lead
ilgili developer'a atama yapacaktır.
Open = Dev bu hatayı düzeltmek için hatayı analiz eder ve üzerinde çalışır.
Fixed = Developer gerekli kod güncellemelerini yaptığında ve hatanın düzeltilip
düzeltilmediği doğrulandığında hata durumu "fixed" olarak değişebilir ve
hata test ekibine tekrar gelir.
Pending retest = Arıza giderildikten sonre dev yeniden test için bu özel functionalityi deploy eder. Burada testler test aşamasında beklemede olur. Ve durum tekrar test etmeyi bekler.
Retest =
Varified =
Reopen =
Closed =
        BUG TICKET OLUSTURULDUGUNDA DEVELOPERLARIN CEVAPLARI
Rejected (reddedildi) = Kusur developer tarafından meşru bir kusur olarak kabul edilmezse developer tarafından "reddedildi" olarak işaretlenir.
Duplicate (çift) = Developer hatayı diğer defectlerle aynı bulursa hata turumu dev tarafından "duplicate" (çift) olarak değiştirilir.
Deferred (Ertelenmiş) = Developer, Hatanın çok önemli bir öncelik olmadığını ve sonraki sürümlerde giderilebileceğini düşünüyorsa hata durumu "Ertelenmiş" olarak değiştirilir.
Not a Bug (bug değil) = Kusurun app üzerinde işlevselliği üzerinde bir etkisi yoksa kusurun durumu "Hata değil" olarak değiştirilir.
        BUG REPORT
Hata raporlama işlemi proje yönetim aracı üzerinden gerçekleştirilebilirken
aşağıdaki başlıklardan oluşan bir dökümanda oluşturulabilir.
Bu döküman sayesinde developer hatayı daha rahat anlayabilir.
Title (Başlık)= Kısa ve öz, nokta atışı olmalıdır.
Assign To (Atama) = Bulunan hatanın kime veya takım liderine atanacağı seçilir.
Priority (Öncelik) = Yazılım test planında hatalar önceliklerine göre derecelendirilir. Hata çok önemliyse içinde bulunan sprintte halledilir. Öncelikli değilse ileriki sprinte atılabilir.
Severity (Önem derecesi) = Priority ile aynı şeydir Jirada bunun için ayrı bir seçenek yok priority yapıp geçersin.
Root Cause (Hata kaynağı) = Bulunan hatanın kaynağı belirtilmelidir. Bu bilgi ölçüm ve test için kullanılır. Ekran görüntüsü vs gibi şeyler ek yapılabilir.
Repro Steps (Adımlar) = Bulunan hatanın ilgili geliştirici tarafından tekrar simule edilebilmesi için hatanın adım adım yazılması gerekmektedir.
    Bunun için aşağıdaki örnek verebiliriz;
            a. Kullanıcı tanımlama sayfasına gidilir
            b. Ekranda yer alan tüm zorunlu alanlar doldurulur.
            c. Kaydet komutu verilir.
                expected result : kullanıcı tanımlama işleminin başarıyla tamamlandığına dair bilgilendirme mesajı verilmesi gerekir.
                actual result   : NullPointerException hata mesajı alındı.
Attachments (Ekler) = Bulunan hatanın ekran görüntüsü veya video kaydını alarak bu alana yüklenmesi
    test ekibinin hatayı geliştirme ekibine daha kolay aktarılabilmesini sağlayacaktır.
    Proje yönetim Araçları (Project management tool) nedir?
Biz Jira öğreneceğiz.
Proje takibine, yönetimine, projenin hedefe ulaşması için gereken aşamalar düzenli run edilir.
Ayrıca ekip üyelerinin iş birliği yapmasına, projeyı hızlandırmasına yardımcı olur.
Jira'yla hem otomasyon hem de manuel yapılabilir.
        Yazılım Test Planı (YTP) / Software Test Planning (STP)
Projelerde ilk önce yazılım test planı yapmak lazım. Test takvimi, giriş-çıkış kriterlerinin belirlenmesi ve benzeri.
Cloud olarak Jenkins gibi programlar kullanarak her enviromentta test etmek lazım. Git Hub'a yüklenerek de olabilir.




     */
}
