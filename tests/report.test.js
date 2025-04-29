import { Report } from '../src/report.js';

test('generate() returns correct message for admin session', () => {
  const mockSession = { user: 'admin' };
  const report = new Report(mockSession);
  expect(report.generate()).toBe('Report generated');
});
