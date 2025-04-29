export class Customer {
  login(email, password) {
    return email === "test@mail.com" && password === "pass";
  }
}
