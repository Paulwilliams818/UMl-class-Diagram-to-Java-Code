import { Account } from '../src/account.js';

test('fetchDocuments returns 2 items', () => {
  const account = new Account();
  expect(account.fetchDocuments().length).toBe(2);
});
