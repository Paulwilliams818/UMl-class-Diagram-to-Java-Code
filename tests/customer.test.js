import { Customer } from '../src/customer.js';

test('Valid login returns true', () => {
  const customer = new Customer();
  expect(customer.login('test@mail.com', 'pass')).toBe(true);
});
