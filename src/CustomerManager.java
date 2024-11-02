public class CustomerManager {

    BaseDatabaseManager databaseManager;
    // hangi veri tabanı sistemini verirsek onun get datası çalışacak.
    // Yukarıda yine oracle diye tanımlama yapmıyoruz çünkü ona bağlı olacak.
    // O yüzden extends edilen yani anaları olan yeri tanımlıyoruz.

    public void getCustomers() {
//        OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
//        oracleDatabaseManager.getData();
        // eğer yukarıdaki gibi yazarsak bizim customer manager oracle bağlı olacak.
        // o yüzden strateji kullanıyoruz.
        // Oluşturma işlemini class ın altında yapıyoruz.
        databaseManager.getData();
    }
}
