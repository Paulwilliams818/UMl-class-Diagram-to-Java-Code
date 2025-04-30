const Admin = require('../src/Admin');

const mockLogger = {
  addEntry: jest.fn()
};

describe('Admin Class', () => {
  test('should log action using mocked logger', () => {
    const admin = new Admin("Admin001", mockLogger);
    admin.performAction("Unlocked Account");

    expect(mockLogger.addEntry).toHaveBeenCalledWith("Unlocked Account");
  });
});
