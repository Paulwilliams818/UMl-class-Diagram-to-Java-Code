const Account = require('../src/Account');

describe('Account Class', () => {
  test('should deposit correctly', () => {
    const acc = new Account("ACC123", 1000);
    acc.deposit(200);
    expect(acc.getBalance()).toBe(1200);
  });

  test('should withdraw when balance is sufficient', () => {
    const acc = new Account("ACC456", 500);
    const result = acc.withdraw(300);
    expect(result).toBe(true);
    expect(acc.getBalance()).toBe(200);
  });

  test('should not withdraw more than balance', () => {
    const acc = new Account("ACC789", 100);
    const result = acc.withdraw(200);
    expect(result).toBe(false);
    expect(acc.getBalance()).toBe(100);
  });
});
