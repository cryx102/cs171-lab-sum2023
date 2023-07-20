package lab4.DataBase;
public class PostgresDatabase extends Database implements Transaction {

    @Override
    public void connect() {
        System.out.println("Connected to PostGres database");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from Postgres database");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing query on Postgres database: "+query);
    }

    @Override
    public void startTransaction() {
        System.out.println("Starting transaction on postgres database");
    }

    @Override
    public void commit() {
        System.out.println("Committing transaction to Postgres database");
    }

    @Override
    public void rollback() {
        System.out.println("Postgres database version rolled back");
    }
}
