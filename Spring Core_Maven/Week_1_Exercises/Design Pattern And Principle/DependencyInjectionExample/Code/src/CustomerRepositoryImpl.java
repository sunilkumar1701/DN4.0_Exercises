public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        // Simulated customer lookup
        return new Customer(id, "John Doe");
    }
}
