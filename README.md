Bu proje, programlama dilleriyle ilgili temel işlemleri yapabilen basit bir sistemdir. Sistem, C#, Java ve Python gibi programlama dillerini ekleme, silme, güncelleme, listeleme ve id ile getirme gibi işlemleri gerçekleştirebilir.

Başlarken
Projenin çalışması için aşağıdaki adımları takip edebilirsiniz:

Gereksinimler
Java 11 veya daha üstü
Maven 3.6.3 veya daha üstü
Kurulum
Bu projeyi GitHub'dan klonlayın.
Kullanım
Uygulama başladığında, aşağıdaki API endpoint'lerini kullanarak programlama dilleriyle ilgili işlemleri gerçekleştirebilirsiniz:

GET /getall tüm programlama dillerini listeler.
GET /fetch/{id} belirli bir programlama dilini id ile getirir.
POST /add yeni bir programlama dili ekler.
PUT /update mevcut bir programlama dilini günceller.
DELETE /delete/{id} belirli bir programlama dilini siler.
Geliştirme
Yeni özellikler eklemek veya hata düzeltmeleri yapmak isterseniz, aşağıdaki adımları takip edebilirsiniz:

Kod tabanını klonlayın.

Geliştirmenizi yapın.

Değişikliklerinizi test edin.

Pull request oluşturun.
