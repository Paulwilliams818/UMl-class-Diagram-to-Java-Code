class Customer {
  constructor(customerId, name) {
    this.customerId = customerId;
    this.name = name;
    this.accounts = [];
  }

  getName() {
    return this.name;
  }

  linkAccount(accountId) {
    this.accounts.push(accountId);
  }
}

module.exports = Customer;
