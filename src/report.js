export class Report {
  constructor(session) {
    this.session = session;
  }

  generate() {
    return this.session?.user === 'admin' ? 'Report generated' : 'Permission denied';
  }
}
