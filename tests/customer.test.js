const Customer = require('../src/Customer');

describe('Customer Class', () => {
  test('should set and return customer name', () => {
    const customer = new Customer("CUST001", "Paul");
    expect(customer.getName()).toBe("Paul");
  });

  test('should link account successfully', () => {
    const customer = new Customer("CUST002", "Alice");
    customer.linkAccount("ACC001");
    expect(customer.accounts).toContain("ACC001");
  });
});
