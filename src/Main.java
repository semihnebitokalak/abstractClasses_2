// Bir müşterinin veri tabanına kaydedilmesini sağlayacağız.
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        // customerManager.getCustomers();
        // yukarıdaki gibi çalıştırırsak hata alıcaz çünkü databasemanager ın getdatası yok ve
        // abstracttı direkt çalıştıramıyoruz.
        // işte burada stratejini kullanman lazım...
        customerManager.databaseManager = new OracleDatabaseManager();
        customerManager.getCustomers();
        customerManager.databaseManager = new SqlServerDatabaseManager();
        customerManager.getCustomers();



    }
}