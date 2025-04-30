class Admin {
  constructor(adminId, logger) {
    this.adminId = adminId;
    this.logger = logger;
  }

  performAction(action) {
    this.logger.addEntry(action);
  }
}

module.exports = Admin;
